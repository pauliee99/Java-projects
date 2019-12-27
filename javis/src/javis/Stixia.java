package javis;

public class Stixia {
	private int taftotita;
	private int diploma;
	private int ilikia;
	private int karta;
	
	public Stixia(int id, int licence, int age, int card) {
		taftotita = id;
		diploma = licence;
		ilikia = age;
		karta = card;
	}
	
	public int getTaftotita() {
		return taftotita;
	}
	
	public int getDiploma() {
		return diploma;
	}
	
	public int getIlikia() {
		return ilikia;
	}
	
	public int getKarta() {
		return karta;
	}
	
}
