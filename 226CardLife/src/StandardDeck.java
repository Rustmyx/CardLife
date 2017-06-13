import java.util.Random;

public class StandardDeck extends Deck {	
	
	
	NumberCard card1 = new NumberCard("eins", 1);
	NumberCard card2 = new NumberCard("zwei", 2);
	NumberCard card3 = new NumberCard("drei", 3);
	NumberCard card4 = new NumberCard("vier", 4);
	NumberCard card5 = new NumberCard("fünf", 5);
	NumberCard card6 = new NumberCard("sechs", 6);
	NumberCard card7 = new NumberCard("sieben", 7);
	NumberCard card8 = new NumberCard("acht", 8);
	NumberCard card9 = new NumberCard("neun", 9);
	NumberCard card10 = new NumberCard("zehn", 10);

	
	Random r = new Random();
	
	public StandardDeck() {
		super();
		
	}


	public Card getCard() {
		
		zieher = r.nextInt(cards.size());
	
		aktuelleKarte = cards.get(zieher);
		cards.remove(zieher);
		
		return aktuelleKarte;
	}


	
	public void addCard() {
		
		cards.add(card1);
		cards.add(card1);
		for(Card i : cards) {
			System.out.println(i.getKartenWert());
		}
		
		
	}
	

}
