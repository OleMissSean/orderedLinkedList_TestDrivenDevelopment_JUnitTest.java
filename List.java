package edu.olemiss.cs.csci211;

import java.util.NoSuchElementException;


/** Basic operations supported by List classes.
 * 
 * @author rhodes
 *
 * @param <T> The type of element contained in the list.
 */
public interface List<T> extends Iterable<T> {

	
	/** Indicate whether this list is empty.
	 * 
	 * @return true if the list is empty, false otherwise.
	 */
	public boolean isEmpty();
	
	
	/** Remove an element from the front of the list.
	 *  @return the value of the first element in the list
	 *  @throws NoSuchElementException if the list is empty.
	 */
	public T removeFirst();

	
}
