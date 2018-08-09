// MoneyRunner
// Kenia Hale
// Testing the Money Class
public class LinkedBSTRunner2
{
	public static void main(String[] args)
	{
		LinkedBST kenia = new LinkedBST();
		LinkedBST jacob = new LinkedBST();
		LinkedBST hard = new LinkedBST();
		char user;
		hard.addNode("d");
		hard.addNode("b");
		hard.addNode("f");
		hard.addNode("a");
		hard.addNode("c");
		hard.addNode("e");
		hard.addNode("g");
//		hard.addNode("e");
//		hard.addNode("b");
//		hard.addNode("m");
//		hard.addNode("c");
//		hard.addNode("k");
//		hard.addNode("n");
//		hard.addNode("h");
//		hard.addNode("l");
//		hard.addNode("j");
//		hard.addNode("i");
		
		KeyboardReader reader = new KeyboardReader();
		int choice = 0;
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. hard coded addnode\n"
				+ "\t 2. user input add\n"
				+ "\t 3. test pre order\n"
				+ "\t 4. test in order\n"
				+ "\t 5. test post order\n"
				+ "\t 6. deleteNode\n"
				+ "\t 7. search\n"
				+ "\t 8. countLeaf\n"
				+ "\t 9. findPath\n"
				+ "\t 10. countNode\n"
				+ "\t 0. Exit\n"
				+ "\t Your Choice: ");
				
				switch(choice)
				{
					case 1:
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
						break;
					case 2:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						String let = reader.readLine("Enter a letter: ");
						if(user == 'n')
						{
							if(jacob.addNode(let))
							System.out.println(let + " was successfully added.");
							else
							{
								System.out.println(let + " wasn't added, must have been a duplicate! Try again!");
							}
						}
						else
						{
							if(hard.addNode(let))
								System.out.println(let + " was successfully added.");
							else
							{
								System.out.println(let + " wasn't added, must have been a duplicate! Try again!");
							}
						}
						reader.pause();
						break;
					case 3:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						if(user == 'n')
							System.out.println(jacob.preOrder());
						else
							System.out.println(hard.preOrder());
						reader.pause();
						break;
					case 4:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						if(user == 'n')
							System.out.println(jacob.inOrder());
						else
							System.out.println(hard.inOrder());
						reader.pause();
						break;
					case 5:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						if(user == 'n')
							System.out.println(jacob.postOrder());
						else
							System.out.println(hard.postOrder());
						reader.pause();
						break;
					case 6:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						String find = reader.readLine("What do you want to delete?: ");
						boolean found = true;
						if(user == 'n')
							found = jacob.deleteNode(find);
						else
							found = hard.deleteNode(find);
						if(found == true)
							System.out.println(find + " was successfully deleted");
						else
							System.out.println(find + " wasn't deleted. It isn't in the tree.");
						reader.pause();
						break;
					case 7:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						find = reader.readLine("What do you want to find?: ");
						found = true;
						if(user == 'n')
							found = jacob.search(find);
						else
							found = hard.search(find);
						if(found == true)
							System.out.println(find + " was successfully found");
						else
							System.out.println(find + " isn't in the tree.");
						reader.pause();
						break;	
					case 8:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						int num = 0;
						if(user == 'n')
							num = jacob.countLeaf();
						else
							num = hard.countLeaf();
						System.out.println("There are " + num + " leaves in the tree.");
						reader.pause();
						break;
					case 9:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						find = reader.readLine("What do you want to find?: ");
						num = 0;
						if(user == 'n')
							num = jacob.findPath(find);
						else
							num = hard.findPath(find);
						System.out.println("The path to " + find + " contains " + num + " nodes.");
						reader.pause();
						break;
					case 10:
						user = reader.readChar("Would you like to use the hard coded case? (y/n): ");
						num = 0;
						if(user == 'n')
							num = jacob.countNode();
						else
							num = hard.countNode();
						System.out.println("There are " + num + " node(s) in the tree.");
						reader.pause();
						break;
				}	
			}while(choice != 12);
		
	}
	
}