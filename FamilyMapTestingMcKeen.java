//Client file 
//import TerminalIO.KeyboardReader;
import java.util.*;
//Check against answers in a TreeMap 

public class FamilyMapTestingMcKeen
{
	public static void main(String[]args)
	{
		KeyboardReader reader = new KeyboardReader();
		FamilyMap fm = new FamilyMap();
		
		int selection;
		int casenum;
		
		String famname;
		ArrayList<String> firstNames;
		
		String[] student; //Captures each String[] student answer
		
		do
		{			
			System.out.println("\nWelcome to the FamilyMap Test Cases"+
			"\n1.) Regular Test Cases"+
			"\n2.) Bonus Test Cases (sameLetterBonus) -- must be uncommented"+
			"\n0.) Exit ");
			selection = reader.readInt("Enter a selection: ");
			
			//Test Cases -- Group A				
			if (selection == 1 || selection == 42)
			{
	
				casenum = 1;  //used to increment the case number
				//Test Cases -- Group A				
				System.out.println("Regular Test Cases\n");
								
				System.out.println("\nCASE " + casenum + ": ");
				System.out.println("*** Manually adding a family to the map and displaying the result***\n");
				
									  //Super Secret Sub Selection	
				if(selection == 42)   //This is so I don't need to type in the manual test case while	
				{					  //I am testing the client file
					famname = "Smith";
				
					firstNames = new ArrayList<String>();
					firstNames.add("Tina");
					firstNames.add("Becky");
					firstNames.add("Suzy");
					firstNames.add("Judy");
					firstNames.add("Gene");
					 
					fm.addFamily(famname, firstNames);
				}
				else
					fm.addFamily();
				
				student = fm.listAll();
				
				String[] correct1 = {"Smith, Becky", "Smith, Gene", "Smith, Judy", "Smith, Suzy", "Smith, Tina"};
				
				showLists(student, correct1);
				
				System.out.println("\nCase " + casenum + ": If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");

				reader.pause();
				casenum++;
				
				//2
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Adding a family to the map using parameters and displaying the result***\n");
				
				famname = "Klump";
				
				firstNames = new ArrayList<String>();
				firstNames.add("Kirk");
				firstNames.add("Pam");
				firstNames.add("Plump");
				firstNames.add("Nati");
				 
				fm.addFamily(famname, firstNames);
				
				student = fm.listAll();
				
				String[] correct2 = {"Klump, Kirk", "Klump, Nati", "Klump, Pam", "Klump, Plump",
									 "Smith, Becky", "Smith, Gene", "Smith, Judy", "Smith, Suzy", "Smith, Tina"};
				
				showLists(student, correct2);
				
				System.out.println("\nCase " + casenum + ": If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");

				reader.pause();
				casenum++;

				//3
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Adding more families to the map using parameters and displaying the result***\n");
				
				famname = "Marquis";
				
				firstNames = new ArrayList<String>();
				firstNames.add("Matt");
				firstNames.add("Suzy");
				firstNames.add("Jacob");
				firstNames.add("Logan");
				firstNames.add("Spencer");
				 
				fm.addFamily(famname, firstNames);
				
				famname = "Veggie";
				
				firstNames = new ArrayList<String>();
				firstNames.add("Celery");
				firstNames.add("Bag");
				firstNames.add("Radish");
				firstNames.add("Anti");
				firstNames.add("Tina");
				 
				fm.addFamily(famname, firstNames);

				famname = "Letters";
				
				firstNames = new ArrayList<String>();
				firstNames.add("A");
				firstNames.add("B");
				firstNames.add("C");
				firstNames.add("D");
				firstNames.add("E");
				firstNames.add("F");
				 
				fm.addFamily(famname, firstNames);
				student = fm.listAll();
				
				String[] correct3 = {"Klump, Kirk", "Klump, Nati", "Klump, Pam", "Klump, Plump",
									 "Marquis, Jacob", "Marquis, Logan", "Marquis, Matt", "Marquis, Spencer","Marquis, Suzy",  
									 "Letters, A", "Letters, B","Letters, C","Letters, D","Letters, E","Letters, F",
									 "Smith, Becky", "Smith, Gene", "Smith, Judy", "Smith, Suzy", "Smith, Tina",
									 "Veggie, Anti", "Veggie, Bag", "Veggie, Celery","Veggie, Radish", "Veggie, Tina", 
									 };
//		surname:  Marquis	Names:  Matt, Suzy, Jacob, Logan, Spencer
//		surname:  Veggie	Names:	Celery, Bag, Radish, Anti, Tina
//		surname:  Letters	Names:	A, B, C, D, E, F
				showLists(student, correct3);

				System.out.println("\nCase " + casenum + ": If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
				casenum++;
				
			//4
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the showSurnames method***\n");
				
				student = fm.getSurnames();
				
				String[] correct4 = { "Klump", "Letters", "Marquis", "Smith", "Veggie"};

				showLists(student, correct4);

				System.out.println("\nCase " + casenum + ": If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//5a
				System.out.println("\n\n\nCASE " + casenum + "a: ");
				System.out.println("*** Calling the moreMembers method***\n");
				
				famname = fm.moreMembers("Smith", "Klump");
				
				System.out.println("STUDENT Answer: \t " + famname);
				System.out.println("CORRECT Answer: \t Smith");
				
				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();

			//5b
				System.out.println("\n\n\nCASE " + casenum + "b: ");
				System.out.println("*** Calling the moreMembers method***\n");
				
				famname = fm.moreMembers("Smith", "Veggie");
				
				System.out.println("STUDENT Answer: \t " + famname);
				System.out.println("CORRECT Answer: \t They both have 5 members.");
				
				System.out.println("\nCase " + casenum + "b: If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//6a
				System.out.println("\n\n\nCASE " + casenum + "a: ");
				System.out.println("*** Calling the commonFirst method***\n");
				
				student = fm.commonFirst("Smith", "Klump");
				
				String[] correct6a = {};

				showLists(student, correct6a);

				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();

			//6b
				System.out.println("\n\n\nCASE " + casenum + "a: ");
				System.out.println("*** Calling the commonFirst method***\n");
				
				student = fm.commonFirst("Smith", "Veggie");
				
				String[] correct6b = {"Tina"};

				showLists(student, correct6b);

				System.out.println("\nCase " + casenum + "b: If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//7
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Adding another family to the map using parameters and displaying the result***\n");
				
				famname = "Buzzer";
				
				firstNames = new ArrayList<String>();
				firstNames.add("Gab");
				firstNames.add("Tina");
				firstNames.add("Radish");
				 
				fm.addFamily(famname, firstNames);
				student = fm.listAll();

				String[] correct7 = {"Buzzer, Gab", "Buzzer, Radish","Buzzer, Tina",
				 					 "Klump, Kirk", "Klump, Nati", "Klump, Pam", "Klump, Plump",
									 "Marquis, Jacob", "Marquis, Logan", "Marquis, Matt", "Marquis, Spencer","Marquis, Suzy",  
									 "Letters, A", "Letters, B","Letters, C","Letters, D","Letters, E","Letters, F",
									 "Smith, Becky", "Smith, Gene", "Smith, Judy", "Smith, Suzy", "Smith, Tina",
									 "Veggie, Anti", "Veggie, Bag", "Veggie, Celery","Veggie, Radish", "Veggie, Tina", 
									 };

				showLists(student, correct7);

				System.out.println("\nCase " + casenum + ": If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
				casenum++;
			
			//8
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the getSurnames method***\n");
				
				student = fm.getSurnames();
				
				String[] correct8 = {"Buzzer", "Klump", "Letters", "Marquis", "Smith", "Veggie"};

				showLists(student, correct8);

				System.out.println("\nCase " + casenum + ": If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//9a
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the getFirstnames method with Marquis***\n");
				
				student = fm.getFirstnames("Marquis");
				
				String[] correct9 = { "Jacob", "Logan", "Matt", "Suzy", "Spencer"};

				showLists(student, correct9);

				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
//				casenum++;

			//9b
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the getFirstnames method with Zach***\n");
				
				student = fm.getFirstnames("Zach");
				
				String[] correct9b = {""};

				showLists(student, correct9b);

				System.out.println("\nCase " + casenum + "b: If the STUDENT's display and the CORRECT display match \n"
									+ "preceded by an error message stating that Zach is not in the map,\n"
									+ "give 1/1 point.");
				reader.pause();
				casenum++;
				
			//10a
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the longestName method with Marquis***\n");
				
				student = fm.longestName("Marquis");
				
				String[] correct10a = {"Spencer"};

				showLists(student, correct10a);

				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match \n"
									+ "give 1/1 point.");
				reader.pause();
//				casenum++;
			
			//10b
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the longestName method with Letters***\n");
				
				student = fm.longestName("Letters");
				
				String[] correct10b = {"A", "B", "C", "D", "E", "F"};

				showLists(student, correct10b);

				System.out.println("\nCase " + casenum + "b: If the STUDENT's display and the CORRECT display match \n"
									+ "give 1/1 point.");
				reader.pause();
//				casenum++;

			//10c
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the longestName method with Nate***\n");
				
				student = fm.longestName("Nate");
				
				String[] correct10c = {""};

				showLists(student, correct10c);

				System.out.println("\nCase " + casenum + "c: If the STUDENT's display and the CORRECT display match \n"
									+ "preceded by an error message stating that Nate is not in the map,\n"
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//11a
				System.out.println("\n\n\nCASE " + casenum + "a: ");
				System.out.println("*** Calling the commonFirst method with Buzzer and Veggie***\n");
				
				student = fm.commonFirst("Buzzer", "Veggie");
				
				String[] correct11a = {"Radish", "Tina"};

				showLists(student, correct11a);

				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
//				casenum++;

			//11b
				System.out.println("\n\n\nCASE " + casenum + "b: ");
				System.out.println("*** Calling the commonFirst method with Buzzer and John***\n");
				
				student = fm.commonFirst("Buzzer", "John");
				
				String[] correct11b = {""};

				showLists(student, correct11b);

				System.out.println("\nCase " + casenum + "b: If the STUDENT's display and the CORRECT display match \n"
									+ "preceded by an error message stating that John is not in the map,\n"
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//12a
				System.out.println("\n\n\nCASE " + casenum + "a: ");
				System.out.println("*** Calling the moreMembers method with Veggie and Buzzer***\n");
				
				famname = fm.moreMembers("Veggie", "Buzzer");
				
				System.out.println("STUDENT Answer: \t " + famname);
				System.out.println("CORRECT Answer: \t Veggie");
				
				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
//				casenum++;

			//12b
				System.out.println("\n\n\nCASE " + casenum + "b: ");
				System.out.println("*** Calling the moreMembers method with Letters and Badowski***\n");
				
				famname = fm.moreMembers("Nick", "Badowski");
				
				System.out.println("STUDENT Answer: \t " + famname);
				System.out.println("CORRECT Answer: \t ");
				
				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match\n"
									+ "preceded by an error message stating that Nick is not in the map\n"
									+ "and Badowski is not in the map,\n"
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//13
				System.out.println("\n\n\nCASE " + casenum + "a: ");
				System.out.println("*** Calling the removeFamily method with Veggie, Buzzer, Letters, and Daquila***\n");
				
				String[] student13 = new String[4];
				student13[0] = "" + fm.removeFamily("Veggie");  //converting booleans to Strings for display purposes
				student13[1] = "" + fm.removeFamily("Buzzer");
				student13[2] = "" + fm.removeFamily("Letters");
				student13[3] = "" + fm.removeFamily("Daquila");
				
				
				String[] correct13 = {"true", "true", "true", "false"};

				showLists(student13, correct13);
			
				System.out.println("\nCase " + casenum + "a: If the STUDENT's display and the CORRECT display match\n"
									+ "preceded by a message stating that the removal of Daquila was unsuccessful,\n"
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			//14
				System.out.println("\n\n\nCASE " + casenum + ": ");
				System.out.println("*** Calling the getSurnames method***\n");
				
				student = fm.getSurnames();
				
				String[] correct14 = { "Klump", "Marquis","Smith"};

				showLists(student, correct14);

				System.out.println("\nCase " + casenum + ": If the STUDENT's display and the CORRECT display match, "
									+ "give 1/1 point.");
				reader.pause();
				casenum++;

			}
			//Test Cases -- BONUS TEST CASE SECTION				
			else if (selection == 2)
			{
	
				//YOU MUST UNCOMMENT ALL OF THE LINES BELOW 
				//TO TEST THE BONUS
	
//				casenum = 1;  //used to increment the case number
//				//Test Cases -- Group B -- BONUS				
//
//				famname = "Sharafuddin";
//				
//				firstNames = new ArrayList<String>();
//				firstNames.add("Ahsan");
//				firstNames.add("Ryan");
//				firstNames.add("Tina");
//				 
//				fm.addFamily(famname, firstNames);
//				
//				famname = "Short";
//				
//				firstNames = new ArrayList<String>();
//				firstNames.add("Bob");
//				firstNames.add("Nana");
//				firstNames.add("Ryanna");
//				firstNames.add("Anti");
//				firstNames.add("Spencer");
//				 
//				fm.addFamily(famname, firstNames);
//				
//				famname = "Long";
//				
//				firstNames = new ArrayList<String>();
//				firstNames.add("Bobo");
//				firstNames.add("Nanar");
//				firstNames.add("Ryen");
//				firstNames.add("Spence");
//				 
//				fm.addFamily(famname, firstNames);
//
//				famname = "McCandless";
//				
//				firstNames = new ArrayList<String>();
//				firstNames.add("Bill");
//				firstNames.add("Lynn");
//				firstNames.add("Jeff");
//				firstNames.add("Kristen");
//
//				 
//				fm.addFamily(famname, firstNames);
//				
//				ArrayList<String> sameLetters;
//				sameLetters = fm.sameLetterBonus("Sharafuddin", "Short");
//				ArrayList<String> bonusAnswer1 = new ArrayList<String>();
//				
//				bonusAnswer1.add("Ryan, Ryanna");
//				bonusAnswer1.add("Tina, Anti");
//
//				System.out.println("\n\n\nCASE " + casenum + ": ");
//				System.out.println("*** Calling the sameLetterBonus method***\n");
//
//				showBonusLists(sameLetters, bonusAnswer1);
//				System.out.println("\nDid they match?  There are two bonus test cases left...");
//				reader.pause();
//				
//				casenum++;
//				sameLetters = fm.sameLetterBonus("Short", "Long");
//				ArrayList<String> bonusAnswer2= new ArrayList<String>();
//				bonusAnswer2.add("Bob, Bobo");
//
//				System.out.println("\n\n\nCASE " + casenum + ": ");
//				System.out.println("*** Calling the sameLetterBonus method***\n");
//
//				showBonusLists(sameLetters, bonusAnswer2);
//				System.out.println("\nDid they match?  There is one bonus test case left...");
//				reader.pause();
//
//				casenum++;
//				sameLetters = fm.sameLetterBonus("Long", "McCandless");
//				ArrayList<String> bonusAnswer3= new ArrayList<String>();
//				
//				System.out.println("\n\n\nCASE " + casenum + ": ");
//				System.out.println("*** Calling the sameLetterBonus method***\n");
//
//				showBonusLists(sameLetters, bonusAnswer3);
//
//
//				System.out.println("\nIf the STUDENT's display and the CORRECT display match\n "
//									+ "for all three of the bonus cases,\n"
//									+ "give +1/0 point.");
//				reader.pause();
			}

			
			
		}while (selection != 0);
		

		
	} // end of main
	
	//This method shows the student result and the correct result in parallel columns
	public static void showLists(String[] student, String[] correct)
	{
		String studentVal, correctVal;
		
		System.out.printf("\n%-25s %s\n", "STUDENT", "CORRECT");					
		for(int i = 0; i < student.length || i < correct.length; i++)
		{
			if(i < student.length) studentVal = student[i];
			else studentVal = "         ";
			if(i < correct.length) correctVal = correct[i];
			else correctVal = "         ";
			
			System.out.printf("%-25s %s\n", studentVal, correctVal);					
		}
	
	}

	//This method shows the student result and the correct result in parallel columns
	public static void showBonusLists(ArrayList<String> student, ArrayList<String> correct)
	{
		String studentVal, correctVal;
		
		System.out.printf("\n%-25s %s\n", "STUDENT", "CORRECT");					
		for(int i = 0; i < student.size() || i < correct.size(); i++)
		{
			if(i < student.size()) studentVal = student.get(i);
			else studentVal = "         ";
			if(i < correct.size()) correctVal = correct.get(i);
			else correctVal = "         ";
			
			System.out.printf("%-25s %s\n", studentVal, correctVal);					
		}
		
	}

} // end of class