package javis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    private String kafsimo;
    private int ippodinami;
    private int troxoi;
    private int kivismos;
    private double kostos;
    private int thesis;
    private int thires;
    private int xoros;
    
    public Car(String gas, int hp, int wheels, int blocks, double cost, int seats, int doors, int space ){
        kafsimo = gas;
        ippodinami = hp;
        troxoi = wheels;
        kivismos = blocks;
        kostos = cost;
        thesis = seats;
        thires = doors;
        xoros = space;
    }
    
    public String getKafsimo() {
    	return kafsimo;
    }
    
    public int getIppodinami() {
    	return ippodinami;
    }
    
    public int getTroxoi() {
    	return troxoi;
    }
    
    public int getKivismos() {
    	return kivismos;
    }
    
    public double getKostos() {
    	return kostos;
    }
    
    public int getThesis() {
    	return thesis;
    }
    
    public int getThires() {
    	return thires;
    }
    
    public int getXoros() {
    	return xoros;
    }
    
    Car choice() {
    	List<Car> carlists = new ArrayList<Car>();
    	//vechiclelist.add(new Car("kafsimo", "ippodinami", "troxoi", "kivismos", "kostos", "theis", "thires", "xoros"));
    	carlists.add(new Car("venzini", 156, 17, 1499, 3.5, 5, 4, 5));
    	carlists.add(new Car("venzini", 89, 15, 1125, 2.6, 2, 2, 3));
    	carlists.add(new Car("venzini", 200, 18, 2600, 4.7, 7, 4, 8));
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("give type: (car or bike)");
    	String type = scan.nextLine();
    	
    	if (type.equals("car")) { //if user wants to rent a car
    		System.out.println("kafsimo - ippodinami - megethos troxon - kivismos - kostos ana ora - plithos theseon - plithos thiron - megethos xorou aposkevon");
    		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    		int count = 1;
    	for(int i = 0; i < carlists.size(); i++) {
            System.out.println(i+1 + ") " + carlists.get(i).getKafsimo() + " - " + carlists.get(i).getIppodinami() + " - " + carlists.get(i).getTroxoi() + " - " + carlists.get(i).getKivismos() + " - " + carlists.get(i).getKostos() + " - " + carlists.get(i).getThesis() + " - " + carlists.get(i).getThires() + " - " + carlists.get(i).getXoros());
        }
		System.out.println("please choose a car");
		int choiceCar = scan.nextInt();
		switch (choiceCar) {
			case 1:
				return carlists.get(0);
			case 2:
				return carlists.get(1);
			case 3:
				return carlists.get(2);
			default:
				System.out.println("wrong car");
		}
    	}
    	return null;
    }
        
 
}
