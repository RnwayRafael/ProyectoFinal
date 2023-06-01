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
import android.text.TextUtils;

public class Registro extends AppCompatActivity {

    TextView estado;
    Spinner comboGeneros;
    Button btnGuardar;
    Button btnCrear;


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

        Button btnSalir = findViewById(R.id.btn_Crear);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro.this, Login.class);
                startActivity(intent);
                finish();
            }
        });


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nombre = findViewById(R.id.txtNombre);
                TextView apellido = findViewById(R.id.txtApellido);
                Spinner spinner = findViewById(R.id.idspinnerGeneros);
                String itemSeleccionado = spinner.getSelectedItem().toString();


                 String nombreSet =nombre.getText().toString();
                 String ApellidoSet = apellido.getText().toString();


          //      Toast.makeText(Registro.this, "ingrese nombre: "+ nombreSet , Toast.LENGTH_SHORT).show();
            if(TextUtils.isEmpty(nombreSet))
            {
                Toast.makeText(Registro.this, "ingrese nombre: " , Toast.LENGTH_SHORT).show();

            }
            else if (TextUtils.isEmpty(ApellidoSet)) {
                Toast.makeText(Registro.this, "ingrese apellido: " , Toast.LENGTH_SHORT).show();

            }
           else
            {

                Intent intent = new Intent(Registro.this, Login.class);
                startActivity(intent);
                dbInsertaLogin classlogin = new dbInsertaLogin(Registro.this);
                long id = classlogin.insertaLogin(1,nombre.getText().toString(),apellido.toString(),itemSeleccionado);

                if (id> 0 )
                {
                    Toast.makeText(Registro.this, "registro ingresado", Toast.LENGTH_SHORT).show();
                    //Toast.makeText(Registro.this, "Elemento seleccionado: " + itemSeleccionado, Toast.LENGTH_SHORT).show();

                }

                else
                {
                    Toast.makeText(Registro.this, "registro no ingresado", Toast.LENGTH_SHORT).show();
                }

            }

            }


        });

    }

}
