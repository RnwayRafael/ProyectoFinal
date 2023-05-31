package com.example.proyecdiferido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Registro extends AppCompatActivity {

    TextView estado;
    Spinner comboGeneros;
    Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnGuardar = findViewById(R.id.btn_Salir);

        //estado=(TextView) findViewById(R.id.etiSeleccion);
        comboGeneros = (Spinner) findViewById(R.id.idspinnerGeneros);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.combo_genero, android.R.layout.simple_spinner_item);

        comboGeneros.setAdapter(adapter);


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = findViewById(R.id.txtNombre).toString();
                String apellido = findViewById(R.id.txtApellido).toString();
                String Genero = findViewById(R.id.idspinnerGeneros).toString();

                Intent intent = new Intent(Registro.this, Login.class);
                startActivity(intent);
                dbInsertaLogin classlogin = new dbInsertaLogin(Registro.this);
                long id = classlogin.insertaLogin(1,"juan","PEREZ","Masculino");

                if (id> 0 )
                {
                    Toast.makeText(Registro.this, "registro ingresado", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(Registro.this, "registro no ingresado", Toast.LENGTH_SHORT).show();
                }


            }


        });

    }

}
