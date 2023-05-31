package com.example.proyecdiferido;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

import org.w3c.dom.Text;

//import androix.annottation.Nullable;


public class dbInsertaLogin extends   ConexSQLite {

    Context context;

    public dbInsertaLogin(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertaLogin(Integer ID, String Nombre, String Apellido, String Genero) {
        long id= 0 ;
        try {
            ConexSQLite conexion = new ConexSQLite(context);
            SQLiteDatabase db = conexion.getWritableDatabase();



            ContentValues values = new ContentValues();
            values.put("id", ID);
            values.put("nombre", Nombre);
            values.put("apellido", Apellido);
            values.put("apellido", Apellido);
            values.put("genero", Genero);
             id = db.insert(TableLogin, null, values);


        }
        catch (Exception ex){
            ex.toString();

        }
        return id;
    }
}
