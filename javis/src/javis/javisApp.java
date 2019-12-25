package javis;

import java.util.*; 
import java.util.stream.*; 
import java.util.Scanner;

public class javisApp {
    public static void main(String[] args) {
    	String availableCars[] = {"car1", "car2", "car3"};
        String availableBikes[] = {"bike1", "bike2"};
    	Scanner scan = new Scanner(System.in);
        System.out.println("give type: (car or bike)");
        String type = scan.nextLine(); //reads type of vechicle
        
        if (type.equals("car")) {
        	Stream.of(availableCars).forEach(System.out::println);
        	switch( type ) {
        		case "car1":
        			
        	}
        }
        else if (type.equals("bike")) {
        	Stream.of(availableBikes).forEach(System.out::println);
        }
        else {
        	System.out.println("wrong input");
        }
        
        
    }
    
    

}
