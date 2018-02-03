package superbowl;
import scores.ScoreCard;
import scores.ScoreCardWriter;
import bettors.BettorList;
import fileio.FileManager;

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
public class SuperBowl {

	public static void main(String[] args) {
		
		BettorList bettors;
		ScoreCard scoreCard;
		Quarter qtr;

		/*
		 * Create LoadBettor and load names and bets
		 */
		 LoadTeamsAndBettors load = 
			 new LoadTeamsAndBettors(
					 GameOptions.TEAMFILENAME,
					 GameOptions.BETTORFILENAME);
		 bettors = load.getBettors();
		 qtr = load.quarter();
		 
		 FileManager log = new FileManager(
				 GameOptions.LOGFILENAME, 
				 GameConstants.FILEWRITE,
				 GameConstants.HTMLTYPE);
		 
		 bettors.SortDesc();
		 log.writeALine("<u>Bettors: </u><br>" + bettors.toString());
		 log.writeALine("<u><b>Pot: $"+bettors.pot()+"</b></u>");
		 /*
		  * Create Scorecard
		  */
		 scoreCard = new ScoreCard(bettors);
		 log.writeALine("<br><u><b>Score List:</b></u>");
		 log.writeALine("By Name:");
		 log.writeALine(scoreCard.toString(GameConstants.SORTBYNAME));
		 log.writeALine("By Score:");
		 log.writeALine(scoreCard.toString(GameConstants.SORTBYSCORE));
		 log.closeFile();
		 
		 ScoreCardWriter scoreCardWriter = new ScoreCardWriter(scoreCard);
		 scoreCardWriter.writeScores(qtr,
				 GameOptions.TEMPLATEFILENAME, 
				 GameOptions.SCORECARDFILENAME);
		 System.out.println("Done");
	}
}
