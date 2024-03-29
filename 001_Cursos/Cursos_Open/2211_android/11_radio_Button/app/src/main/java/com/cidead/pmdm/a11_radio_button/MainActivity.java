package com.cidead.pmdm.a11_radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroupTipo);
    }

    public void pulsarRadioButton(View view) {
        String msg="";
        RadioButton radio=(RadioButton) view;

        switch (radio.getId()){
            case R.id.radioButtonChapa:
                msg="averia de chapa selecionada";
            break;
            case R.id.radioButtonCristales:
                msg="averia de cristales";
            break;
            case R.id.radioButtonPintura:
                msg="averia de Pintura";
                break;
        }
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();


    }

    public void pulsarBoton(View view) {
        String msg="";
        int selected=radioGroup.getCheckedRadioButtonId();

        if(selected==R.id.radioButtonChapa){
            msg="Esta seleccionado la averia de tipo chapa";
        }else if(selected==R.id.radioButtonPintura){
            msg="Está seleccionado la averia tipo pintura";
        }else{
            msg="Está selecionada la averia de tipo cristales";
        }
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}