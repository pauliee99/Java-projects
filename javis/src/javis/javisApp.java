package javis;

import java.util.*;
import java.util.stream.*;
import java.util.Random;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.sql.Time;
import java.lang.Object;


public class javisApp {

	public static void main(String[] args) {

		Car car1 = new Car("venzini", 156, 17, 1499, 3.5, 5, 4, 5);
		Car car2 = new Car("venzini", 89, 15, 1125, 2.6, 2, 2, 3);
		Car car3 = new Car("venzini", 200, 18, 2600, 4.7, 7, 4, 8);
		Bike bike1 = new Bike("venzini", 105, 15, 998, 3.1);
		Bike bike2 = new Bike("ilektriko", 147, 15, 982, 2.4);
		Bike bike3 = new Bike("venzini", 55, 14, 115, 1.4);
		Bike bike4 = new Bike("venzini", 85, 16, 478, 2.9);
		Bike bike5 = new Bike("ilektriko", 180, 14, 950, 2.8);
		Places place1 = new Places(1, "katastima", "antheon 32, TK23456");
		Places place2 = new Places(2, "katastima", "socratous 58, TK13426");
		Places place3 = new Places(3, "simio", "papadiamantopoullou 20, TK23872");
		Places place4 = new Places(4, "simio", "papagou 3, TK33421");
		
		Random rand=new Random(); //instance of random class
		String choiceCar = "";  //vehicle choice
		int kodikos = 0;  // kodikos kratisis
		int cost = 0;  // kostos kratisis
		int takeDate = 0;  //the date go pick up the car
		int giveDate = 0;  //the day to leave the car
		int id = 0; // the ID
		Scanner integer= new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		
		while(true) {
			System.out.println("please select one of the following:");
			System.out.println("1. kratisi oximatos\n2. allagi kratisis\n3. emfanisi kratisis");
			int choice = integer.nextInt();
			switch (choice) {
			case 1: //kratisi oximatos
				System.out.println("give type: (car or bike)");
				String type = string.nextLine();
				if (type.equals("car")) { // if user wants to rent a car
					System.out.println(
							"kafsimo - ippodinami - megethos troxon - kivismos - kostos ana ora - plithos theseon - plithos thiron - megethos xorou aposkevon");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("car1: " + car1.getKafsimo() + " - " + car1.getIppodinami() + " - "
							+ car1.getTroxoi() + " - " + car1.getKivismos() + " - " + car1.getKostos() + " - "
							+ car1.getThesis() + " - " + car1.getThires() + " - " + car1.getXoros());
					System.out.println("car2: " + car2.getKafsimo() + " - " + car2.getIppodinami() + " - "
							+ car2.getTroxoi() + " - " + car2.getKivismos() + " - " + car2.getKostos() + " - "
							+ car3.getThesis() + " - " + car2.getThires() + " - " + car2.getXoros());
					System.out.println("car3: " + car3.getKafsimo() + " - " + car3.getIppodinami() + " - "
							+ car3.getTroxoi() + " - " + car3.getKivismos() + " - " + car3.getKostos() + " - "
							+ car3.getThesis() + " - " + car3.getThires() + " - " + car3.getXoros());
	
					System.out.println("please choose a car");
					choiceCar = string.nextLine();
					switch (choiceCar) {
					case "car1":
						choiceCar = car1.getKafsimo() + " - " + car1.getIppodinami() + " - "
								+ car1.getTroxoi() + " - " + car1.getKivismos() + " - " + car1.getKostos() + " - "
								+ car1.getThesis() + " - " + car1.getThires() + " - " + car1.getXoros();
						break;
					case "car2":
						choiceCar = car2.getKafsimo() + " - " + car2.getIppodinami() + " - "
								+ car2.getTroxoi() + " - " + car2.getKivismos() + " - " + car2.getKostos() + " - "
								+ car3.getThesis() + " - " + car2.getThires() + " - " + car2.getXoros();
						break;
					case "car3":
						choiceCar = car3.getKafsimo() + " - " + car3.getIppodinami() + " - "
								+ car3.getTroxoi() + " - " + car3.getKivismos() + " - " + car3.getKostos() + " - "
								+ car3.getThesis() + " - " + car3.getThires() + " - " + car3.getXoros();
						break;
					default:
						System.out.println("wrong car");
						break;
					}	
				}else if (type.equals("bike")) {
					System.out.println(
							"kafsimo - ippodinami - megethos troxon - kivismos - kostos ana ora");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("bike1: " + bike1.getKafsimo() + " - " + bike1.getIppodinami() + " - "
							+ bike1.getTroxoi() + " - " + bike1.getKivismos() + " - " + bike1.getKostos());
					System.out.println("bike2: " + bike2.getKafsimo() + " - " + bike2.getIppodinami() + " - "
							+ bike2.getTroxoi() + " - " + bike2.getKivismos() + " - " + bike2.getKostos());
					System.out.println("bike3: " + bike3.getKafsimo() + " - " + bike3.getIppodinami() + " - "
							+ bike3.getTroxoi() + " - " + bike3.getKivismos() + " - " + bike3.getKostos());
					System.out.println("bike4: " + bike4.getKafsimo() + " - " + bike4.getIppodinami() + " - "
							+ bike4.getTroxoi() + " - " + bike4.getKivismos() + " - " + bike4.getKostos());
					System.out.println("bike5: " + bike5.getKafsimo() + " - " + bike5.getIppodinami() + " - "
							+ bike5.getTroxoi() + " - " + bike5.getKivismos() + " - " + bike5.getKostos());
					
					System.out.println("please choose a bike");
					choiceCar = string.nextLine();
					switch(choiceCar) {
					case "bike1":
						choiceCar = bike1.getKafsimo() + " - " + bike1.getIppodinami() + " - "
								+ bike1.getTroxoi() + " - " + bike1.getKivismos() + " - " + car1.getKostos();
						break;
					case "bike2":
						choiceCar = bike2.getKafsimo() + " - " + bike2.getIppodinami() + " - "
								+ bike2.getTroxoi() + " - " + bike2.getKivismos() + " - " + bike2.getKostos();
						break;
					case "bike3":
						choiceCar = bike3.getKafsimo() + " - " + bike3.getIppodinami() + " - "
								+ bike3.getTroxoi() + " - " + bike3.getKivismos() + " - " + bike3.getKostos();
						break;
					case "bike4":
						choiceCar = bike4.getKafsimo() + " - " + bike4.getIppodinami() + " - "
								+ bike4.getTroxoi() + " - " + bike4.getKivismos() + " - " + bike4.getKostos();
						break;
					case "bike5":
						choiceCar = bike5.getKafsimo() + " - " + bike5.getIppodinami() + " - "
								+ bike5.getTroxoi() + " - " + bike5.getKivismos() + " - " + bike5.getKostos();
						break;
					default:
						System.out.println("wrong car");
						break;
					}
				}
					
				System.out.println("please enter the date you would like to pickup the car:(YYYYMMDD)");
				takeDate = integer.nextInt();
				
				System.out.println("ID - typos - diefthinsi");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("place1: " + place1.getAr() + " - " + place1.getTypos() + " - " + place1.getDiefthinsi());
				System.out.println("place2: " + place2.getAr() + " - " + place2.getTypos() + " - " + place2.getDiefthinsi());
				System.out.println("place3: " + place3.getAr() + " - " + place3.getTypos() + " - " + place3.getDiefthinsi());
				System.out.println("place4: " + place4.getAr() + " - " + place4.getTypos() + " - " + place4.getDiefthinsi());
				System.out.println("please choose a place to pick up the car:");
				String takePlace = string.nextLine();
				switch (takePlace) {
				case "place1":
					takePlace = place1.getAr() + " - " + place1.getTypos() + " - " + place1.getDiefthinsi();
					break;
				case "place2":
					takePlace = place2.getAr() + " - " + place2.getTypos() + " - " + place2.getDiefthinsi();
					break;
				case "place3":
					takePlace = place3.getAr() + " - " + place3.getTypos() + " - " + place3.getDiefthinsi();
					break;
				case "place4":
					takePlace = place4.getAr() + " - " + place4.getTypos() + " - " + place4.getDiefthinsi();
					break;
				default:
					System.out.println("wrong place");
					break;
				}
				
				System.out.println("please enter the date you would like to give the car back:(YYYYMMDD)");
				giveDate = integer.nextInt();
				
				System.out.println("ID - typos - diefthinsi");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("place1: " + place1.getAr() + " - " + place1.getTypos() + " - " + place1.getDiefthinsi());
				System.out.println("place2: " + place2.getAr() + " - " + place2.getTypos() + " - " + place2.getDiefthinsi());
				System.out.println("place3: " + place3.getAr() + " - " + place3.getTypos() + " - " + place3.getDiefthinsi());
				System.out.println("place4: " + place4.getAr() + " - " + place4.getTypos() + " - " + place4.getDiefthinsi());
				System.out.println("please choose a place to give the car back:");
				String givePlace = string.nextLine();
				switch (givePlace) {
				case "place1":
					givePlace = place1.getAr() + " - " + place1.getTypos() + " - " + place1.getDiefthinsi();
					break;
				case "place2":
					givePlace = place2.getAr() + " - " + place2.getTypos() + " - " + place2.getDiefthinsi();
					break;
				case "place3":
					givePlace = place3.getAr() + " - " + place3.getTypos() + " - " + place3.getDiefthinsi();
					break;
				case "place4":
					givePlace = place4.getAr() + " - " + place4.getTypos() + " - " + place4.getDiefthinsi();
					break;
				default:
					System.out.println("wrong place");
					break;
				}
				
				System.out.println("to complete the booking we need some private info...");
				System.out.println("ID:");
				id = integer.nextInt();
				System.out.println("Licence:");
				int licence = integer.nextInt();
				System.out.println("Age:");
				int age = integer.nextInt();
				String pay;
				int card = 0;
				while (true) {
					System.out.println("pos thelete na ksoflisete tin krateisi? (card/cash)");
						pay = string.nextLine();
					if (pay.equals("card")){
						System.out.println("give card no.");
						card = integer.nextInt();
						break;
					}
					else if(pay.equals("cash")) {
						break;
					}
					else 
						System.out.println("wrong payment method choose again...");
				}
				
				
				kodikos = rand.nextInt(9999);  //to generate booking code
				cost = (giveDate - takeDate)*24;  // to calculate the cost of the booking
				
				System.out.println("\n ---stixia kratisis-----");
				System.out.println("kodikos kratisis: " + kodikos);
				System.out.println("sinoliki timi: €" + cost + " with " + pay);
				System.out.println(choiceCar);
				if (pay.equals("card")) 
					System.out.println("ID: " + id + "\nLicence: " + licence + "Age: " + age + "\ncard number: " + card);
				else
					System.out.println("ID: " + id + "\nLicence: " + licence + "\nAge: " + age);
				
				break;
				
			case 2: //allagi kratisis
				//SimpleDateFormat formatter = new SimpleDateFormat("yyyymmdd");  
			    //Date date = new Date();
			    //System.out.println(formatter.format(date));
			    //int date = getDay();
				Date today = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				String folderName = formatter.format(today);
				int date = Integer.parseInt(folderName);	
				int tmp = takeDate-date;
				
				while (true) {
					System.out.println("dose kodiko kratisis:");
					int kodikostmp = integer.nextInt();
				    if (kodikos == kodikostmp && tmp >= 48) {
				    	System.out.println("what would you like to change?\n1. pick up date\n2. imerominia paralavis\n3. topo paradosis\n4. topo paralavis\n5. back");
				    	int choicetmp = integer.nextInt();
				    	switch (choicetmp) {
				    	case 1:
				    		System.out.println("please give us the new pickup date:");
				    		takeDate = integer.nextInt();
				    		System.out.println("pick up date changed succesfully!");
				    	case 2:
				    		System.out.println("please give us the new give up date:");
				    		giveDate = integer.nextInt();
				    		System.out.println("give up date changed succesfully!");
				    	case 3:
				    		System.out.println("please give us the new pickup place:");
				    		takePlace = string.nextLine();
				    		System.out.println("pick up place changed succesfully!");
				    	case 4:
				    		System.out.println("please give us the new give up place:");
				    		givePlace = string.nextLine();
				    		System.out.println("give up place changed succesfully!");
				    	case 5:
				    		return;
				    	default:
				    		System.out.println("wrong option");
				    	}
				    }
				    break;
				}
					
			}
		}
	}

}
