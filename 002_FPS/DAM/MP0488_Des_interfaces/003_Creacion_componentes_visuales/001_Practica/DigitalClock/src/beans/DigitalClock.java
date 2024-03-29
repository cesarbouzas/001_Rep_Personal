package beans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.EventListener;

import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Cesar
 */
public class DigitalClock extends JLabel implements Serializable, ActionListener {

    private boolean format24H;
    private boolean alarmActive;
    private LocalTime alarm;
    private String AlarmMsg;
    private LocalTime time;
    private AlarmListener receptor;
    protected Timer t;
     final DateTimeFormatter Format12H = DateTimeFormatter.ofPattern("hh':'mm':'ss");
     final DateTimeFormatter Format24H = DateTimeFormatter.ofPattern("HH':'mm':'ss");  
    //The pattern dd/MM/yyyy hh:mm:ss aa is used for the 12 hour format 
    
    //the pattern MM-dd-yyyy HH:mm:ss is used for the 24 hour format.
    
     
     
     public interface AlarmListener extends EventListener{
        public void capturarAlarma(AlarmEvent ev);
    }
    
    
    
    
    public DigitalClock(){
    t=new Timer(1000,this);
    t.start();
    alarm=LocalTime.now().plusSeconds(20);//alarma sonará en un minuto
    this.setAlarmMsg("!!es hora de despertar!!!");
    this.setIsAlarmActive(true);//activamos la alarma
    }
    

    public void alarm() {

    }
    
    public boolean isFormat24H() {
        return this.format24H;
    }

    public boolean isAlarmActive() {
        return this.alarmActive;
    }

    public int getAlarmHour() {
        return this.alarm.getHour();
    }

    public int getAlarmMinute() {
        return this.alarm.getMinute();
    }

    public String getAlarmMsg() {
        return this.AlarmMsg;
    }

    public void setIsFormat24H(boolean activate) {
        this.format24H = activate;
    }
    public void setIsAlarmActive(boolean active) {
        
        this.alarmActive = active;
    }


    public void setAlarmMsg(String msg) {
        this.AlarmMsg = msg;
    }
    public void setTimeNow(){
        this.time= LocalTime.now();
        if(isAlarmActive()){
        if(isFormat24H()){
        setText(time.format(Format24H)+" PM alarma activa para las "+this.getAlarmHour()+":"+this.getAlarmMinute()+":"+this.alarm.getSecond());
        }else{ 
            if(time.getHour()<12){
             setText(time.format(Format12H)+" AM alarma activa para las "+this.getAlarmHour()+":"+this.getAlarmMinute()+":"+this.alarm.getSecond());
            }else{
              setText(time.format(Format12H)+" PM alarma activa para las "+this.getAlarmHour()+":"+this.getAlarmMinute()+":"+this.alarm.getSecond());
            }
        }
        }else{
           if(isFormat24H()){
        setText(time.format(Format24H));
        }else{ 
            if(time.getHour()<12){
              setText(time.format(Format12H)+" AM alarma inactiva");
            }else{
              setText(time.format(Format12H)+" PM alarma inactiva");
            }
        }
        }
        repaint();
    }
      

       @Override
    public void actionPerformed(ActionEvent e) {
        setTimeNow();
        if(alarmActive && time.isAfter(alarm)){
            receptor.capturarAlarma(new AlarmEvent(this));
        }
    }
    public void addAlarmListener(AlarmListener receptor){
        this.receptor=receptor;
    }
    public void removeAlarmListener(AlarmListener receptor){
        this.receptor=null;
    }
}
