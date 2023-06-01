package com.example.proyecdiferido;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import com.example.proyecdiferido.PantallaMenu;


public class DatabaseHelper extends SQLiteOpenHelper {
    private static  final  String DatabaseNombre = "BDProyec";
    public static  final String TableLogin ="TableLogin";

    public DatabaseHelper(@Nullable Context context) {

        super(context, DatabaseNombre, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /*/SQLiteDatabase.execSQL("create Table" + TableLogin + "(" +
                " ID INTEGER ,"+
                "nombre text, " +
               "genero text )"
         );  */
        String TB_LOGIN= "CREATE TABLE TableLogin( ID INTEGER NOT NULL,NOMBRE TEXT NOT NULL, APELLIDO TEXT NOT NULL, GENERO TEXT )";
            db.execSQL(TB_LOGIN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
