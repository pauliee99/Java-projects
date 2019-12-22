
public class menu {
    
    static void phase1() {
        System.out.println("Choose an action for your ticket: ");
        System.out.println("Issue-Buy\nRenew\nUpdate\n");
    }
    
    static void phase2() {
        System.out.println("Pick ticket type: ");
        System.out.println("STANDARD\nREDUCED\n");
    }
    
    static void phase3(int regular) {
        if (regular==0) {
            System.out.println("Pick how many rides or the duration: ");
            System.out.println("1\t5\t11\t\n90 minutes\tdaily\tweekly\tmonthly");
        } else {
            System.out.println("Pick how many rides or the duration: ");
            System.out.println("1\t5\t11\t\n90 minutes\tmonthly");
        }
        }
    
    
    
    static void phase4() {
        System.out.println("Please enter your name, ticket code and expiry date (YYY-MM-DD)");
    }
    
    static void phase5() {
        System.out.println("Would you like to pay with CASH or CARD?");
    }
    
    static void phase6() {
        System.out.println("Acceptable bills/coins: \t10 euros\t5 euros\t2 euros\t1 euro");
    }
    static void phase7() {
        System.out.println("Would you like to ELECTRONIC or PAPER ticket");
    }
    
    static void phase8() {
        System.out.println("Enter your email: ");
    }
}
