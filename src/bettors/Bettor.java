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
public class Bettor implements Comparable<Object> {

	private String name;
	private int amount;

	/**
	 * 
	 */
	public Bettor(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public String toString() {
		return name + " ($" + new Integer(amount).toString() + ")";
//		return name ;
	}

	public int amount() {
		return this.amount;
	}

	public String name() {
		return this.name;
	}

	public boolean equals(Object o) {
		return ((this.name()).equals(((Bettor) o).name()));
	}

	public int compareTo(Object o) {
		return this.name.compareToIgnoreCase(((Bettor) o).name());
	}

}
