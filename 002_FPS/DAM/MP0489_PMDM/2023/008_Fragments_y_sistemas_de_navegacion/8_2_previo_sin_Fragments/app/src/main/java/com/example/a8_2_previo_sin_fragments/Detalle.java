package com.example.a8_2_previo_sin_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {
TextView tvMarca,tvDescripcion;
ImageView imgvLogo,imgvFoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        tvMarca=(TextView) findViewById(R.id.tv_Marca);
        tvDescripcion=(TextView)  findViewById(R.id.tv_descripcion);
        imgvLogo=(ImageView) findViewById(R.id.imgv_logo);
        imgvFoto=(ImageView) findViewById(R.id.imgv_foto);

        Bundle bundle=getIntent().getExtras();
        int selector=bundle.getInt("selector");
        switch (selector){
            case 0:
                imgvLogo.setImageResource(R.drawable.bultaco_escudo);
                imgvFoto.setImageResource(R.drawable.bultaco);
                break;
            case 1:
                imgvLogo.setImageResource(R.drawable.harley_escudo);
                imgvFoto.setImageResource(R.drawable.harley);
                break;
            case 2:
                imgvLogo.setImageResource(R.drawable.guzzi_escudo);
                imgvFoto.setImageResource(R.drawable.guzzi);
                break;
        }
        tvMarca.setText(getResources().getStringArray(R.array.nombre)[selector]);
        tvDescripcion.setText(getResources().getStringArray(R.array.descripcion)[selector]);


    }
}