package scores;

import junit.framework.TestCase;
import bettors.Bettor;

public class TestBettorScoreSortByNameAndScore extends TestCase {

	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestBettorScoreSortByNameAndScore.class);
	}

	/*
	 * Test method for 'scores.BettorScoreSortByNameAndScore.compare(Object, Object)'
	 */
	public void testCompare() {
		BettorScore b1,b2;
		b1 = new BettorScore(new Bettor("Bob",10),
				new Score(0,2));
		b2 = new BettorScore(new Bettor("Bob",10), 
				new Score(1,1));
		int i = (new BettorScoreSortByNameAndScore()).compare(b1,b2);
		System.out.println(i);
	}

}
