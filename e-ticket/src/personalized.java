import java.util.Date;


public class personalized extends ticket{
    private String name;
    private String code;
    private String expiry_date;
    private String email;
    
    /*
    public ticket(boolean electronic, boolean standard, int duration, int rides) {
        this.electronic=electronic;
        this.standard=standard;
        this.duration=duration;
        this.rides=rides;
    }
    */
    
    public personalized(String name, String code, String expiry_date) {
        this.name=name;
        this.code=code;
        this.expiry_date=expiry_date;
    }
    
    public personalized(String email) {
        this.email=email;
    }

    public personalized() {
    }
    
    public void setName(String firstlast) {
            name=firstlast;
    }
    
    public void setEmail(String email) {
            this.email=email;
    }
    
    public String getEmail() {
            return email;
    }
    
    public String getName() {
            return name;
    }
    
    public void setCode(String sequence) {
            code=sequence;
    }
    
    public String getCode() {
            return code;
    }
    
    public void setDate(String expiration) {
            expiry_date=expiration;
    }
    
    public String getDate() {
            return expiry_date;
    }
    
    public void infoDisplay() {
            System.out.println(name+", "+code+", "+expiry_date);
    }
}
