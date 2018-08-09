//StackListClient
// Kenia Hale

public class StackListClient
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		int choice = 300;
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. My Stack Case\n"
				+ "\t 2. McKeen Case\n"
				+ "\t 0. Exit\n"
				+ "\t Your Choice: ");
				
				switch(choice)
				{
					case 1:
						StackList kenia = new StackList<String>();
						String sent = reader.readLine("Please enter a sentence: Signify the end with a .\n\t");
						String found = reader.readLine("Please enter the word to be found: \n\t");
						String replace = reader.readLine("Please enter the word to replace the previous word with: \n\t");
						String temp = "";
						int i = 0;
						
						// ADDING WORDS TO STACK, WORKS SO FAR
						while(sent.charAt(i) != ' ' && sent.charAt(i) != '.') // ADDING FIRST WORD
						{
							temp += sent.charAt(i);
							i++;
						}
						//System.out.println(temp);
						kenia.push(temp);	
						
						//WATCH FOR ONLY ONE WORD
						i = temp.length() + 1; // so it will start at first word after after
						temp = "";
						while(i != sent.length()) // IF ONLY ONE WORD, WON'T GO IN HERE
						{	
							if(sent.charAt(i) == ' ' || sent.charAt(i) == '.')// if ends word, 
							{
								//System.out.println(temp);
								kenia.push(temp);// will keep adding
								temp = "";
							}	
							else
								temp += sent.charAt(i);	
							i++;
						}
						
						// NEW STACKLIST FOR CORRECT VALUES
						StackList jacob = new StackList<String>();
						
						while(!kenia.isEmpty())// puts thtem in in reverse
						{
							if(kenia.peek().equals(found))
							{
								kenia.pop();// remove it, replace with new
								jacob.push(replace);
							}		
							else
								jacob.push(kenia.pop());
						}
						
						// PRINTING
						System.out.print("\n\nNew Sentence: " + jacob.pop());
						while(!jacob.isEmpty())
						{
							System.out.print(" " + jacob.pop());
						}
						
						System.out.print(".");	
						reader.pause();	
						continue;
						
						case 2:
							StackQueueTesting sss = new StackQueueTesting();
							sss.test();	
				}
					
					
		}while(choice != 0);
			
	}
	
}