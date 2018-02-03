package bettors;
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
public class Pot {

	private int total;
	
	public int total() {
		return total;
	}
	
	public void addTo(int amount) {
		total += amount;
	}
	
	public String toString() {
		return (new Integer(total)).toString();
	}
}
