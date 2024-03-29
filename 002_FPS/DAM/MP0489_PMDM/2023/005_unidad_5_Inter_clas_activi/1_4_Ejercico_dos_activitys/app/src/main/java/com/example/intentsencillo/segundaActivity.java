package com.example.intentsencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segundaActivity extends AppCompatActivity implements View.OnClickListener {
Button btn_segundaActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        btn_segundaActivity=(Button) findViewById(R.id.btn_finalizar);
        btn_segundaActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //finisAffinity es solo válida desde la API16
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.JELLY_BEAN){
            finishAffinity();
        }
    }
}