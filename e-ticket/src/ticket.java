public class ticket {
    private int electronic;   //electronic or printed
    private int standard; // regular or reduced
    private String duration;   //enumeration
    private int rides;
    private double price;
    private boolean cash;
    
    public ticket(int electronic, int standard, String duration) {
        this.electronic=electronic;
        this.standard=standard;
        this.duration=duration;
    }
    public ticket(int electronic, int standard, int rides) {
        this.electronic=electronic;
        this.standard=standard;
        this.rides=rides;
    }

    public ticket () {
    }

    public void setStandard(int standard) {
            this.standard=standard;
    }
    
    public void setElectronic(int electronic) {
            this.electronic=electronic;
    }
    
    public int getElectronic() {
            return electronic;
    }
    
    public void setDurationRides(int rides) {
            this.rides=rides;
    }
    
    public double estimatePrice () {
        if (standard == 0) {
            if (rides==1)
                price=1.40;
            if (rides==24)
                price=4.50;
            if (rides==7)
                price=9;
            if (rides==30)
                price=30;
            if (rides == 5)
                price=6.50;
            if (rides == 11)
                price=13.50;
            
        } else {
            if (rides==1)
                price=0.60;
            if (rides==30)
                price=15;
            if (rides == 5)
                price=3;
            if (rides == 11)
                price=6;
        }
        return price;
    }
    
    public double getPrice(){
        return estimatePrice();
    }
    
    public void ticketDisplay() {
            System.out.println(standard+", "+rides+", "+price);
    }
    
    public int setPayment(String payment) {
        if ("cash".equals(payment) || "Cash".equals(payment) || "CASH".equals(payment)) {
            cash=true;
            return 1; 
        }
        if ("card".equals(payment) || "Card".equals(payment) || "CARD".equals(payment)) {
            cash=false;
            return 1;
        }
        System.out.println("Invalid inut.\nTry again!");
        return -1;
    }
    
    public int getPayment(String pay) {
        double balance= Double.parseDouble(pay);
        if (cash == true) {
            menu.phase6();
            if (balance>price) {
                System.out.println("Here's your change : "+ (balance-price)+" €");
            }
            if (balance < price) {
                System.out.println((price-balance)+" € still required");
                return -1;
            }
            System.out.println("Payment successful");
            return 0;
        } else {
            if (balance < price) {
                System.out.println("Not enough money on your account");
                return -1;
            } 
            System.out.println(price + " € has been deduced from your account\nYour new balance is "+ (balance - price)+" €");
            System.out.println("Payment successful");
            return 0;
            }
        }
    }
            
 /*   public void checkType() {
        if (standard=false) {
            personalized info = new personalized(name, code, expiry_date);
        }
    }

    public boolean getType() {
            return standard;
    }
    
    public void setDuration(int r_d) {
        if (r_d==1 || r_d==5 || r_d==11) {
            number_rides=r_d;
        } else {
            duration=r_d;
            if ("month".equals(r_d)) {
                personalized info = new personalized();
            }
        }
    }
    
    public int getDurationRides() {
        if (number_rides !=0) {
            return number_rides;
        } else {
            return duration;
        }
    }
 */    
//    public double calcPrice () {
//        return price;
//    }
    

