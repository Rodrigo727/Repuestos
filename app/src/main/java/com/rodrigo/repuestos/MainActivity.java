package com.rodrigo.repuestos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //creamos las variables que haran refereci a los widgets
    private TextView txtTitulo;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Realizar las referencias
        txtTitulo = findViewById(R.id.txtTitulo);
        btnIniciar = findViewById(R.id.btnIniciar);


    }
}