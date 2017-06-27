package Logik;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StandardDeckTestGetCard {
	
	StandardDeck sd;

	@Before
	public void setUp() throws Exception {
		
		sd = new StandardDeck();
		
	}

	@Test	//Testet ob die gezogene Karte aus dem Array entfernt wird
	public void testGetCard() {
		sd.addCard();
		sd.getCard();
		assertTrue(sd.getCards().contains(sd.getZieher())==false);
	}

}
