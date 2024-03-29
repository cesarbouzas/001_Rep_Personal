package com.cidead.pmdm.a10_checkbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.SupportActionModeWrapper;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarTipoReparacion(View view) {
    CheckBox checkBox=(CheckBox) view;
    String msg="";
        if(checkBox.isChecked()){
            switch(view.getId()){
                    case R.id.checkBoxChpa:
                        msg="Reparación de Chapa";
                    break;
                case R.id.checkBoxCristales:
                    msg="Reparación de Lunas";
                    break;
                case R.id.checkBoxMeacanica:
                    msg="Reparación mecánica";
                    break;
        }

        }else{
            msg="se ha desclikado la opcion"+((CheckBox) view).getText();
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}