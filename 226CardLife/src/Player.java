
public class Player {
	
	public int lifepool;
	public String name;
	//Variable f�r aktive Karte
	
	StandardDeck StandardDeck = new StandardDeck();
	
	public Player(String name, int lifepool ){
		this.name = name;
		this.lifepool = lifepool;
		
	}
	//SwitchCase f�r Kartenauslese aus Deck

}
