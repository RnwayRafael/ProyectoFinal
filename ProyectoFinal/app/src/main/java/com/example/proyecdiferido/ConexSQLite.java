package com.example.proyecdiferido;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class ConexSQLite extends SQLiteOpenHelper {
    final String TB_LOGIN= "CREATE TABLE LOGIN( ID INTEGER NOT NULL,NOMBRE TEXT NOT NULL, APELLIDO TEXT NOT NULL, GENERO TEXT NOT NULL,PRIMARY KEY(ID ) )";
    public ConexSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TB_LOGIN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
