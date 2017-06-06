import java.util.ArrayList;

public abstract class Deck {
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public int zieher;
	
	public Card aktuelleKarte;
	
	public Deck(){
		
	}
	
	abstract int getKartenWert();
	abstract Card getCard();
	abstract void addCard();
	
	
	//ArrayList
	//MethodeKartenZiehen
	//Add Method
	
	
}
