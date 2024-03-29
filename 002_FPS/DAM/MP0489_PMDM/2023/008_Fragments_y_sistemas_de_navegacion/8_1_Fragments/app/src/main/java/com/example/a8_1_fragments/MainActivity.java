package com.example.a8_1_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=this.getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction transaction=fragmentManager.beginTransaction();
        incialFragment inicialFragment=new incialFragment();
        transaction.add(R.id.LinearLayoutContenedordeFragments,inicialFragment);
        transaction.commit();


    }

    public void seleccionarFragmento(View view) {
        Fragment miFragment ;
        switch (view.getId()){
            case R.id.btn_FragmentoInicial:
                miFragment=new Fragment(R.layout.fragment_incial);
                break;
            case R.id.btn_FragmentoSegundo:
                miFragment=new Fragment(R.layout.fragment_segundo);
                break;
            case R.id.btn_FragmentoTercero:
                miFragment=new Fragment(R.layout.fragment_tercer);
                break;
            default:
                miFragment=new Fragment(R.layout.fragment_incial);
        }
        FragmentTransaction transaction2=getSupportFragmentManager().beginTransaction();
        transaction2.replace(R.id.LinearLayoutContenedordeFragments,miFragment);
        transaction2.addToBackStack(null);
        transaction2.commit();
    }
}