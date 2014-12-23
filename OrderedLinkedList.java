package edu.olemiss.cs.csci211;

import edu.olemiss.cs.csci211.SinglyLinkedList.Node;

/** A linked list implementation of an ordered list. This list always orders elements
 * in increasing order, using the compareTo method of the elements. 
 * 
 * @author Sean Staz
 *
 * @param <T> The type of element contained in the list.
 */
public class OrderedLinkedList<T extends Comparable<T>> extends SinglyLinkedList<T> implements OrderedList<T> 
{
	
	/**
	 * Make an empty list.
	 */
	
	public OrderedLinkedList()
	{
		super();
	}
	
	
	/**  Add the given element at the appropriate place in the list.
	 * Placement is determined by the ordering provided by T.compareTo(T).
	 * 
	 * @param element the element to be added.
	 */
	public void add(T element)
	{
		SinglyLinkedList.Node newNode = new SinglyLinkedList.Node();
		boolean flag = false;
		
	        if(front == null)
	        {
	            newNode.data = element;
	            front = newNode;
	            
	            flag = true;
	        }
	        
	        Node current = front;
	        
	        while(!flag)
	        {
	        	if (current.data.compareTo(element) < 0)
	            {
	                	if (current.next == null)
	                	{
							newNode.data = element;
							current.next = newNode;
							
							count++;
							flag = true;
	                	}
	                	
	                	else if(current.next.data.compareTo(element) > 0)
	                	{
							newNode.data = element;
							newNode.next = current.next;
							current.next = newNode;
							
							count++;
							flag = true;
	                	}
	            }
	                	
	        			if (current.data.compareTo(element) > 0 
	        				|| current.data.compareTo(element) == 0)
	        			{
		        				newNode.data = element;
		        				current.data = (T) newNode.data;
		        				current = newNode;
		        				
		        				count++;
		        				flag = true;
	        			}
	        			
	        			return;
            }
	}
}
	   


