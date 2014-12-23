/** A linked list implementation of an ordered list. This list always orders elements
 * in increasing order, using the compareTo method of the elements. (Test)
 * 
 * @author Sean Staz
 *
 * @param <T> The type of element contained in the list.
 */

package edu.olemiss.cs.csci211;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class OrderedLinkedListTest {

	@Test
	public void testAdd() 
	{
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		list.add(eleven);
		list.add(two);
		list.add(six);
		list.add(nine);
		
		assertFalse(list.isEmpty());
	}

	
	@Test(expected = NoSuchElementException.class)
	public void testRemoveFirstException()
	{
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		
		list.removeFirst();
	}
	
	
	@Test
	public void testIterator()
	{
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		list.add(eleven);
		list.add(two);
		list.add(six);
		list.add(nine);
		
		assertTrue(list.iterator().hasNext());
	}
	
	@Test
	public void testIterator2()
	{
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		list.add(eleven);
		list.add(two);
		list.add(six);
		list.add(nine);
		
		int i = 0;
		Integer[] seq = {two, six, nine, eleven};
		
		for (Integer val : list) 
		{
		    assertEquals(seq[i], val);
		    i++;
		}
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testIteratorRemoveException()
	{
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		list.add(eleven);
		list.add(two);
		list.add(six);
		list.add(nine);
		
		list.iterator().remove();
	}
	
	@Test
	public void testNext()
	{
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		
		assertEquals(list.iterator().next(), null);
	}
	
	@Test
	public void testAdd2() 
	{
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		
		Integer eleven = 11;
		Integer two = 2;
		Integer six = 6;
		Integer nine = 9;
		
		list.add(eleven);
		list.add(two);
		list.add(six);
		list.add(nine);
		
		assertEquals(list.front.data, two);
	}
}
