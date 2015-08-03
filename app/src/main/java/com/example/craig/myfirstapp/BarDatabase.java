package com.example.craig.myfirstapp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Craig on 29/07/2015.
 */
public class BarDatabase extends SQLiteOpenHelper {

    private static final String BARS = "bars.db";
    private static final String BARS_TABLE = "bars_table";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_CUSTOMER_RATING = "customer_rating";
    private static final String COLUMN_PRICE_RATING = "price_rating";
    private static final String COLUMN_ADDRESS = "address";
    private static final String COLUMN_DESCRIPTION = "description";



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+BARS_TABLE+"("+COLUMN_NAME+" TEXT, "+
                                                COLUMN_CUSTOMER_RATING+" REAL, "+
                                                COLUMN_PRICE_RATING+" REAL, "+
                                                COLUMN_ADDRESS+" TEXT, "+
                                                COLUMN_DESCRIPTION+" TEXT)";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
