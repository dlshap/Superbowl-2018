/*
 * Created on Dec 6, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author tdls5
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LineParser {
	
	String line = null;
	List tokens = new ArrayList();
	
	public void parse() {
		StringTokenizer parser = new StringTokenizer(line, ",");
		while (parser.hasMoreTokens()) {
			tokens.add(parser.nextToken());
		}
	}
	
	/**
	 * @return Returns the line.
	 */
	public String getLine() {
		return line;
	}
	/**
	 * @param line The line to set.
	 */
	public void setLine(String line) {
		this.line = line;
	}
	/**
	 * @return Returns the tokens.
	 */
	public List getTokens() {
		return tokens;
	}
	/**
	 * @param tokens The tokens to set.
	 */
	public void setTokens(List tokens) {
		this.tokens = tokens;
	}
	
	public LineParser() {
		super();
	}
	public LineParser(String line) {
		super();
		this.setLine(line);
		this.parse();
	}
}
