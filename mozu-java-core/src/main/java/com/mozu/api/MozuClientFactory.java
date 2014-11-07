package com.mozu.api;

import java.lang.reflect.Constructor;

public class MozuClientFactory<TResult>  {
    private static final String CLIENT_CLASS_NAME = "com.mozu.client.MozuClientImpl";

    public static MozuClient<?> getInstance(Class<?> clz) throws Exception {
        Constructor<? extends MozuClient> constructor =
                (Constructor<? extends MozuClient>) Class.forName(CLIENT_CLASS_NAME).getConstructor(new Class[] {Class.class});
        return (MozuClient<?>) constructor.newInstance(clz);
    }

    public static MozuClient<?> getInstance(Class<?> clz, String className) throws Exception {
        Constructor<? extends MozuClient> constructor =
                (Constructor<? extends MozuClient>) Class.forName(className).getConstructor(new Class[] {Class.class});
        return (MozuClient<?>) constructor.newInstance(clz);
    }

    public static MozuClient<?> getInstance() throws Exception {
        Constructor<? extends MozuClient> constructor = 
                (Constructor<? extends MozuClient>) Class.forName(CLIENT_CLASS_NAME).getConstructor();
        return (MozuClient<?>) constructor.newInstance();
    }
}
