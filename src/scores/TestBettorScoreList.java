package scores;

import java.util.Iterator;

import junit.framework.TestCase;
import bettors.Bettor;

public class TestBettorScoreList extends TestCase {

	BettorScoreList bsl = new BettorScoreList();

	public static void main(String[] args) {
		TestBettorScoreList t = new TestBettorScoreList();
		t.setUp();
}

	protected void setUp()  {
		ScoreList sl = new ScoreList();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				sl.addScore(new Score(i, j));
			}
		}

		Iterator i = sl.shuffledIterator();
		Bettor b = new Bettor("David", 5);

		for (int j = 0; j < sl.size() / 2; j++) {
			bsl.addBettorAndScore(b, (Score) i.next());
		}
		b = new Bettor("Albert", 10);
		while (i.hasNext()) {
			bsl.addBettorAndScore(b, (Score) i.next());
		}
		System.out.println("orig:\n"+bsl.toString());
		testScoreIterator();
		testNameIterator();
		testToString();
	}

	/*
	 * Test method for 'scores.ScoreList.scoreIterator()'
	 */
	public void testScoreIterator() {
		System.out.println("by score:");
		Iterator i = bsl.iteratorByScore();
		while (i.hasNext()) {
			System.out.println((BettorScore) i.next());
		}
	}

	public void testNameIterator() {
		System.out.println("by name:");
		Iterator i = bsl.iteratorByName();
		while (i.hasNext()) {
			System.out.println((BettorScore) i.next());
		}
	}
	
	public void testToString() {
		System.out.println("by name:");
		System.out.println(bsl.toString(bsl.iteratorByName()));
		System.out.println("by score:");
		System.out.println(bsl.toString(bsl.iteratorByScore()));
	}
}
