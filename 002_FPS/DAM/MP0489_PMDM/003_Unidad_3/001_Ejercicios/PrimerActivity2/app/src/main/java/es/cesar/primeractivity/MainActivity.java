package es.cesar.primeractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textoSua,textoRoman;
    Button btn_Calcular ;
    double cuerda,radio,flecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoSua=findViewById(R.id.tv_saludarASua);
        textoRoman=findViewById(R.id.tv_saludarRoman);
        btn_Calcular=findViewById(R.id.calcular);
        textoSua.setOnClickListener(this);
        textoRoman.setOnClickListener(this);
        btn_Calcular.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

    int valor=view.getId();
        if(valor==R.id.calcular){
            try {
                cuerda = Double.parseDouble(((EditText) findViewById(R.id.cuerda)).getText().toString());
                radio = Double.parseDouble(((EditText) findViewById(R.id.radio)).getText().toString());
                radio = Math.abs(radio);
            }catch (NumberFormatException e){
                Toast.makeText(this, "Error:Ingresa valores", Toast.LENGTH_SHORT).show();

            }
            if(radio==0){
                Toast.makeText(this, "Es un recta o te falta el radio !!", Toast.LENGTH_SHORT).show();
                return;
            }else if(cuerda==0){
                Toast.makeText(this, "Introduce la cuerda MELÓN", Toast.LENGTH_SHORT).show();
                return;
            }else{
                try{
                    flecha=calcularDistanciaVertical(cuerda,radio);
                }catch (NumberFormatException e){
                    Toast.makeText(this,"Error en el calculo de la flecha",Toast.LENGTH_SHORT);
                    return;
                }
                Intent intentMaintoSegundo=new Intent(this,SegundaActivity.class);
                intentMaintoSegundo.putExtra("radio",radio);
                intentMaintoSegundo.putExtra("cuerda",cuerda);
                intentMaintoSegundo.putExtra("flecha",flecha);
                startActivity(intentMaintoSegundo);

            }
        }
        if(valor==R.id.tv_saludarASua){
            Toast.makeText(this, "SUA ", Toast.LENGTH_SHORT).show();

        }
        if(valor==R.id.tv_saludarRoman){
            Toast.makeText(this, "Roman es John Webb!!!", Toast.LENGTH_SHORT).show();
        }
    }

    private double calcularDistanciaVertical(double distancia, double radio) {
        // Calcular el ángulo en radianes
        double theta = 2 * Math.asin(distancia / (2 * radio));

        // Calcular la distancia vertical (flecha) en el punto medio
        return radio - radio * Math.cos(theta / 2);
    }
}