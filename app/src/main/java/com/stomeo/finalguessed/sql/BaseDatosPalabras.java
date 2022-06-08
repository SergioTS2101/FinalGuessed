package com.stomeo.finalguessed.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class BaseDatosPalabras extends SQLite {

    public Context context;

    public BaseDatosPalabras(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarPalabra (String tema, String palabra) {

        long id = 0;

        try{
            SQLite dbHelper = new SQLite(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("tema",tema);
            values.put("palabra",palabra);

            id = db.insert("aciertos", null, values);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return id;
    }

    public Cursor consultarAciertos(String tema) throws SQLException {

        Cursor cursor;
        cursor = this.getReadableDatabase().query
                ("aciertos", new String[]
                                {"palabra"},
                        "tema like '" + tema + "'",
                        null, null, null, null);
        return cursor;
    }
}
