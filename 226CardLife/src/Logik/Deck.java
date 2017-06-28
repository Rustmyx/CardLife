package Logik;
import java.util.ArrayList;
/**
 * Abstrakte Klasse die an die beiden Deckklassen (StandardDeck, JokerDeck) vererbt
 * @param zieher
 * @param aktuelleKarte
 * @array Cards
 * @author Rusty Schaerli und Matthias Weissen
 * @version 1.0
 */
public abstract class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	private int zieher;
	
	private Card aktuelleKarte;
	/**
	 * Constructor
	 */
	public Deck(){
		
	}
	/**
	 * Gibt den Wert der Variable aktuelleKarte zurück
	 * @return aktuelleKarte
	 */
	public int getKartenWert(){
		return aktuelleKarte.getKartenWert();
	}
	/**
	 * Methoden die Vererbt werden
	 */
	abstract Card getCard();
	abstract void addCard();
	/**
	 * Gibt den Wert aus der Variable cards zurück
	 * @return cards
	 */
	public ArrayList<Card> getCards() {
		return cards;
	}
	/**
	 * Setzt die Variable cards
	 * @param cards
	 */
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	/**
	 * Gibt den Wert der Variable zieher zurück
	 * @return zieher
	 */
	public int getZieher() {
		return zieher;
	}
	/**
	 * Setzt die Variable zieher
	 * @param zieher
	 */
	public void setZieher(int zieher) {
		this.zieher = zieher;
	}
	/**
	 * Gibt den Wert der Variable aktuelleKarte zurück
	 * @return aktuelleKarte
	 */
	public Card getAktuelleKarte() {
		return aktuelleKarte;
	}
	/**
	 * Setzt den Wert der Varible aktuelleKarte
	 * @param aktuelleKarte
	 */
	public void setAktuelleKarte(Card aktuelleKarte) {
		this.aktuelleKarte = aktuelleKarte;
	}
	
	

	
	
}
