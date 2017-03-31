package com.android1.gabriel.form3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nombre=(TextView) findViewById(R.id.nombre);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String datoNombre = (String) extras.get("nombre");

            nombre.setText("Nombre: " + datoNombre);
        }
    }
}
