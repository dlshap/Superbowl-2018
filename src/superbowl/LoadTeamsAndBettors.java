package superbowl;

import java.util.List;

import bettors.Bettor;
import bettors.BettorList;
import fileio.FileManager;
import fileio.LineParser;

/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author tdls5
 * 
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class LoadTeamsAndBettors {

	BettorList bettors = new BettorList();
	Quarter qtr;

	/**
	 * 
	 */
	public LoadTeamsAndBettors(String teamfile, String bettorfile) {
		super();
		loadBettorFile(bettorfile);
	}

	public Quarter quarter() {
		return qtr;
	}

	private void loadBettorFile(String bf) {
		String line;
		FileManager cr = new FileManager(bf, GameConstants.FILEREAD);
		line = cr.readALine();
		if (line != null)
			qtr = new Quarter(line);

		while ((line = cr.readALine()) != null) {
			if (line.length() != 0) {
				LineParser lp = new LineParser(line);
				@SuppressWarnings("rawtypes")
				List tokens = lp.getTokens();
				String name = new String((String) tokens.get(0));
				int amount = (new Integer(((String) tokens.get(1)).trim()))
						.intValue();
				bettors.addBettor(new Bettor(name, amount));
			}
		}
		cr.closeFile();
	}

	public BettorList getBettors() {
		return bettors;
	}
}
