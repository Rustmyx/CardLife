package Logik;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
	/**
	 * Hier ist ein UnitTest zu der Lifepool verringerung beim Kartenziehen
 	* @param g
 	* @author Rusty Schaerli und Matthias Weissen
 	* @version 1.0
 	*/
public class gameTestNegativLifepool {

	game g;

	@Before
	public void setUp() throws Exception {
		
		g = new game();

		
	}
	/**
	 * Testet ob der Negative Lifepool korrekt ueberprueft wird und auf 0 gesetzt wird
	 */
	public void testGetCard() {
		
	
		
		g.getSpieler1().setLifepool(-1);
		g.checkNegativeLifepool();
		g.getSpieler2().setLifepool(-1);
		g.checkNegativeLifepool();
		
		
		
		assertTrue(g.getSpieler1().getLifepool() == 0);
		assertTrue(g.getSpieler2().getLifepool() == 0);
		
	}

}
