package edu.olemiss.cs.csci211;

import java.util.Iterator;
import java.util.NoSuchElementException;


/** A simple Linked List implementation of the List interface. This class provides 
 * no way to add elements, so it needs to be extended by a child class in order to be 
 * useful.
 * 
 * @author rhodes
 *
 * @param <T> The type of element contained in the list.
 */
public abstract class SinglyLinkedList<T> implements List<T>
{
	class Node
	{
		Node next;
		T data;
	}
	
	Node front;
	int count = 0;
	
	/** Construct an empty list.
	 * 
	 */
	public SinglyLinkedList()
	{
		
		front=null;
		count=0;
	}
	
	
	/** Indicate whether this list is empty.
	 * 
	 * @return true if the list is empty, false otherwise.
	 */
	public boolean isEmpty()
	{
		return count == 0;
	}
	
	/** Remove an element from the front of the list.
	 *  @return the value of the first element in the list
	 *  @throws NoSuchElementException if the list is empty.
	 */
	public T removeFirst()
	{
		if(front == null)
		{
			throw new NoSuchElementException("Empty list.");
		}
			
		T r = front.data;
		front=front.next; //we can safely advance front.
				
		count--;
		return r;
	}
	

	
	/** Return an iterator suitable for iterating over a SinglyLinkedList.
	 * 
	 * @return the iterator.
	 */
	public Iterator<T> iterator(){
		
		return new SinglyLinkedListIterator<T>(this);
	}
	
	
	


}
