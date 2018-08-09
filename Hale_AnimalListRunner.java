// MoneyRunner
// Kenia Hale
// Testing the Money Class

public class Hale_AnimalListRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		int choice = 0;
		AnimalList kenia = new AnimalList();
		do
		{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
			+ "\t 1. Create list, add, display\n"
			+ "\t 2. Insert reader chosen list\n"
			+ "\t 3. Remove\n"
			+ "\t Your Choice: ");
			
			switch(choice)
			{
				case 1:
					kenia.addAnimal("dog");
					kenia.addAnimal("aat");
					kenia.addAnimal("cat");
					kenia.addAnimal("jacob");
					//kenia.displayList();
					System.out.println(kenia.getnumAddRemove());
					reader.pause();
					continue;
				case 2:
					String jacob = "";
					while(!jacob.equals("0"))
					{
						if(!jacob.equals("0"))
						{
							jacob = reader.readLine("Add an animal (enter 0 to display)" );
							kenia.addAnimal(jacob);
						}
					}
					kenia.displayList();
					System.out.println(kenia.getnumAddRemove());
					reader.pause();
					continue;
				case 3:
					kenia.addAnimal("cat");// can comment these out and check null
					kenia.addAnimal("bat");
					kenia.addAnimal("baa");
					kenia.addAnimal("aat");
					kenia.addAnimal("baa");
					
					System.out.println("Initial list: \n");
					kenia.displayList();
					System.out.println("\nRemoving baa\n");// change this to whatever
					System.out.println("New list: \n\n" );//+ kenia.removeAnimal("baa"));
					kenia.removeAnimal("kenia");
					kenia.displayList();
					System.out.println("Num add remove: " + kenia.getnumAddRemove());
					reader.pause();
					continue;
						
				
			}
		}while(choice != 7);
		
	}
	
}