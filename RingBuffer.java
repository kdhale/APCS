import java.util.LinkedList;

public class RingBuffer
{
	private char[] characters;
	private int front, rear;
	
	public RingBuffer(int capacity)
	{
		characters = new char[capacity + 1];
		front = 0;
		rear = 0;
	}
	
	public boolean isEmpty()
	{
		if(front == rear)
			return true;
		else
			return false;
	}
	
	public void flush()
	{
		front = rear;
	}
	
	public boolean add(char ch)
	{
		if(rear - front == characters.length - 1 || front - rear == 1)// not at front or at end
			return false;
		else
		{
			characters[rear] = ch;
			rear = rear + 1;
			if(rear == characters.length)// incremnt, make circular
				rear = 0;
			return true;
		}
	}
	
	public char remove()
	{
		if(this.isEmpty()) // return nothing is empty
			return ' ';
		else
		{
			char temp = characters[front];// saving the value
			front = front + 1;// incrementing 
			if(front == characters.length)// so no longer pointing at value
				front = 0;
			return temp;
		}	
	}
	
	public char peek()
	{
		if(this.isEmpty())
			return '!';
		else
			return characters[front];// so see it, but not removed
	}
	
	public int getFront()
	{
		return front;
	}
	
	public int getRear()
	{
		return rear;
	}
	

}