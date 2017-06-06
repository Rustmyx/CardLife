import java.util.Random;

public class StandardDeck extends Deck {	
	
	
	NumberCard cardeins1 = new NumberCard("eins", 1);
	NumberCard cardzwei1 = new NumberCard("zwei", 2);
	NumberCard carddrei1 = new NumberCard("drei", 3);
	NumberCard cardvier1 = new NumberCard("vier", 4);
	NumberCard cardfuenf1 = new NumberCard("fünf", 5);
	NumberCard cardsechs6 = new NumberCard("sechs", 6);

	
	Random r = new Random();
	
	public StandardDeck() {
		super();
		
	}
	
	
	public int getKartenWert(){
		return aktuelleKarte.getKartenWert();
	}


	Card getCard() {
		
		zieher = r.nextInt(cards.size());
	
		aktuelleKarte = cards.get(zieher);
		cards.remove(zieher);
		
		return aktuelleKarte;
	}


	
	void addCard() {
		
		cards.add(cardeins1);
		cards.add(cardeins1);
		for(Card i : cards) {
			System.out.println(i.getKartenWert());
		}
		
		
	}
	

}
