package scores;

import bettors.Bettor;

public class BettorScore implements Comparable {

	Bettor bettor;
	Score score;

	public BettorScore(Bettor b, Score s) {
		super();
		bettor = b;
		score = s;
	}

	public String toString() {
		return bettor.toString() + 
			" " + score.toString();
	}

	public int compareTo(Object o) {
		// bettor by default
		return bettor.compareTo((Bettor)o);
	}
}
