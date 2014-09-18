package com.mozu.test.framework.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFailException extends TestException {
    private static final long serialVersionUID = 1L;
    private Logger logger = LoggerFactory.getLogger(TestFailException.class);

    public TestFailException(int actualCode, String methodName, int expectedCode, String msg) {
    	super(actualCode, methodName, expectedCode, msg);
    }
    
    @Override
    public String toString()
    {
    	String msg = super.toString();
        if(super.actualReturnCode == 403)
        {
        	return msg += String.format("\nYou may need to add the proper behavior for %s", super.clientMethodName);
        }
        return msg;
    }

}
