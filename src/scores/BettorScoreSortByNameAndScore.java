package scores;

import java.util.Comparator;

public class BettorScoreSortByNameAndScore implements Comparator {

	public int compare(Object arg0, Object arg1) {
		int i = ((BettorScore) arg0).bettor
				.compareTo(((BettorScore) arg1).bettor);
		if (i != 0)
			return i;
		else
			return ((BettorScore) arg0).score
					.compareTo(((BettorScore) arg1).score);
	}
}
