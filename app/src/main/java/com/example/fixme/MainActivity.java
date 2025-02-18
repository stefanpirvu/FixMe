package com.example.fixme;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText_recogerUsuario;
    private EditText editText_recogerContrasenia;
    private Button button_iniciarSesion;
    private TextView textView_crearCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_recogerUsuario = findViewById(R.id.editText_recogerUsuario);
        editText_recogerContrasenia = findViewById(R.id.editText_recogerContrasenia);
        button_iniciarSesion = findViewById(R.id.button_iniciarSesion);
        textView_crearCuenta = findViewById(R.id.textView_crearCuenta);
    }
}