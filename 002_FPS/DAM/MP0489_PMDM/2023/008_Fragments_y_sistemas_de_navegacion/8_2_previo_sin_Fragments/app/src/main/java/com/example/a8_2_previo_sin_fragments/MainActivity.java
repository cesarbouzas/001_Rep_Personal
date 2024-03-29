package com.example.a8_2_previo_sin_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton imgBtn1,imgBtn2,imgBtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtn1=(ImageButton) findViewById(R.id.imgb_1);
        imgBtn2=(ImageButton) findViewById(R.id.imgb_2);
        imgBtn3=(ImageButton) findViewById(R.id.imgb_3);
        imgBtn1.setOnClickListener(this);
        imgBtn2.setOnClickListener(this);
        imgBtn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String marcaMoto="";
        int selector=-1;
        switch(view.getId()){
            case (R.id.imgb_1):
                selector=0;
                marcaMoto="Bultaco";
                break;
            case R.id.imgb_2:
                selector=1;
                marcaMoto="Harley-Davidson";
                break;
            case R.id.imgb_3:
                selector=2;
                marcaMoto="Moto Guzzi";
                break;
            default:
                break;
        }
        Toast.makeText(getApplicationContext(), marcaMoto, Toast.LENGTH_SHORT).show();
        Intent i=new Intent(getApplicationContext(),Detalle.class);
        i.putExtra("selector",selector);
        startActivity(i);
    }
}