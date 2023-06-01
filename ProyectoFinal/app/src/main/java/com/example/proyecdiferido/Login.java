package com.example.proyecdiferido;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.icu.number.IntegerWidth;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Login extends AppCompatActivity {
    Context context;

    EditText user, password;
    Button btnlogin, btnregistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = this;

            user = findViewById(R.id.user);
            password = findViewById(R.id.password);
            btnlogin = findViewById(R.id.btnlogin);
            btnregistro = findViewById(R.id.btnregistrar);

            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                 if (user.getText().toString().equals("user") && password.getText().toString().equals("123")) {
                        //new ConexSQLite(Contex, contex,Prueba, 1);
                        //Intent intent = new Intent(Login.this, Registro.class);
                        //startActivity(intent);
                     Intent intent = new Intent(Login.this, PantallaMenu.class);
                     startActivity(intent);
                        Toast.makeText(Login.this, "OK!!!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Login.this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();


                    }


/*
                    //this.context=  context;
                    DatabaseHelper dbHelper = new DatabaseHelper(context);
                    SQLiteDatabase db = dbHelper.getReadableDatabase();

                    TextView id = findViewById(R.id.user);
                    String idSet = id.getText().toString();

                    String query = "SELECT * FROM TableLogin where NOMBRE=" + idSet ;

                    // Ejecuta la consulta y obtén un cursor
                    Cursor cursor = db.rawQuery(query, null);


                    // Verifica si el cursor contiene datos
                    if (cursor.moveToFirst()) {
                        do {

                          //  @SuppressLint("Range") int id = cursor.getInt(cursor.getColumnIndex("Id"));

                            Toast.makeText(Login.this, "OK!!!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this, PantallaMenu.class);
                            startActivity(intent);
                        } while (cursor.moveToNext());
                    }

                    // Cierra el cursor y la base de datos
                    cursor.close();
                    db.close();
*/
                }
            });

                    btnregistro.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Login.this, Registro.class);
                            startActivity(intent);
                        }
                    });
    }
}