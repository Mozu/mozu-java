package com.mozu;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import com.mozu.api.cache.db.DBManager;
import com.mozu.client.MozuAndroidException;

public class MozuAndroid {

    private static MozuAndroid mMozuAndroid;

    private MozuAndroid() {
    }

    private static DBManager dbManager;


    public static void initialize(Context context) {
        dbManager = new DBManager(context);
        mMozuAndroid = new MozuAndroid();
    }

    public SQLiteOpenHelper getCacheSQLiteHelper() throws MozuAndroidException {
        if (dbManager == null) {
            throw new MozuAndroidException("MozuAndroid not initialized. Use MozuAndroid.initialize(<context>)");
        }
        return dbManager;
    }

    public static MozuAndroid getInstance() throws MozuAndroidException {
        if (mMozuAndroid == null) {
            throw new MozuAndroidException("MozuAndroid not initialized. Use MozuAndroid.initialize(<context>)");
        }
        return mMozuAndroid;
    }


}
