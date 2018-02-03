package test;

import junit.framework.TestCase;
import superbowl.GameConstants;

public class TestGameOptions extends TestCase {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestGameOptions.class);
	}
	
	public void testOptions() {
		assertEquals("<br>", GameConstants.breakString());
	}

}
