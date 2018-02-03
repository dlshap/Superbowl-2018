package test;

import junit.framework.TestCase;
import scores.ScoreCard;
import bettors.Bettor;
import bettors.BettorList;

public class TestScoreCard extends TestCase {
	
	BettorList bl = new BettorList();
	ScoreCard sc;

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestScoreCard.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		bl.addBettor(new Bettor("David",15));	
		bl.addBettor(new Bettor("Josh",5));		
		bl.addBettor(new Bettor("Bob",7));		
		bl.addBettor(new Bettor("Wanda",16));	
		bl.addBettor(new Bettor("Cindy Lou",20));
		sc = new ScoreCard(bl);
		System.out.println(sc.toString());
	}
	
	public void testScoreCard() {
	
	}

}
