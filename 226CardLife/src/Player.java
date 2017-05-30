
public class Player {
	
	public int lifepool;
	public String name;
	//Variable für aktive Karte
	
	StandardDeck StandardDeck = new StandardDeck();
	
	public Player(String name, int lifepool ){
		this.name = name;
		this.lifepool = lifepool;
		
	}
	//SwitchCase für Kartenauslese aus Deck

}
