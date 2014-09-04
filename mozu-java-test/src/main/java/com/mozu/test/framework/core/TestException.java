package com.mozu.test.framework.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestException extends Exception {

    private static final long serialVersionUID = 1L;
    private Logger logger = LoggerFactory.getLogger(TestException.class);
 
    protected int expectedReturnCode;
    protected String message ;
    protected String clientMethodName;

    public int actualReturnCode;
    
    protected TestException(int actualCode, String methodName, int expectedCode, String msg) {
        expectedReturnCode = expectedCode;
        actualReturnCode = actualCode;
        message = msg;
        clientMethodName = methodName;

        StringBuilder sb = new StringBuilder("Method Name: ");
        sb.append(methodName).
        append(", Expected Code: ").append(expectedCode).
        append(", Actual Code: ").append(actualCode).
        append(", Message: ").append(msg);

        if (logger.isDebugEnabled()) {
            logger.debug(sb.toString());
        }
        
        sb = null;
    }

    protected TestException(String methodName, String msg)
    {
        message = msg;
        clientMethodName = methodName;
    }

    /// <summary>
    /// Retrun a string containing the general test exception information.
    /// </summary>
    /// <returns></returns>
    @Override
    public String toString()
    {
        return String.format("[%s:expected %s] but the actual return code is %s. %s", clientMethodName, expectedReturnCode, actualReturnCode, message);
    }
}

