package com.rodrigo.repuestos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.QuickContactBadge;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class Widgets extends AppCompatActivity {

    private Button button;
    private CheckBox cbSi, cbNo, cbOcaciones;
    private RadioGroup rbGroup;
    private RatingBar ratingBar;
    private String genero="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        button = findViewById(R.id.button);
        cbSi = findViewById(R.id.cbSi);
        cbNo = findViewById(R.id.cbNo);
        cbOcaciones = findViewById(R.id.cbOcaciones);
        rbGroup = findViewById(R.id.rbGroup);
        ratingBar = findViewById(R.id.ratingBar);

        rbGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //Toast.makeText(Widgets.this,"Se Cambio el Genero",Toast.LENGTH_LONG).show();
                if (R.id.rbFemenino == i){
                    genero = "Femenino";
                }else{
                    genero = "Masculino";
                }
                Toast.makeText(Widgets.this,"Genero: "+genero,Toast.LENGTH_LONG).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Widgets.this,"CLICK",Toast.LENGTH_LONG).show();
                float resultado = ratingBar.getRating();
                Toast.makeText(Widgets.this,"Starts: "+resultado,Toast.LENGTH_LONG).show();
            }
        });
    }
}