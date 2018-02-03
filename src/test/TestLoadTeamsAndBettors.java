package test;

import java.util.Iterator;

import junit.framework.TestCase;
import superbowl.LoadTeamsAndBettors;
import bettors.Bettor;
import bettors.BettorList;

public class TestLoadTeamsAndBettors extends TestCase {

	LoadTeamsAndBettors ltb;

	protected void setUp() throws Exception {
		super.setUp();
		ltb = new LoadTeamsAndBettors("teams.txt", "bettors2.txt");
	}

	/*
	 * Test method for
	 * 'superbowl.LoadTeamsAndBettors.LoadTeamsAndBettors(String)'
	 */
	public void testLoadTeamsAndBettors() {
	}


	/*
	 * Test method for 'superbowl.LoadTeamsAndBettors.getBettors()'
	 */
	public void testGetBettors() {
		BettorList b = ltb.getBettors();
		assertEquals(114, b.pot());
		System.out.println("Orig");
		bo(b);
		System.out.println("Name");
		b.SortName();
		bo(b);
		System.out.println("Desc");
		b.SortDesc();
		bo(b);
		System.out.println("Asc");
		b.SortAsc();
		bo(b);
	}
		
	private void bo(BettorList b) {
		Iterator i = b.iterator();
		while(i.hasNext()) {
			Bettor nb = (Bettor)i.next();
			System.out.println(nb.toString());
		}
	}

}
