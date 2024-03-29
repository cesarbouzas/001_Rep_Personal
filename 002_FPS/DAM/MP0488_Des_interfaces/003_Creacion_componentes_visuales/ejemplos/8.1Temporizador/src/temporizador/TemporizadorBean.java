

package temporizador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.EventListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public  class TemporizadorBean extends JLabel implements ActionListener,Serializable{    
    
    protected int tiempo;
    private final Timer t;
    private FinCuentaAtrasListener receptor;

    public interface FinCuentaAtrasListener extends EventListener
{
    public void capturarFinCuentaAtras(FinCuentaAtrasEvent ev);
    
}

    public int getTiempo() {
        return tiempo;
    }
   
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
        setText(Integer.toString(tiempo));
        repaint();
    }
    //Constructor sin argumentos. Se establece como tiempo por defecto 5 segundos.
    public TemporizadorBean() {
        
        tiempo = 5;
        t = new Timer (1000, this);
        setTiempo(tiempo);
        setActivo(true);
    }
    //Activo es en si mismo una propiedad (sin atributo subyacente)
    //Gestiona si el temporizador está¡ funcionado o no.
    public final void setActivo(boolean valor) {
        if (valor == true)
            t.start();
        else
            t.stop();
    }
    public boolean getActivo() {
        return t.isRunning();
    }

   @Override
    public void actionPerformed(ActionEvent e)
    {
        
        setTiempo(tiempo);
        tiempo--;
        if(tiempo == 0){
            setActivo(false);
            receptor.capturarFinCuentaAtras( new FinCuentaAtrasEvent(this));
        }
    }
 
    public void addFinCuentaAtrasListener(FinCuentaAtrasListener receptor){
        this.receptor = receptor;
    }

    public void removeFinCuentaAtrasListener(FinCuentaAtrasListener receptor){
        this.receptor=null;
    }
      
}
