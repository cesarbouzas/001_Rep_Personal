package com.example.tiendaonline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase miBase;
    DatabaseReference miRef;
    ArrayList<Cliente> listaClientes;
    EditText etDNI,etNombre;
    Button btnEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDNI =findViewById(R.id.et_idDni);
        etNombre=findViewById(R.id.et_nombre);
        btnEntrar=findViewById(R.id.btn_Entrar);

        miBase=FirebaseDatabase.getInstance();
        miRef=miBase.getReference();
        listaClientes=new ArrayList<>();
        miRef.child("clientes")
                .addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.hasChildren()){
                    listaClientes.clear();
                    for(DataSnapshot data:dataSnapshot.getChildren()){
                        Cliente cli=data.getValue(Cliente.class);
                        listaClientes.add(cli);

                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        Cliente cesar=new Cliente("34896415","C001","Cesar");
        miRef.child("clientes").child(cesar.id).setValue(cesar);

    btnEntrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String in_DNI= etDNI.getText().toString();
            String in_nombre=etNombre.getText().toString();
            boolean iscorrecto=false;
            for(Cliente cli:listaClientes){
                if(cli.id.equalsIgnoreCase(in_DNI)&&cli.nombre.equalsIgnoreCase(in_nombre)){
                    iscorrecto=true;
                    Toast.makeText(MainActivity.this, "Correcto", Toast.LENGTH_SHORT).show();
                }
            }
            if(!iscorrecto){
                Toast.makeText(MainActivity.this, "Cliente no existe", Toast.LENGTH_SHORT).show();
            }
        }
    });

    }
}