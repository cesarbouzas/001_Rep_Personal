package com.example.a7_1shared_preferences;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editTextTextPersonName);
        //Creamos un objeto de la clase SharedPreferences
        //El parametro datos , con extension implicita XML será el nobre el archivo de preferencia y se almacenará dentro de la carpeta res
        //El parámetro Context.MODE_PRIVATE indica que este archivo solo podra accederse desde esta aplicacion
        SharedPreferences preferences = this.getSharedPreferences("datos", Context.MODE_PRIVATE);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Login");
        builder.setMessage("Usuario preciamente conectado: " + preferences.getString("nombre ", "no tiene todavía nombre establecido"));
        Dialog dialog = builder.create();
        dialog.show();
    }
        public void ejecutar(View v){
            SharedPreferences preferences=getSharedPreferences("datos",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=preferences.edit();
            editor.putString("nombre",editText.getText().toString());
            editor.commit();
            Toast.makeText(getApplicationContext(), "Nuevo nombre guardado", Toast.LENGTH_SHORT).show();
            finish();
        }
}