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
    	
    	List<Car> carlists = new ArrayList<Car>();
    	//vechiclelist.add(new Car("kafsimo", "ippodinami", "troxoi", "kivismos", "kostos", "theis", "thires", "xoros"));
    	carlists.add(new Car("venzini", 156, 17, 1499, 3.5, 5, 4, 5));
    	carlists.add(new Car("venzini", 89, 15, 1125, 2.6, 2, 2, 3));
    	carlists.add(new Car("venzini", 200, 18, 2600, 4.7, 7, 4, 8));
    	List<Dikyklo> bikelists = new ArrayList<Dikyklo>();
    	//vechiclelist.add(new Dikyklo("kafsimo", "ippodinami", "troxoi", "kivismos", "kostos");
    	bikelists.add(new Dikyklo("venzini", 105, 15, 998, 3.1));
    	bikelists.add(new Dikyklo("ilektriko", 147, 15, 982, 2.4));
    	bikelists.add(new Dikyklo("venzini", 55, 14, 115, 1.4));
    	bikelists.add(new Dikyklo("venzini", 85, 16, 478, 2.9));
    	bikelists.add(new Dikyklo("ilektriko", 180, 14, 950, 2.8));
    	List<Places> placelists = new ArrayList<Places>();
    	//public Places(int id, String type, String address);
    	placelists.add(new Places(1, "katastima", "antheon 32, TK23456"));
    	placelists.add(new Places(2, "katastima", "socratous 58, TK13426"));
    	placelists.add(new Places(3, "simio", "papadiamantopoullou 20, TK23872"));
    	placelists.add(new Places(4, "simio", "papagou 3, TK33421"));
    	
		Scanner scan = new Scanner(System.in);
    	System.out.println("give type: (car or bike)");
    	String type = scan.nextLine();
    	int freeVech,date;
    	String time;
    	
    	if (type.equals("car")) { //if user wants to rent a car
    		//int choiceCar = scan.nextInt();
    		System.out.println("kafsimo - ippodinami - megethos troxon - kivismos - kostos ana ora - plithos theseon - plithos thiron - megethos xorou aposkevon");
    		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    		int count = 1;
    		/*
    		for (Car carlist : carlists) { //this is the list with the cars
    			System.out.println( count + ") " + carlist.getKafsimo() + " - " + carlist.getIppodinami() + " - " + carlist.getTroxoi() + " - " + carlist.getKivismos() + " - " + carlist.getKostos() + " - " + carlist.getThesis() + " - " + carlist.getThires() + " - " + carlist.getXoros());
    		count++;
    		}
    		*/
    		for(int i = 0; i < carlists.size(); i++) {
                System.out.println(i+1 + ")" + carlists.get(i).getKafsimo());
            }
    		/*
    		switch (choiceCar) {
    			case 1:
    				choiceCar = carlist[1];
    				break;
    			case 2:
    				choiceCar = carlists[2];
    		}
    		*/
    		System.out.println("\n");
    		
    		System.out.println("ID - typos - diefthinsi"); // those are the available places
    		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    		for (Places placelist : placelists) {
    			System.out.println(placelist.getAr() + " - " + placelist.getTypos() + " - " + placelist.getDiefthinsi());
    		}
    		
    		freeVech = scan.nextInt();
    		date = scan.nextInt();
    		time = scan.nextLine();
    	}
    	else if (type.equals("bike")) { //if user wants to rent a bike
    		System.out.println("kafsimo - ippodinami - megethos troxon - kivismos - kostos ana ora");
    		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    		int count = 1;
    		for (Dikyklo bikelist : bikelists) { //this is the list with the bikes
    			System.out.println( count + ") " + bikelist.getKafsimo() + " - " + bikelist.getIppodinami() + " - " + bikelist.getTroxoi() + " - " + bikelist.getKivismos() + " - " + bikelist.getKostos());
    			count++;
    		}
    		
    		System.out.println("\n");
    		
    		System.out.println("ID - typos - diefthinsi"); // those are the available places
    		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    		for (Places placelist : placelists) {
    			System.out.println(placelist.getAr() + " - " + placelist.getTypos() + " - " + placelist.getDiefthinsi());
    		}
    		
    	}
    	else {
    		System.out.println("wrong input");
    	}
    }
    
    public void chooseVechicle() {
    	
    }

}

/* 
        for(Model model : models) {
            System.out.println(model.getName());
        }

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
*/