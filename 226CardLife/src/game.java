
public class game {

	Player Spieler1 = new Player("Spieler 1", 30);
	Player Spieler2 = new Player("Spieler 2", 30);
	StandardDeck StandardDeck = new StandardDeck();
	
	public game(){
		
	}
	
	
	
	void combat(){
		if(Spieler1.aktuelleKarte > Spieler2.aktuelleKarte){
			Spieler2.lifepool = Spieler2.lifepool - (Spieler1.aktuelleKarte - Spieler2.aktuelleKarte);
		}
		else if(Spieler2.aktuelleKarte > Spieler1.aktuelleKarte){
			Spieler1.lifepool = Spieler1.lifepool - (Spieler2.aktuelleKarte - Spieler1.aktuelleKarte);
		}
		else if(Spieler1.aktuelleKarte == Spieler2.aktuelleKarte){
			Spieler1.lifepool = Spieler1.lifepool;
			Spieler2.lifepool = Spieler2.lifepool;
		}
	}
	
	void getCard() {
		
		StandardDeck.getCard();
		Spieler1.aktuelleKarte = StandardDeck.getKartenWert();
		Spieler1.lifepool = Spieler1.lifepool - 1
		StandardDeck.getCard();
		Spieler2.aktuelleKarte = StandardDeck.getKartenWert();
		Spieler2.lifepool = Spieler2.lifepool - 1
		
		
	}
	
}
