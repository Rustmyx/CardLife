package Logik;

import java.util.Random;

public class StandardDeck extends Deck {	
	
	
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

	
	private Random r = new Random();
	
	public StandardDeck() {
		super();
		
	}


	public Card getCard() {
		
		setZieher(r.nextInt(getCards().size()));
		setAktuelleKarte(getCards().get(getZieher()));
		getCards().remove(getZieher());
		return getAktuelleKarte();
	}


	
	public void addCard() {
		
		getCards().add(card1);
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
		getCards().add(card2);
		getCards().add(card3);
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
		getCards().add(card4);
		getCards().add(card5);
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
		getCards().add(card6);
		getCards().add(card7);
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
		getCards().add(card8);
		getCards().add(card9);
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
		getCards().add(card10);
		
		
		
	}
	

}
