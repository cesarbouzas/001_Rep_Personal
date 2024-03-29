package com.example.a10_clase_interna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new ReceptorBtn());

    }
    private class ReceptorBtn implements View.OnClickListener{


        @Override
        public void onClick(View v) {
            editText = (EditText) findViewById(R.id.editTextTextMultiLine);
            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}