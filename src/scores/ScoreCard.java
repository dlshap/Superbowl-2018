package scores;

import java.util.ArrayList;
import java.util.Iterator;

import superbowl.GameConstants;
import superbowl.GameOptions;
import bettors.Bettor;
import bettors.BettorList;

public class ScoreCard {

	BettorScoreList bettorScoreList = new BettorScoreList();
	Iterator betterScoreListIter;
	int pot;

	public ScoreCard(BettorList b) {
		super();
		divideScores(b);
		pot = b.pot();
	}
	
	public int pot() {
		return pot;
	}

	private void divideScores(BettorList bettors) {
		ScoreList scoreList = new ScoreList();

		// get pot
		int pot = bettors.pot();

		// build and shuffle scores
		Iterator scoreListIter;
		for (int i = 0; i < GameConstants.MAXSCORES; i++) {
			for (int j = 0; j < GameConstants.MAXSCORES; j++) {
				scoreList.addScore(new Score(i, j));
			}
		}
		if (GameOptions.SHUFFLE)
			scoreListIter = scoreList.shuffledIterator();
		else
			scoreListIter = scoreList.iterator();
		
		bettors.SortDesc();
		Iterator bettorsIter = bettors.iterator();

		ArrayList a = new ArrayList();

		while (bettorsIter.hasNext()) {
			Bettor bettor = (Bettor) bettorsIter.next();
			int percentOfPot = (int) (((float) bettor.amount() * 100f / pot) + .5);
			int numberOfScores = (int) (percentOfPot
					* Math.pow(GameConstants.MAXSCORES, 2) / 100) - 1;
			a.add(new Integer(numberOfScores));
			for (int i = 0; i < numberOfScores; i++) {
				bettorScoreList.addBettorAndScore(bettor, (Score) scoreListIter.next());
			}
		}
		while (scoreListIter.hasNext()) {
			if (bettorsIter.hasNext())
				bettorScoreList.addBettorAndScore((Bettor) bettorsIter.next(), (Score) scoreListIter.next());
			else {
				bettorsIter = bettors.iterator();
				bettorScoreList.addBettorAndScore((Bettor) bettorsIter.next(), (Score) scoreListIter.next());
			}
		}
		betterScoreListIter = bettorScoreList.iteratorByScore();

	}

	public String toString() {
		return toString(GameConstants.SORTBYNAME);
	}

	public String toString(int sortBy) {
		String result = "";
		switch (sortBy) {
		case GameConstants.SORTBYNAME:
			result = bettorScoreList.toString(bettorScoreList.iteratorByName());
			break;
		case GameConstants.SORTBYSCORE:
			result = bettorScoreList.toString(bettorScoreList.iteratorByScore());
			break;
		}
		return result;
	}
	
	public boolean hasNext() {
		return betterScoreListIter.hasNext();
	}
	
	public BettorScore nextBettorScore() {
		BettorScore bettorScore = null;
		if (betterScoreListIter.hasNext()) 
			bettorScore = (BettorScore) betterScoreListIter.next();
		return bettorScore;

	}

}
