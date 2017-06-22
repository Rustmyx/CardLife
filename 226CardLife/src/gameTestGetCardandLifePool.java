import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gameTestGetCardandLifePool {
	
	game g;
	

	@Before
	public void setUp() throws Exception {
		g = new game();

	}

	@Test
	public void testInit() {
		
		g.getStandardDeck().addCard();
		g.setJoker(false);
		g.getCard();
		
		assertTrue(g.getSpieler1().getLifepool()==29);
		assertTrue(g.getSpieler1().getAktuelleKarte()==0==false);
		
		
		
		
		
	}

	@Test
	public void testWinner(){
		g.getSpieler1().setLifepool(1);
		g.checkWinner();
		
		assertTrue(g.getSpieler1().getAktuelleKarte()==0);
		assertTrue(g.isEnd()==true);
	}
}
