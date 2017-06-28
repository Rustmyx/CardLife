
package Logik;
	/**
	 * Hier wird das Interface Card implementiert
	 * @author Rusty Schaerli und Matthias Weissen
	 * @version 1.0
	 */
public class NumberCard implements Card {

	private String Kartenname;
	private int Kartenwert;
	/**
	 * @param Kartenname
	 * @param Kartenwert
	 */
	public NumberCard(String Kartenname, int Kartenwert){
	
		this.Kartenname=Kartenname;
		this.Kartenwert=Kartenwert;
		
	}
	/**
	 * @return Kartenwert
	 */
	public int getKartenWert(){
		return Kartenwert;
	}
	/**
	 * @return Kartenname
	 */
	public String getKartenName(){
		return Kartenname;
	}

}
