package com.example.proyecdiferido;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageButton;


import android.widget.Button;
import android.widget.ImageView;

public class PantallaMenu extends AppCompatActivity {
    private Button myButton;
    private Button boton1512;

    private AppCompatImageButton myButton005;
    private AppCompatImageButton myButton006;
    private AppCompatImageButton myButton007;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu);

        myButton005 = findViewById(R.id.imghotel);
        myButton006 = findViewById(R.id.imgplaya);
        myButton007 = findViewById(R.id.imgcabanas);
       myButton005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón
                // Por ejemplo, mostrar un mensaje en el registro de Log
                Intent intent = new Intent(PantallaMenu.this, HotelMenu.class);
                startActivity(intent);
            }
        });


        myButton006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón
                // Por ejemplo, mostrar un mensaje en el registro de Log
                Intent intent = new Intent(PantallaMenu.this, PlayaMenu.class);
                startActivity(intent);
            }
        });



        myButton007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el botón
                // Por ejemplo, mostrar un mensaje en el registro de Log
                Intent intent = new Intent(PantallaMenu.this, CabanasMenu.class);
                startActivity(intent);
            }
        });


    }
}

        /* // Encuentra los ImageButtons por su id
        ImageButton imgHotel = findViewById(R.id.imgHotel);
        ImageButton imgPlaya = findViewById(R.id.imgPlaya);
        ImageButton imgCabana = findViewById(R.id.imgCabana);

// Establece OnClickListener para cada ImageButton
        imgHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Llama al layout activity_cabanas_menu.xml
                Intent intent = new Intent(MainActivity.this, activity_cabanas_menu.class);
                startActivity(intent);
            }
        });

        imgPlaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Llama al layout activity_cabanas_menu.xml
                Intent intent = new Intent(MainActivity.this, activity_cabanas_menu.class);
                startActivity(intent);
            }
        });

        imgCabana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Llama al layout activity_cabanas_menu.xml
                Intent intent = new Intent(MainActivity.this, activity_cabanas_menu.class);
                startActivity(intent);
            }
        });

    }*/







