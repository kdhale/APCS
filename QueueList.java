// Kenia Hale QueueList

import java.util.LinkedList;

public class QueueList<E>
{
	private LinkedList<E> list;
	
	public QueueList()
	{
		list = new LinkedList<E>();
	}
	
	public boolean add(E x)// adds to end
	{
		return list.add(x);
	}	
	public E remove()// removes element at front
	{
		return list.remove();
	}	
	public E peek()// peeks at front
	{
		return list.peek();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
}