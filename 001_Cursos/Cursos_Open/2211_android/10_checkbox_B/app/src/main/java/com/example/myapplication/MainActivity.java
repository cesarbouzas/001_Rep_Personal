package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup_aseguradoras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipoAveriaClicked(View view) {


        String msgUnCheck ="El arreglo solicitado es de ";
        String msgCheck="Se ha cancelado el arreglo de ";
        CheckBox checkBox=(CheckBox) view;
        if(checkBox.isChecked()){
            switch (checkBox.getId()){
                case R.id.checkBox_Pintura:
                    Toast.makeText(this, msgUnCheck+checkBox.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.checkBox_Cristales:
                    Toast.makeText(this, msgUnCheck+checkBox.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.checkBox_Chapa:
                    Toast.makeText(this, msgUnCheck+checkBox.getText(), Toast.LENGTH_SHORT).show();
                    break;}

        }else{
            switch (checkBox.getId()){
            case R.id.checkBox_Pintura:
                Toast.makeText(this, msgCheck+checkBox.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox_Cristales:
                Toast.makeText(this, msgCheck+checkBox.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox_Chapa:
                Toast.makeText(this, msgCheck+checkBox.getText(), Toast.LENGTH_SHORT).show();
                break;}

        }
    }

    public void aseguradoraSelected(View view) {
        RadioButton radioButton=(RadioButton) view;
        if(radioButton.isChecked()){
            switch (radioButton.getId()){
                case R.id.radioButton_Pelayo:
                    Toast.makeText(this, "Aseguradora Pelayo seleccionada", Toast.LENGTH_SHORT).show();
                    break; 
                case R.id.radioButton_Mapfre:
                    Toast.makeText(this, "Aseguradora Mapfre seleccionada", Toast.LENGTH_SHORT).show();
                    break;
            }

        }
    }

    public void verAseguradora(View view) {
        String msg_Aseguradora;
            radioGroup_aseguradoras=(RadioGroup) findViewById(R.id.radioGroup_Aseguradoras);
            int idSeleccioonado=radioGroup_aseguradoras.getCheckedRadioButtonId();
         if(idSeleccioonado==R.id.radioButton_Mapfre){
             msg_Aseguradora="Mapfre";
         }else if(idSeleccioonado==R.id.radioButton_Pelayo ){
             msg_Aseguradora="Pelayo";
         }else{
             msg_Aseguradora="ninguna";
         }
        Toast.makeText(this, "El radio-Button seleccionando es el de :"+msg_Aseguradora, Toast.LENGTH_SHORT).show();
    }

    public void botonEncendido(View view) {
        ToggleButton toggleButton=(ToggleButton) view;
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(toggleButton.isChecked()){
                    Toast.makeText(MainActivity.this, "Apago el motor", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Enciendo el motor", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}