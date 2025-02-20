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

public class MainActivity_CrearCuenta extends AppCompatActivity {

    private EditText editText_recogerNuevoNombre;
    private EditText editText_recogerNuevoApellido;
    private EditText editText_recogerNuevoEmail;
    private EditText editText_recogerNuevaPassword;
    private EditText editText_recogerNuevoTelefono;
    private EditText editText_recogerNuevaCiudad;
    private EditText imageView_pedirFotoPerfil;
    private Button button_crearCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_crear_cuenta);

        editText_recogerNuevoNombre = findViewById(R.id.editText_recogerNuevoNombre);
        editText_recogerNuevoApellido = findViewById(R.id.editText_recogerNuevoApellido);
        editText_recogerNuevoEmail = findViewById(R.id.editText_recogerNuevoEmail);
        editText_recogerNuevaPassword = findViewById(R.id.editText_recogerNuevaPassword);
        editText_recogerNuevoTelefono = findViewById(R.id.editText_recogerNuevoTelefono);
        editText_recogerNuevaCiudad = findViewById(R.id.editText_recogerNuevaCiudad);
//        imageView_pedirFotoPerfil = findViewById(R.id.imageView_pedirFotoPerfil);
        button_crearCuenta = findViewById(R.id.button_crearCuenta);

    }
}