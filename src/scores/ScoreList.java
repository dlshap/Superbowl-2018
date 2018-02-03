package scores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ScoreList {
	ArrayList scores = new ArrayList();
	
	public void addScore(Score s) {
		scores.add(s);
	}
	
	public Iterator iterator() {
		return scores.iterator();
	} 
	
	public int size() {
		return scores.size();
	}
	
	public Iterator shuffledIterator() {
		ArrayList shuffledScores = new ArrayList(scores);
		Collections.shuffle(shuffledScores);
		return shuffledScores.iterator();
	}
	
	public Iterator sortedIterator() {
		ArrayList sortedScores = new ArrayList(scores);
		Collections.sort(sortedScores);
		return sortedScores.iterator();
	}
	
	public String toString(Iterator i) {
		String slp = "";
		while (i.hasNext()) {
			slp += (((Score)i.next()).toString()+"<br>");
		}
		return slp;
	}
	
	public String toString() {
		return toString(scores.iterator());
	}
}
