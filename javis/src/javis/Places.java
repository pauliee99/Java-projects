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
	
	public void setAr(int id) {
		this.ar = id;
	}
	
	public int getAr() {
		return ar;
	}
	
	public void setTypos(String type) {
		this.typos = type;
	}
	
	public String getTypos() {
		return typos;
	}
	
	public void setDiefthinsi(String address) {
		this.diefthinsi = address;
	}
	
	public String getDiefthinsi() {
		return diefthinsi;
	}
}
