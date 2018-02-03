package scores;

import java.util.Iterator;


import junit.framework.TestCase;

public class TestScoreList extends TestCase {
	
	ScoreList sl = new ScoreList();

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestScoreList.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		sl.addScore(new Score(3,5));
		sl.addScore(new Score(3,6));
		sl.addScore(new Score(1,6));
		sl.addScore(new Score(0,9));
		sl.addScore(new Score(2,9));
		sl.addScore(new Score(3,9));
	}
	
	public void testScores() {
		Iterator i = sl.iterator();
		while (i.hasNext()) {
			System.out.println(((Score)i.next()).toString());
		}
	}
	public void testSortedScores() {
		System.out.println("Sorted:");
		Iterator i = sl.sortedIterator();
		while (i.hasNext()) {
			System.out.println(((Score)i.next()).toString());
		}
		System.out.println("Orig:");
		i = sl.iterator();
		while (i.hasNext()) {
			System.out.println(((Score)i.next()).toString());
		}
		System.out.println("Shuffled:");
		i = sl.shuffledIterator();
		while (i.hasNext()) {
			System.out.println(((Score)i.next()).toString());
		}
	}

}
