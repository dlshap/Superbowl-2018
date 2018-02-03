package scores;

import java.util.Comparator;

public class BettorScoreSortByScore implements Comparator {

	public int compare(Object arg0, Object arg1) {
		int i = ((BettorScore) arg0).score
				.compareTo(((BettorScore) arg1).score);
		return i;
	}
}
