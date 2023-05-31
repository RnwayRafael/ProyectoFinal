package com.example.proyecdiferido;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user, password;
    Button btnlogin, btnregistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
                        Toast.makeText(Login.this, "OK!!!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Login.this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();


                    }
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