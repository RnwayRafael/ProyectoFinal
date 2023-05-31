package com.example.proyecdiferido;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class ConexSQLite extends SQLiteOpenHelper {
    private static  final  String DatabaseNombre = "BDProyec";
    public static  final String TableLogin ="TableLogin";
    final String TB_LOGIN= "CREATE TABLE LOGIN( ID INTEGER NOT NULL,NOMBRE TEXT NOT NULL, APELLIDO TEXT NOT NULL, GENERO TEXT NOT NULL,PRIMARY KEY(ID ) )";
    public ConexSQLite(@Nullable Context context) {
        super(context, DatabaseNombre, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase SQLiteDatabase) {
        SQLiteDatabase.execSQL("create Table" + TableLogin + "(" +
                " ID INTEGER ,"+
                "nombre text, " +
                "genero text )"
         );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
