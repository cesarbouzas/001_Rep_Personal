package com.example.a12_imagenes_planas_picasso_glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
ImageView logoTipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoTipo=(ImageView) findViewById(R.id.imageViewLogotipo);
        Picasso
                .get()
                .load("https://yt3.googleusercontent.com/ytc/AL5GRJWogqkXbVCo7fOr2OlQjt5a9W0e9ve8fsun7MhsEw=s176-c-k-c0x00ffffff-no-rj").into(logoTipo);

    }
}