package scores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import superbowl.GameConstants;
import bettors.Bettor;

public class BettorScoreList {

	ArrayList bsl = new ArrayList();

	public void addBettorScore(BettorScore bs) {
		bsl.add(bs);
	}

	public void addBettorAndScoreList(Bettor b, ScoreList s) {
		Iterator i = s.sortedIterator();
		while (i.hasNext()) {
			addBettorAndScore(b, (Score) i.next());
		}
	}

	public void addBettorAndScore(Bettor b, Score s) {
		BettorScore bs = new BettorScore(b, s);
		addBettorScore(bs);
	}

	public Iterator iterator() {
		return bsl.iterator();
	}

	public Iterator iteratorByName() {
		ArrayList sbsl = (ArrayList) bsl.clone();
		Collections.sort(sbsl, new BettorScoreSortByNameAndScore());
		return sbsl.iterator();
	}

	public Iterator iteratorByScore() {
		ArrayList sbsl = (ArrayList) bsl.clone();
		Collections.sort(sbsl, new BettorScoreSortByScore());
		return sbsl.iterator();
	}

	public int size() {
		return bsl.size();
	}

	public String toString() {
		String bslStr = "";
		Iterator i = bsl.iterator();
		while (i.hasNext()) {
			bslStr += (((BettorScore) i.next()).toString() +
					GameConstants.breakString());
		}
		return bslStr;
	}

	public String toString(Iterator i) {
		String bslStr = "";
		while (i.hasNext()) {
			bslStr += (((BettorScore) i.next()).toString() +
					GameConstants.breakString());
		}
		return bslStr;
	}
}
