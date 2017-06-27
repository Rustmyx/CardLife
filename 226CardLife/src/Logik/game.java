package Logik;

public class game {

	private	Player Spieler1 = new Player("Spieler 1", 30);
	private	Player Spieler2 = new Player("Spieler 2", 30);
	private	StandardDeck StandardDeck = new StandardDeck();
	private	JokerDeck JokerDeck = new JokerDeck();
	
	private boolean joker;
	
	private boolean end = false;

	private String winner;
	
	public game(){
		
	}
	//Init ruft diverse Methoden auf welche den Spielverlauf besimmen
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
	
	public boolean isJoker() {
		return joker;
	}

	public void setJoker(boolean joker) {
		this.joker = joker;
	}

	public boolean isEnd() {
		return end;
	}

	public void setEnd(boolean end) {
		this.end = end;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	public Player getSpieler1() {
		return Spieler1;
	}

	public void setSpieler1(Player spieler1) {
		Spieler1 = spieler1;
	}

	public Player getSpieler2() {
		return Spieler2;
	}

	public void setSpieler2(Player spieler2) {
		Spieler2 = spieler2;
	}

	public StandardDeck getStandardDeck() {
		return StandardDeck;
	}

	public void setStandardDeck(StandardDeck standardDeck) {
		StandardDeck = standardDeck;
	}

	public JokerDeck getJokerDeck() {
		return JokerDeck;
	}

	public void setJokerDeck(JokerDeck jokerDeck) {
		JokerDeck = jokerDeck;
	}
	//Vergleicht die gezogenen Karten und zieht entsprechend Leben ab
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
	//Zieht eine Karte und setzt den aktuellen Kartenwert
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
		
	}//Ueberprueft ob das Leben unter 0 fällt und setzt falls dies der Fall ist das Leben auf 0
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
	}//Ueberprueft ob ein Spieler einen gewissen "Lifepool" erreicht hat und bestimmt anhand dessen einen gewinner
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
