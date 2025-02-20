package com.example.fixme;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_OfrecerServicio extends AppCompatActivity {

    private EditText editText_recogerTitulo;
    private EditText editText_recogerCategoria;
    private EditText editText_recogerPrecio;
    private EditText editText_recogerDescripcion;
    private Button button_crearServicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ofrecer_servicio);

        editText_recogerTitulo = findViewById(R.id.editText_recogerTitulo);
        editText_recogerCategoria = findViewById(R.id.editText_recogerCategoria);
        editText_recogerPrecio = findViewById(R.id.editText_recogerPrecio);
        editText_recogerDescripcion = findViewById(R.id.editText_recogerDescripcion);
        button_crearServicio = findViewById(R.id.button_crearServicio);

        button_crearServicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aquí debo de recoger los datos y pasarlos al php para que se registren en la tabla servicio de la db
            }
        });
    }
}