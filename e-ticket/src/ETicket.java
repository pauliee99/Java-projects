import java.util.*;
import java.util.concurrent.TimeUnit;

//package e.ticket;


public class ETicket{
    
    public static int check(String input) {
        if ("STANDARD".equals(input) || "standard".equals(input) || "Standard".equals(input))
            return 0;
        if ("REDUCED".equals(input) || "reduced".equals(input) || "Reduced".equals(input))
            return 1;
        if ("electronic".equals(input) || "Electronic".equals(input) || "ELECTRONIC".equals(input))
            return 0;
        if ("paper".equals(input) || "Paper".equals(input) || "PAPER".equals(input)) {
            System.out.println("Printing your ticket...");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("Collect your ticket");
            return 1;
        }
        System.out.println("Provide a valid input!");
        return -1;
    };
    
    public static int convertToNumber(String input) {
        if ("1".equals(input))
            return 1;
        if ("11".equals(input)) 
            return 11;
        if ("5".equals(input))
            return 5;
        if ("90 minutes".equals(input) || "90".equals(input))
            return 90;
        if ("daily".equals(input))
            return 24;
        if ("weekly".equals(input))
            return 7;
        if ("monthly".equals(input))
            return 30;
        System.out.println("Choose one of the options on display");
        return -1;
    };
    
 /*         HashMap<String, ticket> tickets = new HashMap<>();

        tickets.put("ticket1", new ticket(true, true, "daily"));
*/
    public static void main(String[] args) {
        String input;
        int converted_dur_rides;
        int converted;
        menu display = new menu();
        Scanner scan = new Scanner(System.in);

        display.phase1();
        while(true) {
        String option = scan.nextLine();
        
        switch(option) {
            case "Issue" :
            case "issue" :
            case "ISSUE" :
            case "Buy" :
            case "buy" :
            case "BUY" :
                ticket ticket1 = new ticket();
                display.phase2();
                do{
                    input=scan.nextLine();
                    converted=check(input);
                } while(converted<0);
                ticket1.setStandard(converted);
                
                display.phase3(converted);
                do{
                    input=scan.nextLine();
                    converted_dur_rides=convertToNumber(input);
                } while(converted_dur_rides<0);
                ticket1.setDurationRides(converted_dur_rides);
                //debug purposes
                ticket1.ticketDisplay();
                if (converted==1 || converted_dur_rides==30){
                    personalized info = new personalized();
                    display.phase4();
                    info.setName(scan.nextLine());
                    info.setCode(scan.nextLine());
                    info.setDate(scan.nextLine());
                    System.out.print(" You are:");
                    //debug purposes
                    info.infoDisplay();
                }
                double price= ticket1.estimatePrice();
                System.out.println(price+" €");
                do{
                    display.phase5();
                } while(ticket1.setPayment(scan.nextLine())<0);
                ticket1.getPayment(scan.nextLine());
                do{
                    display.phase7();
                } while(check(scan.nextLine())<0);
                if (ticket1.getElectronic()==0) {
                    display.phase8();
                    personalized info= new personalized(scan.nextLine());
                }
                return;
            case "Renew":
            case "renew":
            case "RENEW":
                
                return;
            case "Update":
            case "update":
            case "UPDATE":
                
                return;
            default:
                System.out.println("Invalid input");
                display.phase1();
                break;
        }
        }
    }
}


/*
      String input;
        boolean check=false;
        menus display = new menus();
        
        Scanner scan = new Scanner(System.in);
        
       //System.out.println("1. Buy\n2. Renew\n3. Update\n");
       display.phase1();
       
       do{
           if (check==false)
                check=true;
           else
               System.out.println("Input not valid");
            input=scan.nextLine();
       } while (!("Buy".equals(input) || "Renew".equals(input) || "Update".equals(input)));
       
       ticket tick = new ticket();
       
       System.out.println(input);
       
       if ("Buy".equals(input)) {
           //System.out.println("STANDARD\nREDUCED\n");
           display.phase2();
           input=scan.nextLine();
           tick.setType(input);
           display.phase3();
           input=scan.nextLine();
           tick.setDuration(input);
           if ("REDUCED".equals(input)) {
               //System.out.println("Number of rides\nDuration\n");

            }
           else {
               
        }
       
       if ("Renew".equals(input)) {
           //System.out.println("STANDARD\nREDUCED\n");
           display.phase2();
           input=scan.nextLine();
        }
       
       if ("Update".equals(input)) {
           System.out.println("STANDARD\nREDUCED\n");
           input=scan.nextLine();
        }
       
    }
    
}
*/