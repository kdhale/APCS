// Kenia Hale AnimalList

public class AnimalList
{
	// instance variables
	private ListNode head;
	private int numAddRemove;
	
	public AnimalList()
	{
		head = null;
		numAddRemove = 0;
	}
	
	//methods	
	public void addAnimal(Comparable addValue) // DONE
	{
		ListNode temp = head;
		if(head == null)// null case
		{
			head = new ListNode(addValue,null);//because if null, addValue will be only part of list
			numAddRemove++;
			System.out.println("Added: " + addValue + "\tBEFORE: None\tAFTER: None");
		}
		else if(addValue.compareTo(temp.getValue()) < 0)// at beginning
		{
			head = new ListNode(addValue, head);// so don't lose the rest
			numAddRemove++;
			System.out.println("Added: " + addValue + "\tBEFORE: None\tAFTER: " + head.getNext().getValue());
		}
		else
		{
			while(temp != null)// till at end of list
			{
				if(temp.getNext() == null)// if at end, put it 
				{
					temp.setNext(new ListNode(addValue, null));
					numAddRemove++;
					System.out.println("Added: " + addValue + "\tBEFORE: " + temp.getValue() +"\tAFTER: None");
					break;
				}
				else if(addValue.compareTo(temp.getNext().getValue()) < 0)// anywhere in middle
				{
					temp.setNext(new ListNode(addValue, temp.getNext()));// fox chicken birdfeed, temp.getNext so don't lose list
					numAddRemove++;
					System.out.println("Added: " + addValue + "\tBEFORE: " + temp.getValue() +"\tAFTER: " + temp.getNext().getNext().getValue());
					break;
				}			
				else
					temp = temp.getNext();// temp is next
			}
		}

	}
	
	public boolean removeAnimal(Comparable searchValue)
	{
		ListNode temp = head;
		ListNode prev = head;
		if(temp == null) // null case, will always be false
			return false;
		else if(head.getValue().equals(searchValue))// at beginning
		{
			head = head.getNext();// so don't lose rest
			numAddRemove++;
			System.out.println("Removed: " + searchValue + "\tBEFORE: None\tAFTER: None");
			return true;
		}
		else
		{
			temp = prev.getNext();// know it's not first, so can start it at second, temp always one ahed of prev
			while(temp != null)
			{
				if(temp.getValue().equals(searchValue))// middle and end
				{
					prev.setNext(temp.getNext());// reassign so it skips current w/o deleting rest
					numAddRemove++;
					System.out.print("Removed: " + searchValue + "\tBEFORE: " + prev.getValue());
					if(prev.getNext() == null)
						System.out.println("\tAFTER: None");
					else
						System.out.println("\tAFTER: " + prev.getNext().getValue());
					return true;
				}
				else// increments both
				{
					prev = prev.getNext();
					temp = temp.getNext();
				}
					
			}
			return false;// if never removes, 
		}
			
	}
	
	public void displayList()
	{
		ListNode temp = head;
		while(temp != null)// while temp doesnt point to null, keep printing the value
		{
			System.out.println(temp.getValue());
			temp = temp.getNext();// reassign temp
		}
	}
	
	public int getnumAddRemove()
	{
		return numAddRemove;
	}
}