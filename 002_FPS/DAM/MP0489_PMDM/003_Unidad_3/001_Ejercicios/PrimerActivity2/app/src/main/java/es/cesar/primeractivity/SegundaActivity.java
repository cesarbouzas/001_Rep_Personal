package es.cesar.primeractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textoSegundo;
    Button btn_Inico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        textoSegundo=findViewById(R.id.segundoTexto);
        btn_Inico=findViewById(R.id.btn_Inicio);
        btn_Inico.setOnClickListener(this);
        Bundle extras=getIntent().getExtras();

        if(extras!=null) {
            double radio = extras.getDouble("radio");
            double cuerda = extras.getDouble("cuerda");
            double flecha = extras.getDouble("flecha");
            textoSegundo.setText("Para el radio " + radio  +" m y una cuerda de "+cuerda+ " m \n la fleha es de " + flecha+" m");
        }
        }


    @Override
    public void onClick(View view) {
        int valor=view.getId();
        if(valor==R.id.btn_Inicio){
            Intent intentSegundaToMain=new Intent(this,MainActivity.class);
            startActivity(intentSegundaToMain);

        }else{
            textoSegundo.setText("Dale al boton para volver ");
        }

    }
}