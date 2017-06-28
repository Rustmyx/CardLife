
package Logik;
/**
 * @author Rusty Schaerli und Matthias Weissen
 * @version 1.0
 */
import java.util.Random;
/**
 * Hier werden die Karten für das Deck initialisiert
 */
public class JokerDeck extends Deck {
	
	private	Card card1 = new NumberCard("eins", 1);
	private	Card card2 = new NumberCard("zwei", 2);
	private	Card card3 = new NumberCard("drei", 3);
	private	Card card4 = new NumberCard("vier", 4);
	private	Card card5 = new NumberCard("fünf", 5);
	private	Card card6 = new NumberCard("sechs", 6);
	private	Card card7 = new NumberCard("sieben", 7);
	private	Card card8 = new NumberCard("acht", 8);
	private	Card card9 = new NumberCard("neun", 9);
	private	Card card10 = new NumberCard("zehn", 10);
	private	Card joker = new JokerCard("joker", 15);
	/**
	 * Hier wird die Random() Funktion in eine Variable gespeichert
	 */
	private Random r = new Random();
	
	/**
	 * ruft den Konstruktor der Super-Klasse (Deck) auf
	 */
	public JokerDeck() {
		super();
	}	
	/**
	 * Zieht eine Karte aus der ArrayList und speichert die gezogene Karte in die Variable AktuelleKarte
	 * @return getAktuelleKarte()
	 */
	public Card getCard() {
		setZieher(r.nextInt(getCards().size()));
		setAktuelleKarte(getCards().get(getZieher()));
		getCards().remove(getZieher());
		return getAktuelleKarte();
	}
	/**
	 * Hier werden die oben erstellten Objekte in der richtigen Anzahl in die Arraylist hinzugefügt 
	 */
	public void addCard() {

		getCards().add(card1);
		getCards().add(card1);
		getCards().add(card1);
		getCards().add(card1);
		getCards().add(card1);
	
		getCards().add(card2);
		getCards().add(card2);
		getCards().add(card2);
		getCards().add(card2);
		getCards().add(card2);
	
		getCards().add(card3);
		getCards().add(card3);
		getCards().add(card3);
		getCards().add(card3);
		getCards().add(card3);
		
		getCards().add(card4);
		getCards().add(card4);
		getCards().add(card4);
		getCards().add(card4);
		getCards().add(card4);
	
		getCards().add(card5);
		getCards().add(card5);
		getCards().add(card5);
		getCards().add(card5);
		getCards().add(card5);
		
		getCards().add(card6);
		getCards().add(card6);
		getCards().add(card6);
		getCards().add(card6);
		getCards().add(card6);
		
		getCards().add(card7);
		getCards().add(card7);
		getCards().add(card7);
		getCards().add(card7);
		getCards().add(card7);
		
		getCards().add(card8);
		getCards().add(card8);
		getCards().add(card8);
		getCards().add(card8);
		getCards().add(card8);
		
		getCards().add(card9);
		getCards().add(card9);
		getCards().add(card9);
		getCards().add(card9);
		getCards().add(card9);
		
		getCards().add(card10);
		getCards().add(card10);
		getCards().add(card10);
		getCards().add(card10);
		getCards().add(card10);
		
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		getCards().add(joker);
		
		
	}
	

}
