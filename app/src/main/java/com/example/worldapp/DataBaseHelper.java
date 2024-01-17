package com.example.worldapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {


    public static final String DATABASE_NAME = "worldapp_database";
    public static final int DATABASE_VERSION = 1;

    //User Code

    public static final String TABLE_USER = "user";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USER_NAME = "user_name";
    public static final String COLUMN_PASSWORD = "password";
    public static final String  COLUMN_EMAIL = "email";


    //Hobbies code

    public static final String  TABLE_HOBBIES = "hobbies";
    public static final String  COLUMN_HOBBIES_ID = "hobbies_id";
    public static final String  COLUMN_HOBBIES = "hobbies";






    public DataBaseHelper(@Nullable Context context) {
        super(context,DATABASE_NAME , null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createUserTable = "CREATE TABLE " + TABLE_USER +
                "("+ COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_USER_NAME + " TEXT, " +
                COLUMN_PASSWORD + " TEXT, " +
                COLUMN_EMAIL + " TEXT)";

        db.execSQL(createUserTable);

        String createHobbiesTable = "CREATE TABLE " + TABLE_HOBBIES +
                "(" + COLUMN_HOBBIES_ID + " INTEGER, " +
                COLUMN_HOBBIES + " TEXT, " +
                "FOREIGN KEY(" + COLUMN_HOBBIES_ID + ") REFERENCES " + TABLE_USER + "(" + COLUMN_ID + "))";
        db.execSQL(createHobbiesTable);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
