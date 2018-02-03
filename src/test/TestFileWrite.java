package test;

import junit.framework.TestCase;
import superbowl.GameConstants;
import fileio.FileManager;

public class TestFileWrite extends TestCase {
	
	FileManager fm;

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestFileWrite.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		fm = new FileManager("ScoreCard.html", 
				GameConstants.FILEWRITE,
				GameConstants.HTMLTYPE);
		}

	/*
	 * Test method for 'fileio.FileManager.FileManager(String, int)'
	 */
	public void testFileManager() {

	}

	/*
	 * Test method for 'fileio.FileManager.writeALine(String)'
	 */
	public void testWriteALine() {
		fm.writeALine("Mary had a little lamb");
		fm.writeALine("Little Lamb, Little Lamb");
		fm.writeALine("And everywhere that Mary went");
		fm.writeALine("She served lambchops for dinner.");
		fm.closeFile();
	}

	/*
	 * Test method for 'fileio.FileManager.closeFile()'
	 */

}
