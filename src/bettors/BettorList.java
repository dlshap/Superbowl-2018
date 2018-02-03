package bettors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
public class BettorList {
	ArrayList bettors = new ArrayList();
	Pot pot = new Pot();
	
	public void addBettor(Bettor bettor) {
		bettors.add(bettor);
		pot.addTo(bettor.amount());
	}
	
	public int pot() {
		return pot.total();
	}
	
	public Iterator iterator() {
		return bettors.iterator();
	}
	
	public String toString() {
		String bettorstring = "";
		Iterator i = bettors.iterator();
		while (i.hasNext()) {
			bettorstring += (((Bettor)i.next()).toString()+"<br>");
		}
		return bettorstring;
	}
	
	public void SortName() {
		Collections.sort(bettors, new BettorSortName());
	}
	
	public void SortAsc() {
		Collections.sort(bettors, new BettorSortAsc());
	}
	
	public void SortDesc() {
		Collections.sort(bettors, new BettorSortDesc());
	}
	
	
}
