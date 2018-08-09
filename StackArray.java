import java.util.ArrayList; 

public class StackArray<E>
{ 
  private ArrayList<E> array;
 
  public StackArray()
  { 
  		array = new ArrayList<E>(); 
  } 
  public void push(E element) 
  { 
  		array.add(element); 
  } 
  public E pop() 
  { 
  		return array.remove(array.size() - 1); 
  } 
  public E peek() 
  { 
  		return array.get(array.size() - 1); 
  } 
  public boolean isEmpty() 
  { 
  		return array.size() == 0; 
  } 
}
