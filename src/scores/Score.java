package scores;
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
public class Score implements Comparable {
	
	private int[] endscores = {0,0};

	/**
	 * Create new score with passed values
	 */
	public Score(int score1, int score2) {
		super();
		endscores[0] = score1;
		endscores[1] = score2;
	}

	public int compareTo(Object sco) {
		Score sc = (Score) sco;
		if (this.endscores[0] < sc.endscores[0])
			return -1;
		else if (this.endscores[0] > sc.endscores[0])
			return 1;
		else if (this.endscores[1] < sc.endscores[1])
			return -1;
		else if (this.endscores[1] > sc.endscores[1])
			return 1;
		else return 0;
	}
	
	public String toString() {
		return "["+(new Integer(this.endscores[0])).toString()+
			","+(new Integer(this.endscores[1])).toString()+"]"; 
	}

}
