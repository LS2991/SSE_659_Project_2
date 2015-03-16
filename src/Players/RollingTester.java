package Players;

import static org.junit.Assert.*;

import org.junit.Test;

public class RollingTester {

	@Test
	public void rollTest() throws InterruptedException {
		Turnbase turn1 = new Turnbase();
		Turnbase turn2 = new Turnbase();
		
		int scoreT1 = 0;
		int scoreT2 = 0;
				
		scoreT1 = Players.roll(turn1, 1);
		scoreT2 = Players.roll(turn2, 2);
		
		
		assertTrue(scoreT1 > 0);
		assertTrue(scoreT2 > 0);
	}
	
	@Test
	public void checkWinner() throws InterruptedException {
	
		int scoreT1 = 15;
		int scoreT2 = 5;
		int scoreT3 = 6;
		
		if (scoreT1 >= 15) {
            assertEquals(("Team " + 1 + " Wins with score of " + scoreT1), Players.EndGame(1, scoreT1));
        } else if (scoreT2 >= 15) {
            fail();
        } else if (scoreT3 >= 15) {
            fail();
        }
		
		scoreT1 = 5;
		scoreT2 = 15;
		scoreT3 = 7;
		
		if (scoreT1 >= 15) {
            fail();
        } else if (scoreT2 >= 15) {
        	assertEquals(("Team " + 2 + " Wins with score of " + scoreT2), Players.EndGame(2, scoreT2));
        } else if (scoreT3 >= 15) {
            fail();
        }
		
		scoreT1 = 5;
		scoreT2 = 8;
		scoreT3 = 15;
		
		if (scoreT1 >= 15) {
            fail();
        } else if (scoreT2 >= 15) {
            fail();
        } else if (scoreT3 >= 15) {
        	assertEquals(("Team " + 3 + " Wins with score of " + scoreT3), Players.EndGame(3, scoreT3));
        }
	}

}
