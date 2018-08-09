

import java.util.LinkedList;
import java.util.ListIterator;

public class Hale_Iterators
{
	public static void main(String[] args)
	{
		//1
		LinkedList kenia = new LinkedList();
		
		System.out.println(kenia.size());
		
		//2
		kenia.addFirst("kenia");
		kenia.addFirst("jacob");
		
		kenia.addLast("talia");
		kenia.addLast("shruti");
		
		ListIterator jacob = kenia.listIterator();
		jacob.next();
		jacob.add("jess");
		jacob.add("madi");
		jacob.add("jordan");
		
		
		for(Object o:kenia)
		{
			System.out.println(o);
		}
		
		jacob = kenia.listIterator();
		while(jacob.hasNext())
		{
			System.out.println(jacob.next());
		}
		
		
			
	}
	
}