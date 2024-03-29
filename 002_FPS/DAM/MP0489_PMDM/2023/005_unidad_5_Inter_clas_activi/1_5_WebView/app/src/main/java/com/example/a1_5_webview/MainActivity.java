package com.example.a1_5_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn_ir;
TextView txt_url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ir=(Button) findViewById(R.id.btn_ir);
        txt_url=(TextView) findViewById(R.id.editText_Url);
        btn_ir.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(this,WebViewActivity.class);
        i.putExtra("direccion",txt_url.getText().toString());
        startActivity(i);
    }
}