/*
 * Created on Dec 14, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package bettors;

import java.util.Comparator;

/**
 * @author tdls5
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class BettorSortAsc implements Comparator {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object arg0, Object arg1) {

		if (((Bettor) arg0).amount() > ((Bettor) arg1).amount())
			return 1;
		else if (((Bettor) arg0).amount() < ((Bettor) arg1).amount())
			return -1;
		else
			return 0;
	}
}
