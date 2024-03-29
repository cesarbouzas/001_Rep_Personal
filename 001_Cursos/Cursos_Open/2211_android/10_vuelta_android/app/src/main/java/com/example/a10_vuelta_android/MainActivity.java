package com.example.a10_vuelta_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_enviar;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_enviar=(Button)findViewById(R.id.button);

        btn_enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        editText=(EditText)findViewById(R.id.edit_message);
        Toast.makeText(this, editText.getText(), Toast.LENGTH_SHORT).show();
    }
}