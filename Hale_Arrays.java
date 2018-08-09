/* Kenia Hale
 * Hale_Arrays
 * does 2 methods using arrays, max/min/avg, and 3 highest in random */
 
public class Hale_Arrays
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		int choice = 0;
		while (choice != 3)
		{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-3):\n\n"
				+ "\t 1. Max Min Avg\n"
				+ "\t 2. High Values\n"
				+ "\t 3. Exit\n\n"
				+ "\t Your Choice: ");
			switch(choice)
			{
				case 1: // read in 10 values from the keyboard, return max, min, average, and display all and 10 #
					max_min_avg();
					continue;
				case 2:
					high_values();// user enters random number of random numbers, shows top 3 places
					continue;
				case 3:
					System.out.println("See yah!");
					break;
				default:
					System.out.println("\nEnter a valid number, doofus!\n");
					reader.pause();							

			}
			
		}
		
	}// ends main method
	
	//*************************************************************************
	// All of the method definitions are down here:
	
	public static void max_min_avg() // reads in 10 spaces, presents min, max and average
	{
		KeyboardReader reader = new KeyboardReader();
		int[] userNums = new int[10]; // creates ten spaces
		int max = 0, min = 0, i = 0;
		double avg = 0;		
		for(i = 0; i < userNums.length; i++)
		{
			userNums[i] = reader.readInt("Enter number " + (i + 1) + "   "); // will keep going as long as userNums.length - 1
		}
		max = userNums[0]; //initialize as a number so none are 0
		min = userNums[0];
		for(i = 0; i < userNums.length; i++)
		{
			if(userNums[i] > max) // parse through and ifnd max and min
			{
				max = userNums[i];
			}
			if(userNums[i] < min)
			{
				min = userNums[i];
			}
		}
		for(i = 0; i < userNums.length; i++)
		{
			avg = avg + userNums[i]; // sumation of all the values
		}
		avg = avg/userNums.length; // finds average
		System.out.println("\n\nYour max is: " + max
							+ "\nYour min is: " + min
							+ "\nYour average is: " + avg
							+ "\nYou entered: ");
		for(i = 0; i < userNums.length; i++) // prints all numbers to the screen
			System.out.print(userNums[i] + ", ");
		
			
		reader.pause();
	}
	
	public static void high_values()// user enters random number of random numbers, shows top 3 places
	{

		KeyboardReader reader = new KeyboardReader();
		int max = 0, i = 0, low = 0, maxp = 0; // i = counter, low = min placement if 3 numbers, maxp = placement of max
		int nums = reader.readInt("How many numbers would you like to enter?: ");
		
		int[] high_values = new int[nums];// creates array of # of #'s desired
		
		for(i = 0; i < nums; i++) // keep asking for as many as wanted
		{
			high_values[i] = reader.readInt("Enter number " + (i + 1) + ":\t"); // entering numbers into array
		}
		System.out.print("\nList of numbers: ");
		for(i = 0; i < high_values.length; i++)
			System.out.print(high_values[i] + ", "); // have to do before bc reassign values of top numbers
		
		int min = high_values[0]; // DECLARE AFTER VALUE ADDED
		
		// finds min
		for(i = 0; i < high_values.length; i++)
		{
			if(high_values.length == 3) // stores location of min value so isnt rewritten later on
			{
				if(high_values[i] <= min)
				{
					min = high_values[i];
					low = (i); // low = placement of lowest value
				}
				
			}
			
		}
		
		max = min; // now all values are >= to max
		
		// first
		for(i = 0; i < high_values.length; i++) // parse through, finds highest value
		{
			if(high_values[i] > max)
			{
				max = high_values[i];
				maxp = i;
				
			}

		}
		System.out.println("\nYou entered " + high_values.length + " numbers");
		System.out.println("\nFirst highest number # " + (maxp + 1));
		
		high_values[maxp] = min; // reassigns highest value to lowest, so won't interfere when finding 2nd highest, 3rd, etc
		max = min; // starts over kinda
		
		// second
		for(i = 0; i < high_values.length; i++)
		{
			if(high_values[i] > max)
			{
				max = high_values[i];
				maxp = i;

			}
		}
		
		System.out.println("Second highest number # " + (maxp + 1));
		
		high_values[maxp] = min;// reassigns highest value to lowest, so won't interfere when finding 2nd highest, 3rd, etc
		max = min;
		
		// third
		for(i = 0; i < high_values.length; i++)
		{
			if(high_values[i] > max)
			{
				max = high_values[i];
				maxp = i;

			}
		}
		if(high_values.length == 3) // presents pre stored low
			System.out.println("Third highest number # " + (low + 1));
		else
			System.out.println("Third highest number # " + (maxp + 1));
		reader.pause();	
		
	}
	
}