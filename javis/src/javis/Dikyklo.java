package javis;

public class Dikyklo {
    private String kafsimo;
    private int ippodinami;
    private int troxoi;
    private int kivismos;
    private double kostos;
    
    public Dikyklo(String gas, int hp, int wheels, int blocks, double cost ){
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
       
}
