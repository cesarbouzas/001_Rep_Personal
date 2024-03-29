/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Calendar;
import java.util.EventListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Usuario
 */
public class ComponenteRelojBean extends JLabel  implements ActionListener, Serializable  {
   public boolean modo24;
  
    public boolean activar_Alarma;

    /**
     * Get the value of activar_Alarma
     *
     * @return the value of activar_Alarma
     */
    public boolean isActivar_Alarma() {
        return activar_Alarma;
    }

    /**
     * Set the value of activar_Alarma
     *
     * @param activar_Alarma new value of activar_Alarma
     */
    public void setActivar_Alarma(boolean activar_Alarma) {
        this.activar_Alarma = activar_Alarma;
    }

    public int Minutos_Alarma;

    /**
     * Get the value of Minutos_Alarma
     *
     * @return the value of Minutos_Alarma
     */
    public int getMinutos_Alarma() {
        return Minutos_Alarma;
    }

    
    public void setMinutos_Alarma(int Minutos_Alarma) {
        this.Minutos_Alarma = Minutos_Alarma;
    }

    public int Hora_Alarma;

    /**
     * Get the value of Hora_Alarma
     *
     * @return the value of Hora_Alarma
     */
    public int getHora_Alarma() {
        return Hora_Alarma;
    }

    /**
     * Set the value of Hora_Alarma
     *
     * @param Hora_Alarma new value of Hora_Alarma
     */
    public void setHora_Alarma(int Hora_Alarma) {
        this.Hora_Alarma = Hora_Alarma;
    }

     
     private final Timer t;
     private Calendar calendario;
      private DefinirAlarmaListener receptor;

    private String[] horas = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private String[] minutos = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09","10", "11", "12", "13", "14", "15", "16", "17", "18", "19","20", "21", "22", "23", "24", "25", "26", "27", "28", "29","30", "31", "32", "33", "34", "35", "36", "37", "38", "39","40", "41", "42", "43", "44", "45", "46", "47", "48", "49","50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
    private String[] segundos = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09","10", "11", "12", "13", "14", "15", "16", "17", "18", "19","20", "21", "22", "23", "24", "25", "26", "27", "28", "29","30", "31", "32", "33", "34", "35", "36", "37", "38", "39","40", "41", "42", "43", "44", "45", "46", "47", "48", "49","50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
    private String[] AMPM = {"AM", "PM"};
     public boolean isModo24() {
        return modo24;
    }

    /**
     * Set the value of modo
     *
     * @param modo new value of modo
     */
 public interface DefinirAlarmaListener extends EventListener
{
    public void capturarAlarma(DefinirAlarmaEvent ev);
    
}
    public void setModo24(boolean modo24) {
        this.modo24 = modo24;
    }
    
    public ComponenteRelojBean(){
        //por defeto el modo es a 24 horas
        modo24 = true;
        activar_Alarma=false;
        t = new Timer (1000, this);
        t.start();
        calendario = Calendar.getInstance();

        String h = horas[calendario.get(Calendar.HOUR_OF_DAY)];
        String m = minutos[calendario.get(Calendar.MINUTE)];
        String s = segundos[calendario.get(Calendar.SECOND)];
        String AM_PM = AMPM[calendario.get(Calendar.AM_PM)];
        setText(h + ":" + m + ":" + s + " " + AM_PM);

       

    }

   public void actionPerformed(ActionEvent e)
    {
        String h;
        String m;
        String s;
        String AM_PM;
        calendario = Calendar.getInstance();

        if (isModo24())
        {
            h = horas[calendario.get(Calendar.HOUR_OF_DAY)];
            m = minutos[calendario.get(Calendar.MINUTE)];
            s = segundos[calendario.get(Calendar.SECOND)];
            AM_PM = AMPM[calendario.get(Calendar.AM_PM)];
            setText(h + ":" + m + ":" + s + " " + AM_PM);
        }
        else
        {
            h = horas[calendario.get(Calendar.HOUR)];
            m = minutos[calendario.get(Calendar.MINUTE)];
            s = segundos[calendario.get(Calendar.SECOND)];
            setText(h + ":" + m + ":" + s);
        }
        repaint();
        
        /**
         *
         * Gestion de las alarmas, si coincide se lanza el evento
         *
         */
       if(activar_Alarma)
        {
           /* if(coincide(Integer.parseInt(h), Integer.parseInt(m)) )
                receptor.SuenaAlarma( new AlarmaEvent(this, mialarma.getMensaje()) );*/
            if ((Integer.parseInt(h)==Hora_Alarma) && (Integer.parseInt(m)==Minutos_Alarma)){
                receptor.capturarAlarma( new DefinirAlarmaEvent(this));
            }
        }
    }
   
     public void addDefinirAlarmaListener(DefinirAlarmaListener receptor){
        this.receptor = receptor;
    }

    public void removeDefinirAlarmaListener(DefinirAlarmaListener receptor){
        this.receptor=null;
    }
}
