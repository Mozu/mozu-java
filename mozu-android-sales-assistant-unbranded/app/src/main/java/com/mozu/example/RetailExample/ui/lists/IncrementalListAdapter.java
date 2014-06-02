package com.mozu.example.RetailExample.ui.lists;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mozu.example.RetailExample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigo_alvarez on 3/3/14.
 */
public abstract class IncrementalListAdapter<P> extends BaseAdapter {

    public static interface OnFetchResultListener<P> {
        void onFetchResult(List<P> items, int start, int total);
    }

    //

    private final Object mLock = new Object();
    private final Activity mContext;
    private final int mFetchSize;
    private final SparseArray<P> mItems = new SparseArray<P>();
    private final SparseBooleanArray mRequestedItems = new SparseBooleanArray();
    private final List<AsyncTask<Void, Void, Void>> mOutstandingRequests = new ArrayList<AsyncTask<Void, Void, Void>>();
    private final Object mOutstandingRequestsLock = new Object();
    private int mTotalCount = 0;

    //

    public IncrementalListAdapter(Activity context, int fetchSize)
    {
        mContext = context;
        mFetchSize = fetchSize;
    }

    //

    @Override
    public int getCount() {
        return mTotalCount;
    }

    @Override
    public Object getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        synchronized (mLock) {

            ListHolder<P> viewHolder;

            View rowView = convertView;
            if(rowView == null) {
                // need to allocate item view holder for this row
                viewHolder = createNewListHolder();
                rowView = viewHolder.createView(mContext);
                rowView.setTag(viewHolder);
            }
            else {
                // reusing an existing view holder
                //noinspection unchecked
                viewHolder = (ListHolder<P>) rowView.getTag();
            }

            // if we already requested this item, fill with empty item
            if(mRequestedItems.get(position, false)) {
                viewHolder.fill(null);
                return rowView;
            }

            // otherwise, fill with item if it exists, or empty and request
            @SuppressWarnings("unchecked") P item = (P)getItem(position);
            viewHolder.fill(item);

            if(item == null) {
                // request starting at this position
                fetch(position, mFetchSize);
            }

            return rowView;
        }
    }

    public void initialFetch() {

        synchronized (mOutstandingRequestsLock) {
            for(AsyncTask<Void, Void, Void> request : mOutstandingRequests) {
                request.cancel(true);
            }
            mOutstandingRequests.clear();
            onLastRequestEnd();
        }

        mTotalCount = 0;
        mItems.clear();
        mRequestedItems.clear();
        notifyDataSetChanged();
        fetch(0, mFetchSize);
    }

    private void fetch(final int start, final int size) {

        // mark items as requested
        synchronized (mLock) {

            for(int i=start; i-start < size; ++i) {

                mRequestedItems.put(i, true);
            }
        }

        AsyncTask<Void, Void, Void> request = new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {

                // make request
                try {

                    fetchItems(start, size, new OnFetchResultListener<P>() {

                        @Override
                        public void onFetchResult(List<P> items, int start, int total) {
                            synchronized (mLock) {

                                // if the size changed, we invalidate all items but these
                                if(total != mTotalCount) {
                                    mItems.clear();
                                    mRequestedItems.clear();
                                    mTotalCount = total;
                                }

                                // fill and unmark requested
                                for(int i=start; i<(start+items.size()); ++i) {
                                    mRequestedItems.delete(i);
                                    mItems.put(i, items.get(i-start));
                                }

                                mContext.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        notifyDataSetChanged();
                                    }
                                });
                            }
                        }
                    });
                }
                catch(final Throwable error) {

                    // mark items unrequested
                    synchronized (mLock) {
                        for(int i=start; i<(start+size); ++i) {
                            mRequestedItems.delete(i);
                        }
                    }

                    // display error
                    if(!mContext.isFinishing()) {
                        mContext.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                new AlertDialog.Builder(mContext)
                                        .setMessage(mContext.getString(R.string.list_fetch_error_message, error.getLocalizedMessage()))
                                        .setCancelable(false)
                                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                dialogInterface.dismiss();
                                            }
                                        }).show();
                            }
                        });
                    }
                }
                finally {
                    synchronized (mOutstandingRequestsLock) {
                        mOutstandingRequests.remove(this);
                        if(mOutstandingRequests.isEmpty()) {
                            onLastRequestEnd();
                        }
                    }
                }
                return null;
            }
        };

        synchronized (mOutstandingRequestsLock) {
            if(mOutstandingRequests.isEmpty()) {
                onFirstRequestStart();
            }
            mOutstandingRequests.add(request);
        }

        request.execute();
   }


    //

    protected abstract void onFirstRequestStart();
    protected abstract void onLastRequestEnd();
    protected abstract ListHolder<P> createNewListHolder();
    protected abstract void fetchItems(int start, int size, OnFetchResultListener<P> listener) throws Exception;
}
