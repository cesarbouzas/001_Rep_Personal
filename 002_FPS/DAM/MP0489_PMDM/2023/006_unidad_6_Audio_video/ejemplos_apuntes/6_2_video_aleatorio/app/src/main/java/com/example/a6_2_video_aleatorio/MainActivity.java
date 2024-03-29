package com.example.a6_2_video_aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn_reproducir);
        videoView=findViewById(R.id.vV_aleatorio);
        btn.setOnClickListener(this);
        Toast.makeText(this, getPackageName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        int identificador;
        int aleatorio1o2=(int)Math.floor(Math.random()*2);
        if(aleatorio1o2==0){

           identificador=R.raw.monkey1;
        }else {
            identificador=R.raw.sky1;
        }
        String rutaVideo=getPackageName()+"/"+identificador;
        Uri uri= Uri.parse(rutaVideo);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}