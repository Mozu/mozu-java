package com.mozu.api.utils;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mozu.api.MozuConfig;

public class MozuHttpClientPool {
    private static final Logger logger = LoggerFactory.getLogger(MozuHttpClientPool.class);
    private static MozuHttpClientPool mozuHttpClientPool = null;
    private final CloseableHttpClient threadSafeClient;
    private final IdleConnectionMonitorThread monitor;
    
    private MozuHttpClientPool() {
        
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        // Increase max total connection to 200
        cm.setMaxTotal(MozuConfig.getMaxHttpClientConnections());
        // Increase default max connection per route to 20
        cm.setDefaultMaxPerRoute(MozuConfig.getDefaultHttpClientMaxPerRoute());
        
        ConnectionKeepAliveStrategy myStrategy = new ConnectionKeepAliveStrategy() {
            @Override
            public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
                HeaderElementIterator it = new BasicHeaderElementIterator
                    (response.headerIterator(HTTP.CONN_KEEP_ALIVE));
                while (it.hasNext()) {
                    HeaderElement he = it.nextElement();
                    String param = he.getName();
                    String value = he.getValue();
                    if (value != null && param.equalsIgnoreCase
                       ("timeout")) {
                        return Long.parseLong(value) * 1000;
                    }
                }
                return 10 * 1000;
            }
        };
        
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(MozuConfig.getHttpClientTimeoutMillis())
                .setSocketTimeout(MozuConfig.getHttpClientTimeoutMillis())
                .setConnectionRequestTimeout(MozuConfig.getHttpClientTimeoutMillis())
                .build();

        // Build the client.
        threadSafeClient = HttpClients.custom()
                .setConnectionManager(cm)
                .useSystemProperties()
                .disableConnectionState()
                .setDefaultRequestConfig(requestConfig)
                .setKeepAliveStrategy(myStrategy)
                .build();

        monitor = new IdleConnectionMonitorThread(cm);
        
        monitor.setDaemon(true);
        monitor.start();
    }
    
    static public MozuHttpClientPool getInstance () {
        if (mozuHttpClientPool == null) {
            synchronized (MozuHttpClientPool.class) {
                if (mozuHttpClientPool == null) {
                    mozuHttpClientPool = new MozuHttpClientPool();
                }
            }
        }
        return mozuHttpClientPool;
    }
    
    /** 
     * Get the http client to use for connecting to an HTTP server.  
     * @return HttpClient
     */
    public CloseableHttpClient getHttpClient () {
        return this.threadSafeClient;
    }
    
    /**
     * Call once when destroying process to clean up http connections.
     */
    public void shutdown () {
        try {
            monitor.shutdown();
        } catch (InterruptedException ie) {
            logger.info("Intertupted shutting down HttpConnection Pooling.");
        }
    }
    
    // Watches for stale connections and evicts them.
    private class IdleConnectionMonitorThread extends Thread {
      // The manager to watch.
      private final PoolingHttpClientConnectionManager cm;
      // Use a BlockingQueue to stop everything.
      private final BlockingQueue<Stop> stopSignal = new ArrayBlockingQueue<Stop>(1);

      // Pushed up the queue.
      private class Stop {
        // The return queue.
        private final BlockingQueue<Stop> stop = new ArrayBlockingQueue<Stop>(1);

        // Called by the process that is being told to stop.
        public void stopped() {
          // Push me back up the queue to indicate we are now stopped.
          stop.add(this);
        }

        // Called by the process requesting the stop.
        public void waitForStopped() throws InterruptedException {
          // Wait until the callee acknowledges that it has stopped.
          stop.poll(30, TimeUnit.SECONDS);
        }

      }

      IdleConnectionMonitorThread(PoolingHttpClientConnectionManager cm) {
        super();
        this.cm = cm;
      }

      @Override
      public void run() {
        try {
          // Holds the stop request that stopped the process.
          Stop stopRequest;
          // Every 5 seconds.
          while ((stopRequest = stopSignal.poll(5, TimeUnit.SECONDS)) == null) {
            // Close expired connections
            cm.closeExpiredConnections();
            // Optionally, close connections that have been idle too long.
            cm.closeIdleConnections(60, TimeUnit.SECONDS);
            // Look at pool stats.
            logger.debug("Stats: {}", cm.getTotalStats());
          }
          // Acknowledge the stop request.
          stopRequest.stopped();
        } catch (InterruptedException ex) {
          // terminate
        }
      }

      public void shutdown() throws InterruptedException {
        logger.trace("Shutting down client pool");
        // Signal the stop to the thread.
        Stop stop = new Stop();
        stopSignal.add(stop);
        // Wait for the stop to complete.
        stop.waitForStopped();
        // Close the pool - Added
        try {
            threadSafeClient.close();
        } catch (IOException ioe) {
            logger.info("IO Exception while closing HttpClient connecntions.");
        }
        // Close the connection manager.
        cm.close();
        logger.trace("Client pool shut down");
      }

    }

}
