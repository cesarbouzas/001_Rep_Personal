package com.example.a3_3_listview_adaptador_string;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] nombres={"Pedro","Ana","Rosa","Mario","Pepe","Juanmi","Maria Luisa","Chispi"};
    private String[] telefonos = { "658231234", "623123400", "912334489", "918732312", "657762598", "663120043", "658237832", "923421256"};
    private ListView lv;
    private int pos;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.Lv_Contactos);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombres);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "El telefono de "+nombres[i] +"es :" +telefonos[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}