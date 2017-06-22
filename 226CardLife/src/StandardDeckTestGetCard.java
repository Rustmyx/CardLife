import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StandardDeckTestGetCard {
	
	StandardDeck sd;

	@Before
	public void setUp() throws Exception {
		
		sd = new StandardDeck();
		
	}

	@Test
	public void testGetCard() {
		sd.addCard();
		sd.getCard();
		assertTrue(sd.getCards().contains(sd.getZieher())==false);
	}

}
