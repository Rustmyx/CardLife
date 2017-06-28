package Logik;
/**
 * Hier werden Objekte für die beiden Spieler erstellt und die Parameter mitgeliefert
 * Hier werden Objekte für die beiden Decks erstellt
 * @param joker
 * @param end
 * @param winner
 * @author Rusty Schaerli und Matthias Weissen
 * @version 1.0
 */
public class game {
	private	Player Spieler1 = new Player("Spieler 1", 30);
	private	Player Spieler2 = new Player("Spieler 2", 30);
	private	StandardDeck StandardDeck = new StandardDeck();
	private	JokerDeck JokerDeck = new JokerDeck();
	
	private boolean joker;
	
	private boolean end = false;

	private String winner;
	/**
	 * Constructor
	 */
	public game(){
		
	}
	/**
	 * Wird aufgerufen bei dem ziehen einer Karte
	 * prüft den Lifepool und zieht eine Karte
	 * prüft falls jemand gewonnen hat 
	 */
	public void init(){
		
		checkWinner();
		getCard();
		checkWinner();
		if(end == false){
		combat();
		checkNegativeLifepool();
		checkWinner();
		}
		
	}
	/**
	 * Gibt den Wert aus der Variable joker zurück
	 * @return joker
	 */
	public boolean isJoker() {
		return joker;
	}
	/**
	 * Setzt die Variable joker
	 * @param joker
	 */
	public void setJoker(boolean joker) {
		this.joker = joker;
	}
	/**
	 * Gibt den Wert aus der Variable end zurück
	 * @return end
	 */
	public boolean isEnd() {
		return end;
	}
	/** 
	 * Setzt die Variable end
	 * @param end
	 */
	public void setEnd(boolean end) {
		this.end = end;
	}
	/**
	 * Gibt den Wert aus der Variable winner zurück
	 * @return winner
	 */
	public String getWinner() {
		return winner;
	}
	/**
	 * Setzt die Variable winner
	 * @param winner
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	/**
	 * Gibt den Wert aus der Variable Spieler1 zurück
	 * @return Spieler1
	 */
	public Player getSpieler1() {
		return Spieler1;
	}
	/**
	 * Setzt die Variable Spieler1
	 * @param Spieler1
	 */
	public void setSpieler1(Player spieler1) {
		Spieler1 = spieler1;
	}
	/**
	 * Gibt den Wert aus der Variable Spieler2 zurück
	 * @return Spieler2
	 */
	public Player getSpieler2() {
		return Spieler2;
	}
	/**
	 * Setzt die Variable Spieler2
	 * @param Spieler2
	 */
	public void setSpieler2(Player spieler2) {
		Spieler2 = spieler2;
	}
	/**
	 * Gibt den Wert aus der Variable StandardDeck zurück
	 * @return StandardDeck
	 */
	public StandardDeck getStandardDeck() {
		return StandardDeck;
	}
	/**
	 * Setzt die Variable StandardDeck
	 * @param StandardDeck
	 */
	public void setStandardDeck(StandardDeck standardDeck) {
		StandardDeck = standardDeck;
	}
	/**
	 * Gibt den Wert aus der Variable JokerDeck zurück
	 * @return
	 */
	public JokerDeck getJokerDeck() {
		return JokerDeck;
	}
	/**
	 * Setzt die Variable JokerDeck
	 * @param jokerDeck
	 */
	public void setJokerDeck(JokerDeck jokerDeck) {
		JokerDeck = jokerDeck;
	}
	/**
	 * Vergleicht die gezogenen Karten und zieht entsprechend Leben ab
	 */
	public void combat(){
		if(Spieler1.getAktuelleKarte() > Spieler2.getAktuelleKarte()){
			Spieler2.setLifepool(Spieler2.getLifepool()- (Spieler1.getAktuelleKarte() - Spieler2.getAktuelleKarte()));
		}
		else if(Spieler2.getAktuelleKarte() > Spieler1.getAktuelleKarte()){
			Spieler1.setLifepool(Spieler1.getLifepool()- (Spieler2.getAktuelleKarte() - Spieler1.getAktuelleKarte()));
			}
		else if(Spieler1.getAktuelleKarte() == Spieler2.getAktuelleKarte()){
		
		}
	}

	/**
	 * Zieht eine Karte und setzt den aktuellen Kartenwert
	 * bei jedem ziehen wird ein Leben abgezogen
	 */
	public void getCard() {
	
		
		if (joker == false){
			StandardDeck.getCard();
			Spieler1.setAktuelleKarte(StandardDeck.getKartenWert());
			Spieler1.setLifepool(Spieler1.getLifepool()-1);
			StandardDeck.getCard();
			Spieler2.setAktuelleKarte(StandardDeck.getKartenWert());
			Spieler2.setLifepool(Spieler2.getLifepool()-1);
		}else if(joker == true){
			JokerDeck.getCard();
			Spieler1.setAktuelleKarte(JokerDeck.getKartenWert());
			Spieler1.setLifepool(Spieler1.getLifepool()-1);
			JokerDeck.getCard();
			Spieler2.setAktuelleKarte(JokerDeck.getKartenWert());
			Spieler2.setLifepool(Spieler2.getLifepool()-1);
		}
		
	}
	/**
	 *  Prüft ob der Lifepool eines Spielers unter 0 ist
	 *  Falls ja, wird der Lifepool auf 0 gesetzt
	 */
	public void checkNegativeLifepool(){
		if(Spieler1.getLifepool()<0){
			Spieler1.setLifepool(0);
		}
		else if(Spieler2.getLifepool()<0){
			Spieler2.setLifepool(0);
		}
		else if(Spieler1.getLifepool()<0 && Spieler2.getLifepool()<0){
			Spieler1.setLifepool(0);
			Spieler2.setLifepool(0);
		}
	}
	/**
	 * Prüft ob ein Spieler gewonnen hat
	 * Ein Spieler hat gewonnen sobald der Lifepool auf 1 fällt
	 */
	public void checkWinner(){
		
		if(Spieler1.getLifepool() <= 1){
			
			winner = Spieler2.getName();
			end = true;
			
		}
		else if (Spieler2.getLifepool() <= 1){
			
			winner = Spieler1.getName();
			end = true;
			
		}
		else if (Spieler1.getLifepool() <= 1 && Spieler2.getLifepool() <= 1){
			
			winner = "Niemand";
			end = true;
			
		}
		
	}
	
}
