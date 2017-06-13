
public class game {

	Player Spieler1 = new Player("Spieler 1", 30);
	Player Spieler2 = new Player("Spieler 2", 30);
	StandardDeck StandardDeck;
	JokerDeck JokerDeck;
	
	public boolean joker;
	
	public game(){
		
	}
	
	
	
	public void combat(){
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
	
	public void getCard() {
	
		
		if (joker == false){
			StandardDeck.getCard();
			Spieler1.aktuelleKarte = StandardDeck.getKartenWert();
			Spieler1.lifepool = Spieler1.lifepool - 1;
			System.out.println(Spieler1.lifepool);
			StandardDeck.getCard();
			Spieler2.aktuelleKarte = StandardDeck.getKartenWert();
			Spieler2.lifepool = Spieler2.lifepool - 1;
		}else if(joker == true){
			JokerDeck.getCard();
			Spieler1.aktuelleKarte = JokerDeck.getKartenWert();
			Spieler1.lifepool = Spieler1.lifepool - 1;
			System.out.println(Spieler1.lifepool);
			JokerDeck.getCard();
			Spieler2.aktuelleKarte = JokerDeck.getKartenWert();
			Spieler2.lifepool = Spieler2.lifepool - 1;
			
			
		}
		
	}
	
}
