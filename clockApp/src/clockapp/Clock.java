/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockapp;

/**
 *
 * @author it218110
 */
public class Clock {
    private int currHour;
    private int currMinutes;
    private int alarmHour;
    private int alarmMinutes;
    private String name;
    private int format;
    
    public Clock (int hours, int minutes, String nName, int format, int alhour, int almin){
        currHour = hours;
        currMinutes = minutes;
        name = nName;
        alarmHour = alhour;
        alarmMinutes = almin;
    }
    
    // sets clock hour 
    public int getClockHour(){
        return currHour;
    }
    
    public void setClockHour(int newValue){
        currHour = newValue;
    }
    
    // sets clock minutes
    public int getClockMinutes(){
        return currMinutes;
    }
    
    public void setClockMinutes(int newValue){
        currMinutes = newValue;
    }
    
    // sets alarm hour
    public int getAlarmHour(){
        return alarmHour;
    }
    
    public void setAlarmHour(int newValue){
        alarmHour = newValue;
    }
    
    // sets alarm minutes
    public int getAlarmMinutes(){
        return alarmMinutes;
    }
    
    public void setAlarmMinutes(int newValue){
        alarmMinutes = newValue;
    }
    
    // sets clock format 
    public int getFormat(){
        return format;
    }
    
    public void setFormat(int newValue){
        format = newValue;
    }
    
    // sets name
    public String getName(){
        return name;
    }
    
    public void setName(String newValue){
        name = newValue;
    }
    
    
    public void telltime(){
        System.out.printf("the time is %d:%d\n", currHour, currMinutes);
    }
    
    public void alarm(){
        System.out.printf("the alarm is set at %d:%d\n", alarmHour, alarmMinutes);
    }
    
    public void advancedTime(int duration){
        currHour+=duration/60;
        if (currMinutes+duration%60>=60 ){
            currHour+=1;
            currMinutes+=duration;
        }
        else{
            currMinutes+=duration%60;
        }
    }
            
    public void advancedTimeAl(int duration1){
        alarmHour+=duration1/60;
        if (alarmMinutes+duration1%60>=60 ){
            alarmHour+=1;
            alarmMinutes+=duration1;
        }
        else{
            alarmMinutes+=duration1%60;
        }
    }  
}
