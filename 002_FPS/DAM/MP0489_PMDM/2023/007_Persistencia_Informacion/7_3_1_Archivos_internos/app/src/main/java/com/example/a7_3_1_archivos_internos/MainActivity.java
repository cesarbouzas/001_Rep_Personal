package com.example.a7_3_1_archivos_internos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    Button btn_Guardar;
    TextView tv_Root;
    EditText et_text;
    final String FILENAME="data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_text=(EditText) findViewById(R.id.editTextTextMultiLine);
        tv_Root=(TextView) findViewById(R.id.tv_Root);
        File fichero=new File(FILENAME);
        try {
            InputStreamReader isr = new InputStreamReader(openFileInput(FILENAME));
            BufferedReader br= new BufferedReader(isr);
            String linea=br.readLine();
            String todo="";
            while (linea!=null){
                todo+=linea+"\n";
                linea=br.readLine();
            }
            br.close();
            isr.close();
            et_text.setText(todo);
            tv_Root.setText(fichero.getAbsolutePath()+"---"+fichero.getPath()+"---"+fichero.getCanonicalPath());


        }catch (IOException e){
            Toast.makeText(this, "No se ha podido cargar el fichero", Toast.LENGTH_SHORT).show();
        }
    }

    public void guardar(View view) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(openFileOutput(FILENAME, Context.MODE_PRIVATE));
            osw.write(et_text.getText().toString());
            osw.flush();
            osw.close();
        }catch (IOException e){
            Toast.makeText(this, "Se produjo un error al guardar los datos", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Los datos han sido guardados correctamente", Toast.LENGTH_SHORT).show();
        finish();

    //
        //  try {
        //  FileOutputStream fos=openFileOutput(FILENAME, Context.MODE_APPEND);
        //   fos.write(et_text.getText().toString().getBytes());
        //  Toast.makeText(getApplicationContext(), "Datos Guardados!", Toast.LENGTH_SHORT).show();
        // } catch (IOException e) {
        //    e.printStackTrace();
        //  }
    }
}