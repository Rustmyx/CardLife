package Logik;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
	/**
	 * @param g
	 * @author Rusty Schaerli und Matthias Weissen
	 * @version 1.0
	 */
public class gameTestGetCardandLifePool {
	
	game g;
	

	@Before
	public void setUp() throws Exception {
		g = new game();

	}
 /**
  * Testet ob beim ziehen einer Karte dem Lifepool 1 Leben abgezogen wird und ob der Wert der gezogenen Karte in die Variable gesetzt wird
  */
	@Test
	public void testInit() {
		
		g.getStandardDeck().addCard();
		g.setJoker(false);
		g.getCard();
		
		assertTrue(g.getSpieler1().getLifepool()==29);
		assertTrue(g.getSpieler1().getAktuelleKarte()==0==false);
		
		
		
		
		
	}
 /**
  * Testet ob der Gewinner korrekt bestimmt wird. Da beim Ziehen einer Karte 1 Leben abgezogen wird sollte auch keine neue Karte gespeichert werden und der gewinner bestimmt werden
  */
	@Test
	public void testWinner(){
		g.getSpieler1().setLifepool(1);
		g.checkWinner();
		
		assertTrue(g.getSpieler1().getAktuelleKarte()==0);
		assertTrue(g.isEnd()==true);
	}
}
