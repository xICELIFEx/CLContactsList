package com.example.icelife.clcontactslist.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ICELIFE on 29.10.2014.
 */
public class DatabaseManager extends SQLiteOpenHelper{

    //row defines
    private static final String CONTACTS_TABLE_UID = "_id";
    private static final String CONTACTS_TABLE_FIRST_NAME = "first_name";
    private static final String CONTACTS_TABLE_LAST_NAME = "last_name";
    private static final String CONTACTS_TABLE_PHONE_NUMBER = "phone_number";
    private static final String CONTACTS_TABLE_IMAGE = "image";

    //table defines
    private static final String CONTACTS_TABLE_NAME = "contacts_table";

    //database defines
    private static final String DATABASE_NAME = "contacts.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_DATABASE = "CREATE TABLE "
            + CONTACTS_TABLE_NAME + " ("
            + CONTACTS_TABLE_UID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + CONTACTS_TABLE_FIRST_NAME + " VARCHAR(255)"
            + CONTACTS_TABLE_LAST_NAME + " VARCHAR(255)"
            + CONTACTS_TABLE_PHONE_NUMBER + " VARCHAR(255)"
            + CONTACTS_TABLE_IMAGE + " BLOB);";

//    protected long saveBitmap(SQLiteDatabase database, Bitmap bmp)
//    {
//        int size = bmp.getRowBytes() * bmp.getHeight();
//        ByteBuffer b = ByteBuffer.allocate(size); bmp.copyPixelsToBuffer(b);
//        byte[] bytes = new byte[size];
//        b.get(bytes, 0, bytes.length);
//        ContentValues cv=new ContentValues();
//        cv.put(CHUNK, bytes);
//        this.id= database.insert(TABLE, null, cv);
//    }

    private static final String SQL_DELETE_DATABASE = "DROP TABLE IF EXISTS " + CONTACTS_TABLE_NAME;

    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != 1) {
            db.execSQL(SQL_DELETE_DATABASE );
            db.execSQL(SQL_CREATE_DATABASE);
        }
    }
}