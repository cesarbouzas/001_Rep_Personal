package com.example.intentsencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn_primeraActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_primeraActivity=(Button) findViewById(R.id.btn_primeraActivity);
        btn_primeraActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(getApplicationContext(),segundaActivity.class);
        startActivity(intent);

    }
}