package com.cidead.pmdm.a07_intent_implicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void crearAlarma(View view) {
        Intent intent =new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE,"ir al cafe")
                .putExtra(AlarmClock.EXTRA_HOUR,11)
                .putExtra(AlarmClock.EXTRA_MINUTES,30);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
            Log.i("error",getPackageManager().toString());
        }else{
            Toast.makeText(this,"no existe aplicacion para control alarma", Toast.LENGTH_LONG).show();
        }
    }

    public void llamarEmergencias(View view) {
        Intent intent =new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:112"));


            startActivity(intent);

    }
}







