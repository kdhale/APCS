public class StringObjRunner
{
	public static void main(String[] args)
	{
		int choice = 0;
		KeyboardReader reader = new KeyboardReader();
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. Constructor and Vowels\n"
				+ "\t 2. Are Alphabatized\n"
				+ "\t 3. Is Palindrome\n"
				+ "\t 4. Is Palindrome Bonus!\n"///SIMPLIFY NOT WORKING
				+ "\t 5. Word Count\n"
				+ "\t 6. Word Count Bonus!\n"
				+ "\t Your Choice: ");
				
				switch(choice)
				{
					case 1:
						String str1 = reader.readLine("What's your sentence: ");
						StringObj s1 = new StringObj(str1);
						System.out.println(s1);
						System.out.println(s1.getNumVowels());
						reader.pause();
						break;
					case 2: // are alphabatized
						s1 = new StringObj("");
						StringObj s2 = new StringObj("APPL");
						System.out.println(s1.areAlphabetized(s2));
						reader.pause();
						break;
					case 3: //is palendrome
						s1 = new StringObj("");
						System.out.println(s1.isPalindrome());
						reader.pause();
						break;
					case 4: // is palindrome bonus
						s1 = new StringObj("lla,m,a m..al'l");
						System.out.println(s1.isPalindromeBONUS());
						reader.pause();
						break;
					case 5: 
						s1 = new StringObj("kenia Dog faced dogbert ran doggedly into the dog kenia house to study endogamous kenia.");
						String search = "keNia";
						//s1 = new StringObj("dog house dog yard dog.");
						System.out.println(s1.wordCount(search));
//					//	String st1 = "elephants and penguins and shrutis are cool.";
//						StringObj sobj = new StringObj("elephants and penguins and shrutis are cool.");
//						String search = "elephants";
//						System.out.println("The count is: " + sobj.wordCount(search));
						reader.pause();
						break;
					case 6:
						s1 = new StringObj("Kenia faced dogkeniabert ran dogkeniagedly into the dogkeniahouse to study endogamous dogma kenia.");
						search = "keNiA";
						//s1 = new StringObj("dog house dog yard dog.");
						System.out.println(s1.wordCountBONUS(search));
						reader.pause();
						break;
					case 7:
						StringObj truth = new StringObj("kenia hale loves jacob wenk");
						truth.displayAnalysisBONUS();
						reader.pause();
						break;
						
				}
		
		}while(choice!= 12);
	}
}