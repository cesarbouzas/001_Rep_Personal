package com.cidead.pmdm.a07_implicito2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.telecom.Call;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createAlarm(View v){
        Intent alarm=new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE,"Nati no te jode al levantarte")
                .putExtra(AlarmClock.EXTRA_HOUR,6)
                .putExtra(AlarmClock.EXTRA_MINUTES,0);
        if(alarm.resolveActivity(getPackageManager())!=null){
            startActivity(alarm);
        }
    }

    public void callEmergency(View v){
        Intent emergencyCall=new Intent(Intent.ACTION_DIAL);
        getIntent().setData(Uri.parse("tel:112"));

            startActivity(emergencyCall);

        }

    }


