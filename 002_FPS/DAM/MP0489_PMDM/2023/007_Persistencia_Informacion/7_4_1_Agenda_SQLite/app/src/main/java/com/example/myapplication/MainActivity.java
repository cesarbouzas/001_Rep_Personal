package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_Isertar,btn_Borrar,btn_Actualizar,btn_Consultar,btn_ConsultarTodo;
    EditText et_Nombre,et_Direccion;
    TextView tv_Resultados;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Isertar=(Button) findViewById(R.id.btn_Insertar);
        btn_Borrar=(Button) findViewById(R.id.btn_borrar);
        btn_Actualizar=(Button) findViewById(R.id.btn_Actualizar);
        btn_Consultar=(Button) findViewById(R.id.btn_Consultar);
        btn_ConsultarTodo=(Button) findViewById(R.id.btn_ListarTodo);
        et_Nombre=(EditText) findViewById(R.id.et_Nombre);
        et_Direccion=(EditText) findViewById(R.id.et_direccion);
        tv_Resultados=(TextView) findViewById(R.id.tv_resultados);
        btn_Isertar.setOnClickListener(this);
        btn_Borrar.setOnClickListener(this);
        btn_Actualizar.setOnClickListener(this);
        btn_Consultar.setOnClickListener(this);
        btn_ConsultarTodo.setOnClickListener(this);
        //Abrimos la BD BDAgenda y la ponemos en modo escritura , si no existe la crea.
        BDAgenda bdAgenda=new BDAgenda(getApplicationContext(),"BDagenda",null,1);
        db=bdAgenda.getReadableDatabase();
    }

    @Override
    public void onClick(View view) {
    String nombre=et_Nombre.getText().toString();
    String direccion=et_Direccion.getText().toString();

        switch(view.getId()){
            case R.id.btn_Insertar:
                if(nombre.isEmpty()||direccion.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Debe introducir los valores Nombre y Direccion", Toast.LENGTH_SHORT).show();
                    break;
                }else{
                    db.execSQL("INSERT INTO agenda (nombre, direccion) VALUES('"+nombre+"','"+direccion+"');");
                    et_Nombre.setText("");
                    et_Direccion.setText("");
                    Toast.makeText(getApplicationContext(), "Registro insertado correctamente", Toast.LENGTH_SHORT).show();
                    break;
                }
            case  R.id.btn_borrar:
                if(!nombre.equals("")&&direccion.equals("")){
                    db.execSQL("DELETE FROM agenda WHERE nombre='"+nombre+"'");
                    Toast.makeText(getApplicationContext(), "registro borrado correctamente por nombre.", Toast.LENGTH_SHORT).show();
                }
                if(nombre.equals("")&&!direccion.equals("")){
                    db.execSQL("DELETE FROM agenda WHERE direccion='"+direccion+"'");
                    Toast.makeText(getApplicationContext(), "registro borrado correctamente por dirección.", Toast.LENGTH_SHORT).show();
                }
                if(!nombre.equals("")&&!direccion.equals("")){
                    db.execSQL("DELETE FROM agenda WHERE nombre='"+nombre+"AND direccion='"+direccion+"'");
                    Toast.makeText(getApplicationContext(), "registro borrado correctamente por nombre y dirección", Toast.LENGTH_SHORT).show();
                }
                et_Nombre.setText("");
                et_Direccion.setText("");
                tv_Resultados.setText("");
                break;
            case R.id.btn_Actualizar:
                db.execSQL("UPDATE agenda SET direccion='"+direccion+"' WHERE nombre='"+nombre+"'");
                Toast.makeText(getApplicationContext(), "registro actualizado correctamente por nombre", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_Consultar:
                tv_Resultados.setText("");
                if(!nombre.equals("")&&direccion.equals("")){
                Cursor cursor=db.rawQuery("SELECT * FROM agenda WHERE nombre='"+nombre+"'",null);
                if(cursor.moveToFirst()){
                    tv_Resultados.setText("");
                    do{
                        int codigo=cursor.getInt(0);
                        String name= cursor.getString(1);
                        String direction=cursor.getString(2);
                        tv_Resultados.append("codigo: "+codigo+" Nombre: "+name+" Direccion: "+direction+"\n");

                    }while(cursor.moveToNext());
                    cursor.close();
                }
            }
                if(nombre.equals("")&&!direccion.equals("")){
                    Cursor cursor=db.rawQuery("SELECT * FROM agenda WHERE direccion='"+direccion+"'",null);
                    if(cursor.moveToFirst()){
                        tv_Resultados.setText("");
                        do{
                            int codigo=cursor.getInt(0);
                            String name= cursor.getString(1);
                            String direction=cursor.getString(2);
                            tv_Resultados.append("codigo: "+codigo+" Nombre: "+name+" Direccion: "+direction+"\n");

                        }while(cursor.moveToNext());
                        cursor.close();
                    }
                }
                if(!nombre.equals("")&&!direccion.equals("")){
                    Cursor cursor=db.rawQuery("SELECT * FROM agenda WHERE nombre='"+nombre+"' AND direccion='"+direccion+"'",null);
                    if(cursor.moveToFirst()){
                        tv_Resultados.setText("");
                        do{
                            int codigo=cursor.getInt(0);
                            String name= cursor.getString(1);
                            String direction=cursor.getString(2);
                            tv_Resultados.append("codigo: "+codigo+" Nombre: "+name+" Direccion: "+direction+"\n");

                        }while(cursor.moveToNext());
                        cursor.close();
                    }
                }
                break;
            case R.id.btn_ListarTodo:
                tv_Resultados.setText("");
                Cursor cursor=db.rawQuery("SELECT * FROM agenda",null);
                if(cursor.moveToFirst()){
                    do {
                        int codigo = cursor.getInt(0);
                        String name = cursor.getString(1);
                        String direction = cursor.getString(2);
                        tv_Resultados.append("codigo: "+codigo+" Nombre: "+name+" Direccion: "+direction+"\n");
                    }while(cursor.moveToNext());
                    et_Nombre.setText("");
                    et_Direccion.setText("");

                }else{
                    Toast.makeText(this, "No existen registros", Toast.LENGTH_SHORT).show();
                }

        }
    }
}