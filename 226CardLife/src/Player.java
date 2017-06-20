
public class Player {
	
	private int lifepool;
	private String name;	
	private int aktuelleKarte;
	
	public Player(String name, int lifepool ){
		this.name = name;
		this.lifepool = lifepool;
		
	}
	public int getLifepool() {
		return lifepool;
	}

	public void setLifepool(int lifepool) {
		this.lifepool = lifepool;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAktuelleKarte() {
		return aktuelleKarte;
	}

	public void setAktuelleKarte(int aktuelleKarte) {
		this.aktuelleKarte = aktuelleKarte;
	}



}
