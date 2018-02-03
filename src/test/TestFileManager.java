/*
 * Created on Dec 6, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package test;

import java.util.Iterator;

import superbowl.GameConstants;

import fileio.FileManager;
import fileio.LineParser;


/**
 * @author tdls5
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestFileManager {

	public static void main(String[] args) {
		
		String line = null;
		
		FileManager cr = new FileManager("bettors.txt", GameConstants.FILEREAD);
		while ((line = cr.readALine()) != null) {
			System.out.println(line);
			printTokens(line);
		}
		cr.closeFile();
	}
	
	public static void printTokens(String line) {
		LineParser lp = new LineParser(line);
		Iterator i = lp.getTokens().iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
	
}
