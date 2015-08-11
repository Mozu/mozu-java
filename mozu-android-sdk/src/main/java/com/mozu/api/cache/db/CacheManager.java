package com.mozu.api.cache.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.mozu.MozuAndroid;
import com.mozu.client.MozuAndroidException;

/**
 * Created by santhosh_mankala on 8/4/15.
 */
public enum CacheManager {
    CACHE_KEY("cacheKey", "TEXT"),
    ETAG("eTag", "TEXT"),
    CONTENT("content", "TEXT");

    public final static String TABLE_NAME = "Cache";
    private String COLUMN_NAME;
    private String COLUMN_TYPE;

    CacheManager(String columnName, String columnType) {
        COLUMN_NAME = columnName;
        COLUMN_TYPE = columnType;
    }


    public static void CreateTable(SQLiteDatabase database) {
        StringBuffer CREATE_CACHE_TABLE = new StringBuffer("CREATE TABLE ");
        CREATE_CACHE_TABLE.append(TABLE_NAME + " ( ");
        CREATE_CACHE_TABLE.append(CACHE_KEY.COLUMN_NAME + "  " + CACHE_KEY.COLUMN_TYPE + " PRIMARY KEY,");
        CREATE_CACHE_TABLE.append(ETAG.COLUMN_NAME + " " + ETAG.COLUMN_TYPE + ",");
        CREATE_CACHE_TABLE.append(CONTENT.COLUMN_NAME + " " + CONTENT.COLUMN_TYPE);
        CREATE_CACHE_TABLE.append(");");
        database.execSQL(CREATE_CACHE_TABLE.toString());
    }


    public static void insertCacheItem(String eTag, String cacheKey, String content) throws MozuAndroidException {
        SQLiteDatabase sqLiteDatabase = (MozuAndroid.getInstance()).getCacheSQLiteHelper().getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(CACHE_KEY.COLUMN_NAME, cacheKey);
        cv.put(ETAG.COLUMN_NAME, eTag);
        cv.put(CONTENT.COLUMN_NAME, content);
        sqLiteDatabase.insertWithOnConflict(TABLE_NAME, null, cv, SQLiteDatabase.CONFLICT_REPLACE);
    }

    public static CacheItem checkAndGetCache(String cacheKey) throws MozuAndroidException {
        SQLiteDatabase sqLiteDatabase = (MozuAndroid.getInstance()).getCacheSQLiteHelper().getWritableDatabase();
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME, new String[]{
                CACHE_KEY.COLUMN_NAME,
                ETAG.COLUMN_NAME,
                CONTENT.COLUMN_NAME
        }, CACHE_KEY.COLUMN_NAME + "= ?", new String[]{cacheKey}, null, null, null);

        cursor.moveToFirst();
        CacheItem cacheItem = null;
        if (cursor.getCount() > 0) {
            cacheItem = new CacheItem();
            cacheItem.setKey(cursor.getString(0));
            cacheItem.seteTag(cursor.getString(1));
            cacheItem.setContent(cursor.getString(2));
        }
        return cacheItem;
    }

}
