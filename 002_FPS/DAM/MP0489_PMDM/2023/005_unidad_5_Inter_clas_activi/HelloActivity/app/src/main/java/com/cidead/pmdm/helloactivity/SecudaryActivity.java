package com.cidead.pmdm.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecudaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secudary);
        Bundle recogerDatos=getIntent().getExtras();//conjunto de clave valor;
        String name =recogerDatos.getString("nombre");
        int edad=recogerDatos.getInt("edad");
        Toast.makeText(this, "hola mi nombre es"+name+" y mi edad es "+edad, Toast.LENGTH_SHORT).show();
    }
}