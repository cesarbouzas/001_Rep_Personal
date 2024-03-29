package com.example.a3_4_listview_adaptadores_personalizados;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context miContexto;
    private ArrayList<ModeloPersona> miArrayList;

    public Adaptador(Context miContexto,ArrayList<ModeloPersona> miArrayList){
        this.miArrayList=miArrayList;
        this.miContexto=miContexto;
    }

    @Override
    public int getCount() {
        return miArrayList.size();
    }

    @Override
    public ModeloPersona getItem(int i) {
        return miArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return miArrayList.get(i).getCodigo();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=LayoutInflater.from(miContexto);
        view = layoutInflater.inflate(R.layout.item, null);
        TextView nombre=(TextView)view.findViewById(R.id.tv_Nombre);
        TextView descripcion=(TextView)view.findViewById(R.id.tv_Descripcion);
        ImageView foto=(ImageView)view.findViewById(R.id.img_Foto);
        nombre.setText(miArrayList.get(i).getNombre());
        descripcion.setText((miArrayList.get(i).getDescripcion()));
        foto.setImageResource(miArrayList.get(i).getFoto());
        return view;
    }
}
