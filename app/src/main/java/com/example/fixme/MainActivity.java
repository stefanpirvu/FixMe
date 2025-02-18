package com.example.fixme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences datosUsuariosGuardados;
    private EditText editText_recogerUsuario;
    private EditText editText_recogerContrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datosUsuariosGuardados = getSharedPreferences("preferencias",
                Context.MODE_PRIVATE);
        String nombreUsuarioGuardado = datosUsuariosGuardados.getString("nombreUsuario", null);
        String contraseniaUsuarioGuardada = datosUsuariosGuardados.getString("contraseñaUsuario", null);
        if (nombreUsuarioGuardado != null && contraseniaUsuarioGuardada != null) {
            Intent intentAbrirDirectamenteMainActivity_Home = new Intent(MainActivity.this, MainActivity_Home.class);
            startActivity(intentAbrirDirectamenteMainActivity_Home);
            finish();
            return;
        }

        editText_recogerUsuario = findViewById(R.id.editText_recogerUsuario);
        editText_recogerContrasenia = findViewById(R.id.editText_recogerContrasenia);
        Button button_iniciarSesion = findViewById(R.id.button_iniciarSesion);
        TextView textView_crearCuenta = findViewById(R.id.textView_crearCuenta);

        button_iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_recogerUsuario.getText().toString().isEmpty() && editText_recogerContrasenia.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Campos vacíos!", Toast.LENGTH_SHORT).show();
                    return;
                } else if (editText_recogerContrasenia.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Rellena el campo de la contraseña!", Toast.LENGTH_SHORT).show();
                    return;
                } else if (editText_recogerUsuario.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Rellena el campo del usuario!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Ahora debo de controlar si ese usuario con su contraseña
                // Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                // Lo debo de implementar cuando tenga la comprobación de la DB

                // Si los datos son correctos, se guardan para iniciar el MainActivity_Home directamente

                datosUsuariosGuardados.getString("nombreUsuario", editText_recogerUsuario.getText().toString());
                datosUsuariosGuardados.getString("contraseñaUsuario", editText_recogerContrasenia.getText().toString());
                SharedPreferences.Editor editor = datosUsuariosGuardados.edit();
                editor.putString("nombreUsuario", editText_recogerUsuario.getText().toString());
                editor.putString("contraseñaUsuario", editText_recogerContrasenia.getText().toString());
                editor.apply();
                Intent intent_AbrirMainActivity_Home_DesdeMainActivity = new Intent(view.getContext(), MainActivity_Home.class);
                startActivity(intent_AbrirMainActivity_Home_DesdeMainActivity);
                return;
            }

        });

        textView_crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbrirMainActivity_CrearCuentaDesdeMainActivity = new Intent(MainActivity.this, MainActivity_CrearCuenta.class);
                startActivity(intentAbrirMainActivity_CrearCuentaDesdeMainActivity);
                finish();
            }
        });
    }
}