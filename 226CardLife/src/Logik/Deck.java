package Logik;
import java.util.ArrayList;
//Abstrakte Klasse f�r die Vererbung an die Deck-Klassen
public abstract class Deck {
	//Arry mit Kartenobjekten
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	private int zieher;
	
	private Card aktuelleKarte;
	
	public Deck(){
		
	}
	
	public int getKartenWert(){
		return aktuelleKarte.getKartenWert();
	}
	
	abstract Card getCard();
	abstract void addCard();

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public int getZieher() {
		return zieher;
	}

	public void setZieher(int zieher) {
		this.zieher = zieher;
	}

	public Card getAktuelleKarte() {
		return aktuelleKarte;
	}

	public void setAktuelleKarte(Card aktuelleKarte) {
		this.aktuelleKarte = aktuelleKarte;
	}
	
	

	
	
}
