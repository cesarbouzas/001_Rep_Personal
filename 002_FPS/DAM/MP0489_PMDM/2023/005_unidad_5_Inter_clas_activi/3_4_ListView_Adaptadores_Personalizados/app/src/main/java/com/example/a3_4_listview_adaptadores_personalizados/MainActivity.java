package com.example.a3_4_listview_adaptadores_personalizados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private Adapter adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ModeloPersona> contactos=new ArrayList<ModeloPersona>();
        ModeloPersona m1=new ModeloPersona();
        m1.setNombre("Lorena");
        m1.setDescripcion("Tranquila y con ganas de vivir");
        m1.setCodigo(1);
        m1.setFoto(R.drawable.lorena);
        ModeloPersona m2=new ModeloPersona();
        m2.setNombre("Hijo del Cura");
        m2.setDescripcion("le gustan los perros y sin complejos");
        m2.setCodigo(2);
        m2.setFoto(R.drawable.cura);
        ModeloPersona m3=new ModeloPersona();
        m3.setNombre("Armando");
        m3.setDescripcion("Era bajo pero al final no.");
        m3.setCodigo(3);
        m3.setFoto(R.drawable.bajoperono);
        ModeloPersona m4=new ModeloPersona();
        m4.setNombre("Cesar");
        m4.setDescripcion("El fiera del StreetView");
        m4.setCodigo(4);
        m4.setFoto(R.drawable.cesar);

        contactos.add(m1);
        contactos.add(m2);
        contactos.add(m3);
        contactos.add(m4);
        adaptador=new Adaptador(this,contactos);
        lv=(ListView)findViewById(R.id.lv_Contactos);
        lv.setAdapter((ListAdapter) adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try{
                    ModeloPersona contacto=(ModeloPersona) adaptador.getItem(i);
                    Log.e("Persona",contacto.getCodigo()+"-"+contacto.getNombre());
                    Toast.makeText(getBaseContext(), "El codigo es "+contacto.getCodigo(), Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


    }
}