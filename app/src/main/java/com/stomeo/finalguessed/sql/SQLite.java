package com.stomeo.finalguessed.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLite extends SQLiteOpenHelper {

    private final String sqlCreate = "CREATE TABLE aciertos (tema text PRIMARY KEY, palabra text)";


    public SQLite(@Nullable Context context) {
        super(context, "aciertos", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int versionAnterior, int versionNueva) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS aciertos");
        sqLiteDatabase.execSQL(sqlCreate);
    }
}