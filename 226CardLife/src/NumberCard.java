
public class NumberCard implements Card {

	private String Kartenname;
	private int Kartenwert;
	
	public NumberCard(String Kartenname, int Kartenwert){
	
		this.Kartenname=Kartenname;
		this.Kartenwert=Kartenwert;
		
	}
	
	public int getKartenWert(){
		return Kartenwert;
	}

}
