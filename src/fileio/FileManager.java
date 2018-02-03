/*
 * Created on Dec 6, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import superbowl.GameConstants;

/**
 * @author tdls5
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class FileManager {

	BufferedReader reader;

	BufferedWriter writer;

	int fileMode;

	int fileType = GameConstants.HTMLTYPE;

	/**
	 * 
	 */
	public FileManager(String fileName, int filemode, int filetype) {
		super();
		// open file
		this.openFile(fileName, filemode);
		this.fileMode = filemode;
		this.fileType = filetype;
	}
	
	public FileManager(String fileName, int filemode) {
		super();
		// open file
		this.openFile(fileName, filemode);
		this.fileMode = filemode;
	}


	private void openFile(String fname, int filemode) {
		File myFile = new File(fname);
		if (filemode == GameConstants.FILEREAD) {
			/*
			 * Open file for input
			 */
			try {
				FileReader fileReader = new FileReader(myFile);

				reader = new BufferedReader(fileReader);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} else {
			/*
			 * Open file for output
			 */
			try {
				FileWriter fileWriter = new FileWriter(myFile);

				writer = new BufferedWriter(fileWriter);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public void writeALine(String aLine) {
		/*
		 * Write a line to the file
		 */
		try {
			writer.write(aLine, 0, aLine.length());
			if (fileType == GameConstants.HTMLTYPE)
				writer.write("<br>", 0, 4);
			writer.newLine();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public String readALine() {
		String line = null;
		try {
			line = reader.readLine();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return line;
	}

	public void closeFile() {
		try {
			if (this.fileMode == GameConstants.FILEREAD)
				reader.close();
			else
				writer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
