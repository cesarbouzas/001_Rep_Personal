package com.example.a6_1_audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_1,tv_2,tv_3,tv_4,tv_resutado;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_1=findViewById(R.id.tv_01);
        tv_2=findViewById(R.id.tv_02);
        tv_3=findViewById(R.id.tv_03);
        tv_4=findViewById(R.id.tv_04);
        tv_resutado=findViewById(R.id.tv_resultado);
        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
        tv_3.setOnClickListener(this);
        tv_4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.tv_01):
                tv_resutado.setText("UNO");
                mp= MediaPlayer.create(this,R.raw.uno);
                break;
            case(R.id.tv_02):
                tv_resutado.setText("DOS");
                mp=MediaPlayer.create(this,R.raw.dos);
                break;
            case(R.id.tv_03):
                tv_resutado.setText("TRES");
                mp=MediaPlayer.create(this,R.raw.tres);
                break;
            case(R.id.tv_04):
                tv_resutado.setText("CUATRO");
                mp=MediaPlayer.create(this,R.raw.cuatro);
                break;
        }
        mp.start();
    }
}