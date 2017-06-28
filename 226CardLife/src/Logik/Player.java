package Logik;
/**
 * Verwaltet die Daten die zum Spieler gehören
 * @param lifepool
 * @param name
 * @param aktuelleKarte
 * @author Rusty Schaerli und Matthias Weissen
 * @version 1.0
 */
public class Player {
	
	private int lifepool;
	private String name;	
	private int aktuelleKarte;
	/**
	 * Setzt die Variablen name und lifepool
	 */
	public Player(String name, int lifepool ){
		this.name = name;
		this.lifepool = lifepool;	
	}
	/**
	 * Gibt den Wert aus der Variable lifepool zurück
	 * @return lifepool
	 */
	public int getLifepool() {
		return lifepool;
	}
	/**
	 * Setzt die Variable lifepool
	 * @param lifepool
	 */
	public void setLifepool(int lifepool) {
		this.lifepool = lifepool;
	}
	/**
	 * Gibt den Wert der Variable name zurück
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setzt die Variable name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Gibt den Wert der Variable aktuelleKarte zurück
	 * @return aktuelleKarte
	 */
	public int getAktuelleKarte() {
		return aktuelleKarte;
	}
	/**
	 * Setzt die Variable aktuelleKarte
	 */
	public void setAktuelleKarte(int aktuelleKarte) {
		this.aktuelleKarte = aktuelleKarte;
	}



}
