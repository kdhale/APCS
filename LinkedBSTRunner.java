import java.util.ArrayList;
import java.util.Set;

public class LinkedBSTRunner
{
	public static void main(String[] args)
	{		
		KeyboardReader reader = new KeyboardReader();
		int choice = 300;
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. hard coded addnode\n"
				+ "\t 2. user input add\n"
				+ "\t 3. test pre order\n"
				+ "\t 4. test in order\n"
				+ "\t 5. test post order\n"
				+ "\t 0. Exit\n"
				+ "\t Your Choice: ");
				
			if(choice == 1)// tests both adds and listall
			{
				LinkedBST kenia = new LinkedBST();
				System.out.println(kenia.addNode("a"));
				System.out.println(kenia.addNode("b"));
				System.out.println(kenia.addNode("d"));
				System.out.println(kenia.addNode("c"));
				System.out.println(kenia.addNode("e"));
				System.out.println(kenia.addNode("f"));
				System.out.println(kenia.addNode("g"));
				System.out.println(kenia.addNode("h"));
				System.out.println(kenia.addNode("a"));// should be false
				System.out.println(kenia.addNode("c"));// should be false
				reader.pause();
			}
			else if(choice == 2) // tests remove family (both true and false), and list all
			{
				LinkedBST jacob = new LinkedBST();
					String let = reader.readLine("Enter a letter: ");
					if(jacob.addNode(let))
						System.out.println(let + " was successfully added.");
					else
					{
						System.out.println(let + " wasn't added, must have been a duplicate! Try again!");
						nums++;
					}
				reader.pause();
			}
			else if(choice == 3)// tests getfirstnames, plus error message, and getsurnames
			{
				LinkedBST kenia = new LinkedBST();
				
				System.out.println(kenia.preOrder());
				reader.pause();
			}
			else if(choice == 4)// test moremembers(equal members, error message) and commonFirst(error message)
			{
				LinkedBST kenia = new LinkedBST();

				System.out.println(kenia.inOrder());
				reader.pause();
			}
				
			else if(choice == 5)//longest name in rand(error message) and list all
			{
				LinkedBST kenia = new LinkedBST();

				System.out.println(kenia.postOrder());
				reader.pause();	
			}
				
				
		}while(choice != 0);
		
	}
	
}