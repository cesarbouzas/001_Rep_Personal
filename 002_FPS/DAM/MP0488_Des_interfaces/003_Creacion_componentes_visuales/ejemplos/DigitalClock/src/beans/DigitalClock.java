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
    private int alarmHour, alarmMinute;
    private LocalTime alarm;
    private String AlarmMsg;
    private LocalTime now;
    private AlarmListener receptor;
    protected Timer t;
     final DateTimeFormatter HoraMinuto = DateTimeFormatter.ofPattern("h':'mm");
        
    
    public interface AlarmListener extends EventListener{
        public void capturarAlarma(AlarmEvent ev);
    }
    
    
    
    
    public DigitalClock(){
    
    t=new Timer(1000,this);
    setTimeNow();
    }
        public void setTimeNow(){
        this.now= LocalTime.now();
        setText(now.format(HoraMinuto));
        repaint();
        
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
        return this.alarmHour;
    }

    public int getAlarmMinute() {
        return this.alarmMinute;
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
    public void setAlarmHour(int hour) {
        
        this.alarmHour = hour;   
    }
    public void setAlarmMinute(int minute) {
        this.alarmMinute = minute;
    }

    public void setAlarmMsg(String msg) {
        this.AlarmMsg = msg;
    }


       @Override
    public void actionPerformed(ActionEvent e) {
        setTimeNow();
        receptor.capturarAlarma(new AlarmEvent(this));
          
    }
    public void addAlarmListener(AlarmListener receptor){
        this.receptor=receptor;
    }
    public void removeAlarmListener(AlarmListener receptor){
        this.receptor=null;
    }
}
