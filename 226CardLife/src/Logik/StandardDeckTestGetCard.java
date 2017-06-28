package Logik;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
/**
 * @param sd
 * @author Rusty Schaerli und Matthias Weissen
 * @version 1.0
 */
public class StandardDeckTestGetCard {
	
	StandardDeck sd;
	
	@Before
	public void setUp() throws Exception {
		
		sd = new StandardDeck();
		
	}
	/**
	 * Testet ob die gezogene Karte aus dem Array entfernt wird
	 */
	@Test	
	public void testGetCard() {
		sd.addCard();
		sd.getCard();
		assertTrue(sd.getCards().contains(sd.getZieher())==false);
	}

}
