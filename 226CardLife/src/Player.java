
public class Player {
	
	public int lifepool;
	public String name;
	

	
	//Variable f�r aktive Karte
	
	
	
	int aktuelleKarte;
	
	public Player(String name, int lifepool ){
		this.name = name;
		this.lifepool = lifepool;
		
	}
	//SwitchCase f�r Kartenauslese aus Deck
	void getCard() {
		
		game.StandardDeck.getCard();
		aktuelleKarte = game.StandardDeck.getKartenWert();
		lifepool = lifepool - 1;
		
		
	}

}
