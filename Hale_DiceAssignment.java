/* Kenia Hale
 * Hale_DiceAssignment
 * Practice using objects, using Dice.java
 * */
 
public class Hale_DiceAssignment
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		int choice = 0;
		do
		{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. Sum of Dice\n"
				+ "\t 2. 10000 times\n"
				+ "\t 3. Craps\n"
				+ "\t 4. BONUS\n"
				+ "\t 5. Exit\n\n"
				+ "\t Your Choice: ");
			switch(choice)
			{
				case 1: // read in 10 values from the keyboard, return max, min, average, and display all and 10 #
					roll_sum();
					continue;
				case 2:
					timesTen_thousand();// user enters random number of random numbers, shows top 3 places
					continue;
				case 3:
					crap();
					continue;
				case 4:
					bonus();
					continue;
				case 5:
					System.out.println("See yah!");
					break;
				default:
					System.out.println("\nEnter a valid number, doofus!\n");
					reader.pause();							
			}
			
		} while(choice != 5);
		
		
	}//ends main Method
	
	//*************************************************************************
	// All of the method definitions are down here:

	public static void roll_sum()
	{
		KeyboardReader reader = new KeyboardReader();
		Dice dice1 = new Dice(6); // takes in "sides"
		Dice dice2 = new Dice(6);
		int count = 0;
		
		int times = reader.readInt("How many times would you like to roll the die? ");
		
		for(count = 0; count < times; count++)
		{
			int one = dice1.roll();
			int two = dice2.roll();
			System.out.print("Roll #" + (count + 1) + ":\t" + one + " + " + two + " = " + (one+two));
			reader.pause();
		}
		char again = reader.readChar("\nWould you like to play again? (Y/N)\t ");
		if (again == 'Y')
			roll_sum();
		else if(again == 'N')
			System.out.println("Please come again!");
		else
			System.out.println("Please enter a valid letter");
	}
	
	public static void timesTen_thousand()
	{
		KeyboardReader reader = new KeyboardReader();
		Dice dice = new Dice(6);
		int i;
		int six[] = new int[6];
		for(i = 0; i < 10000; i++)
		{
			six[dice.roll()-1]++;	// add to array
		}
		for(i = 0; i < 6; i++)
		{
			System.out.println("Number of times " + (i+1) + " was rolled: " + six[i]);
		}
		reader.pause();
	}
	
	public static void crap()
	{
		KeyboardReader reader = new KeyboardReader();
		Dice dice1 = new Dice(6); // takes in "sides"
		Dice dice2 = new Dice(6);
		int sum = 0, point = 0;
		
		// first throw
		
		int one = dice1.roll();
		int two = dice2.roll();
		sum = one+two;
		System.out.println("Player rolled " + one + " + " + two + " = " + sum + ".");
		
		// decides if wins, loses, or continue
		if(sum  == 7 || sum == 11) //win
			System.out.println("PLayer wins!");
		else if(sum == 2 || sum == 3 || sum == 12)
			System.out.println("Player loses! Crap!");//lose
		else//continue
		{
			point = sum;
			System.out.println("Point is " + point + ".");
			sum = 0;
			while(sum != point && sum != 7) // keep going till sum = point or sum == 7
			{
				one = dice1.roll();
				two = dice2.roll();
				sum = one+two;
				System.out.println("Player rolled " + one + " + " + two + " = " + sum + ".");
			}
			if(sum == point)
				System.out.println("Player wins!");
			else
				System.out.println("Player loses.");
		}
				
			char again = reader.readChar("\nWould you like to play again? (Y/N)\t ");
			if (again == 'Y')
			crap();
			else if(again == 'N')
			{
				System.out.println("Please come again!");
				reader.pause();
			}
			else
			System.out.println("Please enter a valid letter");
		
		
	}
	
	public static void bonus()
	{
		KeyboardReader reader = new KeyboardReader();
		Dice dice1 = new Dice(6); // takes in "sides"
		Dice dice2 = new Dice(6);
		int sum = 0, point = 0, win1 = 0, win2 = 0, lose1 = 0, lose2 = 0, num = 100000;
		
		// first throw
		for(int i = 0; i < num; i++)
		{
			int one = dice1.roll();
			int two = dice2.roll();
			sum = one+two;
			
			// decides if wins, loses, or continue
			if(sum  == 7 || sum == 11) //win
				win1++;
			else if(sum == 2 || sum == 3 || sum == 12)
				lose1++;//lose
			else//continue
			{
				point = sum;
				sum = 0;
				while(sum != point && sum != 7) // keep going till sum = point or sum == 7
				{
					one = dice1.roll();
					two = dice2.roll();
					sum = one+two;
				}
				if(sum == point)
					win2++;
				else
					lose2++;		
			}
		}
		
		System.out.printf("\nProbability of winning: %.4f\n", ((win1+win2)/(double)num));
		System.out.printf("\nProbability of losing: %.4f\n", ((lose1+lose2)/(double)num));
		System.out.printf("\nProbability of winning first roll: %.4f\n", (win1/(double)num));
		System.out.printf("\nProbability of losing first roll: %.4f\n", (lose1/(double)num));
		System.out.printf("\nProbability of winning by point: %.4f\n", (win2/(double)num));
		System.out.printf("\nProbability of losing by no point: %.4f\n", (lose2/(double)num));	
		reader.pause();		
	}
}
		