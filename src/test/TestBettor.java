package test;

import junit.framework.TestCase;
import bettors.Bettor;

public class TestBettor extends TestCase {
	
	Bettor b;

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestBettor.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		b = new Bettor("David", 10);
	}

	/*
	 * Test method for 'bettors.Bettor.toString()'
	 */
	public void testToString() {
		System.out.println("\n"+b.toString());
	}

	/*
	 * Test method for 'bettors.Bettor.amount()'
	 */
	public void testAmount() {
		assertEquals(10, b.amount());
	}
	
	/*
	 * Test method for 'bettors.Bettor.name()'
	 */
	public void testName() {
		assertEquals("David", b.name());
	}
	
	public void testEquals() {
		assertTrue(b.equals(new Bettor("David",1)));
	}
	
	public void testCompare() {
		Bettor b1, b2;
		b1 = new Bettor("David",10);
		b2 = new Bettor("Albert", 10);
		
		assertTrue(b2.compareTo(b1)<0);
	}

}
