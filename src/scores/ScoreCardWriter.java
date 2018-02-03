package scores;

import java.util.Iterator;

import superbowl.GameConstants;
import superbowl.Quarter;
import fileio.FileManager;

public class ScoreCardWriter {

	ScoreCard scoreCard;
	Iterator iter;

	public ScoreCardWriter(ScoreCard s) {
		super();
		scoreCard = s;
	}

	public void writeScores(Quarter qtr, String templateFile, String outFile) {
		String inLine;
		FileManager inTemplate = new FileManager(templateFile,
				GameConstants.FILEREAD);
		FileManager outScore = new FileManager(outFile,
				GameConstants.FILEWRITE, GameConstants.CSVTYPE);
		while ((inLine = inTemplate.readALine()) != null) {
			if (inLine.contains("AAAA")) {
				if (scoreCard.hasNext()) {
					BettorScore bs = scoreCard.nextBettorScore();
					inLine = insertScore(inLine, bs);
				}
			}
			else if (inLine.contains("QQQ")) 
				inLine = insertQuarter(inLine, qtr);
			else if (inLine.contains("XXX"))
				inLine = insertPot(inLine, scoreCard.pot());
			outScore.writeALine(inLine);
		}
		inTemplate.closeFile();
		outScore.closeFile();
	}

	private String insertScore(String inLine, BettorScore bs) {
		String bettorName = bs.bettor.name();
		int i = inLine.indexOf("AAAA");
		String newInLine = inLine.substring(0, i) + bettorName
				+ inLine.substring(i + 4);
		return newInLine;
	}
	
	private String insertQuarter(String inLine, Quarter qtr) {
		int i = inLine.indexOf("QQQ");
		String newInLine = inLine.substring(0, i) + qtr.quarter()
				+ inLine.substring(i + 3);
		return newInLine;
	}
	private String insertPot(String inLine, int pot) {
		String spot = new Integer(pot).toString().trim();
		int i = inLine.indexOf("XXX");
		String newInLine = inLine.substring(0, i) + spot
				+ inLine.substring(i + 3);
		return newInLine;
	}

}
