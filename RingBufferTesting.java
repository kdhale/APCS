//Talia Mesnick
//Ring Buffer Testing
//client file for the ring buffer class
public class RingBufferTesting
{
	public static void main(String[] args)
	{
		RingBuffer jordan = new RingBuffer(4);
		System.out.println(jordan.isEmpty());
		jordan.add('a');
		System.out.println(jordan.peek());
		System.out.println(jordan.isEmpty());
		jordan.add('b');
		System.out.println(jordan.peek());
		System.out.println(jordan.remove());
		System.out.println(jordan.peek());
		jordan.add('c');
		System.out.println(jordan.isEmpty());
		jordan.flush();
		System.out.println(jordan.isEmpty());
		System.out.println(jordan.add('a'));
		System.out.println(jordan.add('b'));
		System.out.println(jordan.add('c'));
		System.out.println(jordan.add('d'));
		System.out.println(jordan.add('e'));
		
		while(!(jordan.isEmpty()))
		{
			System.out.println(jordan.remove());
		}
	}
}