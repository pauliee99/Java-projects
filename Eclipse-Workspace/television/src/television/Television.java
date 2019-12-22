/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;
import java.util.Scanner;

/**
 *
 * @author it218110
 */
public class Television {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tv tv1 =new tv(false, 1, 15, false);
        
        boolean io = false;
        String i_o;
        Scanner ctrl = new Scanner(System.in);
        i_o = ctrl.nextLine();
        
        if (i_o == "on"){
            io = true;
        }
        else if (i_o == "off"){
            io = false;
        }
        
        while (io == true){
           tv1.controller();
        }
        
    }
    
}
