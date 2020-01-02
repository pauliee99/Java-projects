package javis;

import java.util.*;
import java.util.stream.*;
import java.util.Random;

public class javisApp {

	public static int check(int input) {
		if ("1".equals(input)) {

		}
		return -1;
	}

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
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("please select one of the following:");
		System.out.println("1. kratisi oximatos\n2. allagi kratisis\n3. emfanisi kratisis");

		int choice = scan.nextInt();
		switch (choice) {
		case 1: //kratisi oximatos
			System.out.println("give type: (car or bike)");
			String type = scan2.nextLine();
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
				String choiceCar = scan2.nextLine();
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
				
				System.out.println("please enter the date you would like to pickup the car:(YYYYMMDD)");
				int takeDate = scan.nextInt();
				
				System.out.println("ID - typos - diefthinsi");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("place1: " + place1.getAr() + " - " + place1.getTypos() + " - " + place1.getDiefthinsi());
				System.out.println("place2: " + place2.getAr() + " - " + place2.getTypos() + " - " + place2.getDiefthinsi());
				System.out.println("place3: " + place3.getAr() + " - " + place3.getTypos() + " - " + place3.getDiefthinsi());
				System.out.println("place4: " + place4.getAr() + " - " + place4.getTypos() + " - " + place4.getDiefthinsi());
				System.out.println("please choose a place to pick up the car:");
				String takePlace = scan2.nextLine();
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
				int giveDate = scan.nextInt();
				
				System.out.println("ID - typos - diefthinsi");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("place1: " + place1.getAr() + " - " + place1.getTypos() + " - " + place1.getDiefthinsi());
				System.out.println("place2: " + place2.getAr() + " - " + place2.getTypos() + " - " + place2.getDiefthinsi());
				System.out.println("place3: " + place3.getAr() + " - " + place3.getTypos() + " - " + place3.getDiefthinsi());
				System.out.println("place4: " + place4.getAr() + " - " + place4.getTypos() + " - " + place4.getDiefthinsi());
				System.out.println("please choose a place to give the car back:");
				String givePlace = scan2.nextLine();
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
				int id = scan.nextInt();
				System.out.println("Licence:");
				int licence = scan.nextInt();
				
				// if gia metrita i karta
				
				int kodikos = rand.nextInt(9999);
				
				
				
			}
			break;
		}
	}

	/*
	 * public static void kratisi() {
	 * 
	 * 
	 * System.out.println("\n");
	 * 
	 * System.out.println("ID - typos - diefthinsi"); // those are the available
	 * places System.out.println(
	 * "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); for
	 * (Places placelist : placelists) { System.out.println(placelist.getAr() +
	 * " - " + placelist.getTypos() + " - " + placelist.getDiefthinsi()); }
	 * 
	 * freeVech = scan.nextInt(); date = scan.nextInt(); time = scan.nextLine(); }
	 * 
	 * else if (type.equals("bike")) { //if user wants to rent a bike System.out.
	 * println("kafsimo - ippodinami - megethos troxon - kivismos - kostos ana ora"
	 * ); System.out.println(
	 * "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 * System.out.println("bike1: " + bike1.getKafsimo() + " - " +
	 * bike1.getIppodinami() + " - " + bike1.getTroxoi() + " - " +
	 * bike1.getKivismos() + " - " + bike1.getKostos());
	 * 
	 * int count = 1; for (vechicle bikelist : lists) { //this is the list with the
	 * bikes System.out.println( count + ") " + bikelist.getKafsimo() + " - " +
	 * bikelist.getIppodinami() + " - " + bikelist.getTroxoi() + " - " +
	 * bikelist.getKivismos() + " - " + bikelist.getKostos()); count++; }
	 * 
	 * System.out.println("\n");
	 * 
	 * System.out.println("ID - typos - diefthinsi"); // those are the available
	 * places System.out.println(
	 * "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); for
	 * (Places placelist : placelists) { System.out.println(placelist.getAr() +
	 * " - " + placelist.getTypos() + " - " + placelist.getDiefthinsi()); }
	 * 
	 * } else { System.out.println("wrong input"); }
	 * 
	 * }
	 * 
	 * public static void showKratisi(){
	 * 
	 * }
	 */

}
