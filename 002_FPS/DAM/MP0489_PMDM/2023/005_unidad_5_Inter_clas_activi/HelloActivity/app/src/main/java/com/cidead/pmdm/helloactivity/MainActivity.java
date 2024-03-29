package com.cidead.pmdm.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo de vida :","Ciclo de vida onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de vida :","Ciclo de vida onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de vida :","Ciclo de vida onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de vida :","Ciclo de vida onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de vida :","Ciclo de vida onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo de vida :","Ciclo de vida onrestart");
    }

    public void lanzarActivity(View view){
        Intent intentSecundary=new Intent(this,SecudaryActivity.class);
        intentSecundary.putExtra("nombre","cesar");
        intentSecundary.putExtra("edad",45);
        startActivity(intentSecundary);
    }

    public void lanzarAlarma(View view) {
        Intent alarmaIntent=new Intent(AlarmClock.ACTION_SET_ALARM);
    alarmaIntent.putExtra(AlarmClock.EXTRA_MESSAGE,"Es hora de ir a currar");
    alarmaIntent.putExtra(AlarmClock.EXTRA_HOUR,8);
    alarmaIntent.putExtra(AlarmClock.EXTRA_MINUTES,0);
    if(alarmaIntent.resolveActivity(getPackageManager())!=null){
        startActivity(alarmaIntent);
    }
    }

    public void marcar911(View view) {
        Intent marcar911Intent=new Intent(Intent.ACTION_DIAL);
        marcar911Intent.setData(Uri.parse("tel:911"));
        if(marcar911Intent.resolveActivity(getPackageManager())!=null){
            startActivity(marcar911Intent);
        }else{
            Toast.makeText(this, "Error no tienes aplicacion y/o permisos para hacer esto", Toast.LENGTH_SHORT).show();
        }

    }
}