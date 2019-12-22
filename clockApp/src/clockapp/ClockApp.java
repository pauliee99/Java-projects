/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockapp;

import java.util.Scanner;
import java.time.LocalTime;

/**
 *
 * @author it218110
 */
public class ClockApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner al = new Scanner(System.in);
        LocalTime lt = LocalTime.now();
        
        System.out.println("give name:");
        String name = al.nextLine();
        
        System.out.println("give format:");
        int format = al.nextInt();
        
        int clckH = lt.getHour();
        int clckM = lt.getMinute();
        
        System.out.println("give alarm hour:");
        int alH = al.nextInt();
        
        System.out.println("give alarm minutes:");
        int alM = al.nextInt();
        
        Clock ora = new Clock(clckH, clckM, name, format, alH, alM);
        
        System.out.println("the clock name is "+ora.getName() );
        System.out.println("the time is "+ora.getClockHour()+":"+ora.getClockMinutes());
        System.out.println("the alarm is set at "+ora.getAlarmHour()+":"+ora.getAlarmMinutes());
        
        
        
    }
    
}
