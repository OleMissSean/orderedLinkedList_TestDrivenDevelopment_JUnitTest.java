package edu.olemiss.cs.csci211;

/** Basic operations for an ordered list.
 * 
 * @author rhodes
 *
 * @param <T> The type of element contained in the list.
 */
public interface OrderedList<T> extends List<T> {
	
	
	/**  Add the given element at the appropriate place in the list.
	 * Placement is determined by the ordering provided by T.compareTo(T).
	 * 
	 * @param e the element to be added.
	 */
	public void add(T e);
	
	
}
