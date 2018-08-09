/* Kenia Hale and TMez
 * ShrutiTaliaJessicaDylanKenia_Variables
 * variables review!
 */
public class ShrutiTaliaJessicaDylanKenia_Variables
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		int choice = 0; // declaring and initialization of variable
		while(choice != 4)
		{
			System.out.println("\nWelcome to my menu. Please select from the following options:\n\n"
			+ "\t 1. Fahrenheit to Celcius Converter\n"
			+ "\t 2. Tax Calculator\n"
			+ "\t 3. Area!\n"
			+ "\t 4. Exit\n");
			
			choice = reader.readInt("Enter your choice: ");
			switch(choice)
			{
				case 1: // Input Fahrenheit and output Celcius, illustrate readInt and casting
					int temp = 0; // declaring and initialization of variable
					double c = 0;
					temp = reader.readInt("Enter a temp in Fahrenheit! ");
					c = ((5.0/9)* (temp - 32)); // 5.0/9 instead of 5/9 bc double/int = double while int/int = int (5/9 output 0)
					System.out.println("Your temprature in Celcius is " + c);
					reader.pause();
					break; // return to menu
				case 2:
					int dollars;
					double tax;
					double total;
					dollars = reader.readInt("Please enter the cost of your purchase, in dollars: ");
					tax= 0.08 * dollars;
					total = (double)dollars + tax; //
					System.out.printf("Your tax owed is %.2f\n", tax);
					System.out.printf("Your total is %.2f\n", total);
					reader.pause();
					break;
				case 3:
					int rad = reader.readInt("Enter the radius of your circle(whole numbers please): ");
					final double PI = 3.14; // constant, so can't change later in code
					double area = rad * rad * PI; // ie. area = pi * r squared
					System.out.println("Your area is: " + area);
					reader.pause();
					break;

			}
					
		}System.out.println("Goodbye!");	
	}
	
}