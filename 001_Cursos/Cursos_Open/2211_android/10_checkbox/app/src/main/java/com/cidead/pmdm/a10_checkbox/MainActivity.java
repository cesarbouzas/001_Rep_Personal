package com.cidead.pmdm.a10_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.FillEventHistory;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipoAveriaClick(View view) {

       CheckBox checkbox=(CheckBox) view;
       boolean checked=checkbox.isChecked();
        String tipo ="";
    //Sobre que checkBox se ha hecho click
        switch (view.getId()) {
            case R.id.checkBoxChapa:
                tipo = "Chapa y pintura";
                break;
            case R.id.checkBoxCristal:
                tipo = "Rotura cristal";
                break;
            case R.id.checkBoxMecanica:
                tipo = "Avería mecánica";
                break;
        }
            Toast.makeText(this,tipo+"(" +checked+")",Toast.LENGTH_SHORT).show();


    }
}
