// MoneyRunner
// Kenia Hale
// Testing the Money Class

public class MoneyRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		int dollars1, dollars2, cents1, cents2, choice = 0;
		Money user1, user2, sum, difference;
		do
		{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
			+ "\t 1. Sum 1 (money param)\n"
			+ "\t 2. Sum 2 (dol, cents param)\n"
			+ "\t 3. Diff 2 (2 param)\n"
			+ "\t 4. Diff 1 (one param)\n"
			+ "\t 5. Multiplication\n"
			+ "\t 6. BONUS!\n\n"
			+ "\t Your Choice: ");
			
			switch(choice)
			{
				case 1:
					dollars1 = reader.readInt("Enter your first dollar amount: $ ");
					cents1 = reader.readInt("Enter your first cents amount: ");
					dollars2 = reader.readInt("Enter your second dollar amount: $ ");
					cents2 = reader.readInt("Enter your second cents amount: ");
					
					user1 = new Money(dollars1,cents1);
					user2 = new Money(dollars2,cents2);
					sum = user1.add(user2);
					System.out.print("You added ");
					user1.print();
					System.out.print(" and ");
					user2.print();
					System.out.println("The sum of these is "); 
					sum.print();
					reader.pause();
					continue;
				case 2:
					dollars1 = reader.readInt("Enter your first dollar amount: $ ");
					cents1 = reader.readInt("Enter your first cents amount: ");
					dollars2 = reader.readInt("Enter your second dollar amount: $ ");
					cents2 = reader.readInt("Enter your second cents amount: ");
					
					user1 = new Money(dollars1,cents1);
					sum = user1.add(dollars2,cents2);
					System.out.print(user1.toString() + " + " + dollars1 + "." + cents1 + "=" + sum.toString());
					System.out.println("The sum of these is "); 
					sum.print();
					reader.pause();
					continue;
				case 3:
					dollars1 = reader.readInt("Enter your first dollar amount: $ ");
					cents1 = reader.readInt("Enter your first cents amount: ");
					dollars2 = reader.readInt("Enter your second dollar amount: $ ");
					cents2 = reader.readInt("Enter your second cents amount: ");
					
					user1 = new Money(dollars1,cents1);
					difference = user1.subtract(dollars2,cents2);
					System.out.println("The difference of these is "); 
					difference.print();
					reader.pause();
					continue;
				case 4:
					
					dollars1 = reader.readInt("Enter your first dollar amount: $ ");
					cents1 = reader.readInt("Enter your first cents amount: ");
					dollars2 = reader.readInt("Enter your second dollar amount: $ ");
					cents2 = reader.readInt("Enter your second cents amount: ");
					
					user1 = new Money(dollars1,cents1);
					difference = user1.subtract(dollars2,cents2);
					System.out.println("The difference of these is ");
					difference.print();
					reader.pause();
					continue;
				case 5:
					dollars1 = reader.readInt("Enter your first dollar amount: $ ");
					cents1 = reader.readInt("Enter your first cents amount: ");
					int multiple = reader.readInt("Enter a number to multiply: ");
					
					user1 = new Money(dollars1,cents1);
					Money mult = user1.multiply(multiple);
					mult.print();
					reader.pause();
					continue;
				case 6:
					
					
			}
		}while(choice != 7);
		
		// sum 1
		
		
		
		
		//sum2
		
		
		//difference 1
		

		
		//difference 2
		
		// multiply
		
		
		
		
		
		
		
		
		
		



		

		
	}
}






