/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;

/**
 *
 * @author it218110
 */
public class tv {
    private boolean io;
    private int currCh;
    private int currVol;
    private boolean tx;
    
    public tv(boolean power, int ch, int vol, boolean tlx){
        io=power;
        currCh=ch;
        currVol=vol;
        tx=tlx;
    }
    
    public void turnOn(){
        io = true;
    }
    
    public void turnOff(){
        io = false;
    }
    
    public void setChannel(int newChannel){
        if (io && newChannel >= 1 && newChannel <= 99)
            currCh = newChannel;
        //else 
            
    }
    
    //add value to volume
    public int getVolume(){
        return currVol;
    }
    
    public void setVolume(int newValue){
        currVol = newValue;
    }
    
    
    //power the tv
    public void on_off(boolean newValue){
        if (newValue == true || newValue == false){
            io = newValue;
        }
    }
    
    public void controller(){
        System.out.printf("on/off");
        System.out.printf("ch-/ch+");
        System.out.printf("vol-/vol+");
        System.out.printf("txon/txoff");
    }


}
