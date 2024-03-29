package es.cesar.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i++;
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("TAG estado","onStart");
        i++;
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("TAG estado","onPause");
        i--;
    }
    protected void onResume(){
        super.onResume();
        Log.i("TAG estado","onResume");
        i++;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG estado","on Stop");
        i--;
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("TAG estado","on destroy");
        i=-33;
    }


}