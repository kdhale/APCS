import java.util.LinkedList;

public class StackList<E>
{
	private LinkedList<E> list;
	
	public StackList()
	{
		list = new LinkedList<E>();
	}
	public void push(E x)// puts one on to last (like last plate in stack)
	{
		list.addLast(x);
	}
	public E pop() // removes last plate on the stack
	{
		return list.removeLast();
	}
	public E peek() // looks at last
	{
		return list.getLast();
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
}