package javis;

public class vechicle {
    private String kafsimo;
    private int ippodinami;
    private int troxoi;
    private int kivismos;
    private double kostos;
    private int thesis;
    private int thires;
    private int xoros;
    
    public vechicle(String gas, int hp, int wheels, int blocks, double cost, int seats, int doors, int space ){
        kafsimo = gas;
        ippodinami = hp;
        troxoi = wheels;
        kivismos = blocks;
        kostos = cost;
        thesis = seats;
        thires = doors;
        xoros = space;
    }
    public vechicle(String gas, int hp, int wheels, int blocks, double cost ){
        kafsimo = gas;
        ippodinami = hp;
        troxoi = wheels;
        kivismos = blocks;
        kostos = cost;
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
}
