package Logik;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gameTestNegativLifepool {

	game g;

	
	@Before
	public void setUp() throws Exception {
		
		g = new game();

		
	}

	@Test
	public void testGetCard() {
		
	
		
		g.getSpieler1().setLifepool(-1);
		g.checkNegativeLifepool();
		g.getSpieler2().setLifepool(-1);
		g.checkNegativeLifepool();
		
		
		
		assertTrue(g.getSpieler1().getLifepool() == 0);
		assertTrue(g.getSpieler2().getLifepool() == 0);
		
	}

}
