/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package test;

import scores.Score;
import junit.framework.TestCase;

/**
 * @author tdls5
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestScore extends TestCase {

	/**
	 * Constructor for TestScore.
	 * @param arg0
	 */
	public TestScore(String arg0) {
		super(arg0);
	}
	

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestScore.class);
	}
	
	public void testCompareTo() {
		Score score1 = new Score(0,0);
		Score score2 = new Score(0,1);
		Score score3 = new Score(1,0);
		Score score4 = new Score(1,1);
		Score score5 = new Score(0,0);
		Score score6 = new Score(1,1);
		Score score7 = new Score(0,1);
		Score score8 = new Score(1,0);
		

		assertNotNull(score1);
		assertNotNull(score2);
		assertNotNull(score3);
		assertNotNull(score4);
		assertEquals(-1, score1.compareTo(score3));
		assertEquals(-1, score1.compareTo(score4));
		assertEquals(-1, score2.compareTo(score3));
		assertEquals(-1, score2.compareTo(score4));
		assertEquals(-1, score1.compareTo(score2));
		assertEquals(-1, score3.compareTo(score4));
		assertEquals(1, score2.compareTo(score1));
		assertEquals(1, score3.compareTo(score1));
		assertEquals(1, score4.compareTo(score1));
		assertEquals(1, score4.compareTo(score2));
		assertEquals(1, score4.compareTo(score3));
		assertEquals(0, score1.compareTo(score5));
		assertEquals(0, score4.compareTo(score6));
		assertEquals(0, score6.compareTo(score4));
		assertEquals(0, score7.compareTo(score2));
		assertEquals(0, score2.compareTo(score7));
		assertEquals(0, score8.compareTo(score3));
		assertEquals(0, score3.compareTo(score8));
		assertEquals(0, score1.compareTo(score1));
		assertEquals(0, score2.compareTo(score2));
	}
}
