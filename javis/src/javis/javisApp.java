package javis;

import java.util.*; 
import java.util.stream.*;
import java.util.Scanner;

public class javisApp {
    public static void main(String[] args) {
    	/*
    	List vechiclelist = new ArrayList();
    	//vechiclelist.add(new Car("kafsimo", "ippodinami", "troxoi", "kivismos", "kostos", "theis", "thires", "xoros"));
    	vechiclelist.add(new Car("venzini", 156, 17, 1499, 3.5, 5, 4, 5));
    	vechiclelist.add(new Car("venzini", 89, 15, 1125, 2.6, 2, 2, 3));
    	vechiclelist.add(new Car("venzini", 200, 18, 2600, 4.7, 7, 4, 8));
    	//vechiclelist.add(new Dikyklo("kafsimo", "ippodinami", "troxoi", "kivismos", "kostos");
    	vechiclelist.add(new Dikyklo("venzini", 105, 15, 998, 3.1));
    	vechiclelist.add(new Dikyklo("ilektriko", 147, 15, 982, 2.4));
    	vechiclelist.add(new Dikyklo("venzini", 55, 14, 115, 1.4));
    	vechiclelist.add(new Dikyklo("venzini", 85, 16, 478, 2.9));
    	vechiclelist.add(new Dikyklo("ilektriko", 180, 14, 950, 2.8));*/
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("please select one of the following:");
    	System.out.println("1. kratisi oximatos\n2. allagi kratisis\n3. emfanisi kratisis");
    	
    	int choice = scan.nextInt();
    	
    	switch (choice) {
    		case 1:
    			kratisi();
    			break;
    	}
    }
    
    public static void kratisi() {
    	
    	List<Car> carlist = new ArrayList<Car>();
    	//vechiclelist.add(new Car("kafsimo", "ippodinami", "troxoi", "kivismos", "kostos", "theis", "thires", "xoros"));
    	carlist.add(new Car("venzini", 156, 17, 1499, 3.5, 5, 4, 5));
    	carlist.add(new Car("venzini", 89, 15, 1125, 2.6, 2, 2, 3));
    	carlist.add(new Car("venzini", 200, 18, 2600, 4.7, 7, 4, 8));
    	List<Dikyklo> bikelist = new ArrayList<Dikyklo>();
    	//vechiclelist.add(new Dikyklo("kafsimo", "ippodinami", "troxoi", "kivismos", "kostos");
    	bikelist.add(new Dikyklo("venzini", 105, 15, 998, 3.1));
    	bikelist.add(new Dikyklo("ilektriko", 147, 15, 982, 2.4));
    	bikelist.add(new Dikyklo("venzini", 55, 14, 115, 1.4));
    	bikelist.add(new Dikyklo("venzini", 85, 16, 478, 2.9));
    	bikelist.add(new Dikyklo("ilektriko", 180, 14, 950, 2.8));
    	
		Scanner scan = new Scanner(System.in);
    	System.out.println("give type: (car or bike)");
    	String type = scan.nextLine();
    	
    	if (type.equals("car")) {
    		//Car aftokinito = new Car()
    		System.out.println("hi");
    	}
    	else if (type.equals("bike")) {
    		
    	}
    	else {
    		System.out.println("wrong input");
    	}
    }

}

/*Scanner scan = new Scanner(System.in);
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
*/