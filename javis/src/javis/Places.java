package javis;

public class Places {
	private int ar;
	private String typos;
	private String diefthinsi;
	
	public Places(int id, String type, String address) {
		ar=id;
		typos=type;
		diefthinsi=address;
	}
	
	public int getAr() {
		return ar;
	}
	
	public String getTypos() {
		return typos;
	}
	
	public String getDiefthinsi() {
		return diefthinsi;
	}
}
