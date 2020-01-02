package javis;

import java.util.*;
import java.util.stream.*;

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
				System.out.println("car1: " + car1.getKafsimo() + " - " + car1.getIppodinami() + " - " + car1.getTroxoi() + " - " + car1.getKivismos() + " - " + car1.getKostos() + " - " + car1.getThesis() + " - " + car1.getThires() + " - " + car1.getXoros());
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
					choiceCar = car1.getKafsimo() + car1.getIppodinami() + car1.getTroxoi() + car1.getKivismos()
							+ car1.getKostos() + car1.getThesis() + car1.getThires() + car1.getXoros();
					break;
				case "car2":
					choiceCar = car2.getKafsimo() + " - " + car2.getIppodinami() + " - "
							+ car2.getTroxoi() + " - " + car2.getKivismos() + " - " + car2.getKostos() + " - "
							+ car3.getThesis() + " - " + car2.getThires() + " - " + car2.getXoros();
					break;
				case "car3":
					choiceCar = car3.getKafsimo() + car3.getIppodinami() + car3.getTroxoi() + car3.getKivismos()
							+ car3.getKostos() + car3.getThesis() + car3.getThires() + car3.getXoros();
					break;
				default:
					System.out.println("wrong car");
					break;
				}
				System.out.println(choiceCar);

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
