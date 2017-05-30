
public class JokerCard implements Card{
	
	private String Kartenname;
	private int Kartenwert;
	
	public JokerCard(String Kartenname, int Kartenwert){
	
		this.Kartenname=Kartenname;
		this.Kartenwert=Kartenwert;
		
	}
	
	public int getKartenWert(){
		return Kartenwert;
	}

}
