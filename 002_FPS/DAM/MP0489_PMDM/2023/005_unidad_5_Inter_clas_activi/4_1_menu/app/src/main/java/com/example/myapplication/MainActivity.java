package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.game_menu,menu);
        return true;
    }
    @Override


    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.itemGatos1: i = new Intent("android.intent.action.VIEW", Uri.parse("https://es.wikipedia.org/wiki/Comida_para_gatos")); //Item alimentación
                startActivity(i);
                break;
            case R.id.itemGatos2: i = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tiendanimal.es/articulos/cuidados-basicos-del-gato/")); //Item cuidados en casa
                startActivity(i);
                break;
            case R.id.itemGatos3: i = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tiendanimal.es/articulos/vacunas-para-gatos-cuales-y-cuando-ponerlas/")); //Item vacunas
                startActivity(i);
                break;
            case R.id.itemPerros: i = new Intent("android.intent.action.VIEW", Uri.parse("https://www.anipedia.net/perros/"));
                startActivity(i);
                break;
        }
        return true;
    }
}