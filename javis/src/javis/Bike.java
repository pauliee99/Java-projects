package javis;

public class Bike {
    private String kafsimo;
    private int ippodinami;
    private int troxoi;
    private int kivismos;
    private double kostos;
    
    public Bike(String gas, int hp, int wheels, int blocks, double cost ){
        kafsimo = gas;
        ippodinami = hp;
        troxoi = wheels;
        kivismos = blocks;
        kostos = cost;
    }
    
    public void setKafsimo(String gas) {
    	this.kafsimo = gas;
    }
    
    public String getKafsimo() {
    	return kafsimo;
    }
    
    public void setIppodinami(int hp) {
    	this.ippodinami = hp;
    }
    
    public int getIppodinami() {
    	return ippodinami;
    }
    
    public void setTroxoi(int wheels) {
    	this.troxoi = wheels;
    }
    
    public int getTroxoi() {
    	return troxoi;
    }
    
    public void setKivismos(int blocks) {
    	this.kivismos = blocks;
    }
    
    public int getKivismos() {
    	return kivismos;
    }
    
    public void setKostos(double cost) {
    	this.kostos = cost;
    }
    
    public double getKostos() {
    	return kostos;
    }
       
}
