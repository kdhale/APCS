// Array Lists
// Kenia Hale
// Exploring array lists
import java.util.ArrayList;

public class Hale_ArrayList
{
	public static void main(String[] args)
	{
		
		KeyboardReader reader = new KeyboardReader();
		
		int choice = 0;
		ArrayList<Fraction> values = new ArrayList<Fraction>();
		Fraction input = new Fraction();
		Fraction old = new Fraction();
		int n, d, i;
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-8):\n\n"
				+ "\t 1. Display the list of fractions\n"
				+ "\t 2. Add a fraction to the end of the list\n"
				+ "\t 3. Insert a fraction at a specific location\n"
				+ "\t 4. Remove a fraction at a specific location\n"
				+ "\t 5. Remove a fraction by value\n"
				+ "\t 6. Replace a fraction at a specific location\n"
				+ "\t 7. Display Smallest to largest\n"
				+ "\t 8. Exit\n"
				+ "\t Your Choice: ");
				
				switch(choice)
				{
					case 1:// display values
						if(values.size() == 0)
						{
							System.out.println("The list is empty");
							reader.pause();
							break;
						}
						System.out.println("The list currently contains: ");
						for(i = 0; i < values.size(); i++)
						{
							System.out.println((i+1) + ".\t" + values.get(i));// use toString in fraction
						}
						reader.pause();
						break;
					case 2: //boolean add(Fraction x) adds to end of list
						n = reader.readInt("Enter the numerator to add:\t");
						d = reader.readInt("Enter the denominator to add:\t");
						if(d == 0)// denominator can't be zero!!
						{	
							while(d == 0)
							{
								System.out.println("\nInvalid value, can't devide by 0!");
								reader.pause();
								d = reader.readInt("Enter the denominator to add:\t");
							}
						}
						input = new Fraction(n,d);
						values.add(input);
						System.out.println("The fraction " + input + " has been successfully added");
						reader.pause();
						break;
					case 3: // void add(int index, E x)
						i = reader.readInt("Where do you want to add?\t"); // (values.size()+1)
						if(i < 0 || i > values.size()+1)
						{
							System.out.println("\nInvalid index value!!\nNot added to list");
							break;
						}
						n = reader.readInt("Enter the numerator to add:\t");
						d = reader.readInt("Enter the denominator to add:\t");
						if(d == 0)// denominator can't be zero!!
						{	
							while(d == 0)
							{
								System.out.println("\nInvalid value, can't devide by 0!");
								reader.pause();
								d = reader.readInt("Enter the denominator to add:\t");
							}
						}
						input = new Fraction(n,d);
						values.add((i-1), input);
						System.out.println("The fraction " + input + " has been successfully added at " + i);
						reader.pause();
						break;
					case 4:
						i = reader.readInt("Where do you want to remove?\t"); //+ (values.size()) + ":\t");
						if(i < 0 || i > values.size()+1)
						{
								System.out.println("\nInvalid index value!!\nNot taken from list");
								break;
						}
						old = values.remove((i-1));
						System.out.println("The value " + old + " at number " + i + " has been removed.");
						reader.pause();
						break;
					case 5:
						n = reader.readInt("Numerator of fraction to remove: ");
						d = reader.readInt("Denominator of fraction to remove: ");
						if(d == 0)// denominator can't be zero!!
						{	
							while(d == 0)
							{
								System.out.println("\nInvalid value, can't devide by 0!");
								reader.pause();
								d = reader.readInt("Enter the denominator to add:\t");
							}
						}
						input = new Fraction(n,d);
						
						if(values.size()==0)
							{
								System.out.println("The list is empty!");
								reader.pause();
								break;
							}
						for(i = 0; i < values.size(); i++)
						{
							if(values.get(i).equals(input))
							{
								System.out.println("The fraction " + input + " at " + (i+1) + " has been removed.");
								values.remove(i);
								break;
							}
							else if(i == values.size()-1 && values.get(i).equals(input) == false )
							{
								System.out.println("Error: The fraction " + input + " is not on the list.");
								break;
							}
						}
						reader.pause();
						break;
					case 6:
						i = reader.readInt("Where do you want to replace?\t"); //You can replace up to " + (values.size()) + ":\t");
						if(i < 0 || i > values.size()+1)
						{
							System.out.println("\nInvalid index value!!\nNot added to list");
							break;
						}
						n = reader.readInt("Enter the numerator to add:\t");
						d = reader.readInt("Enter the denominator to add:\t");
						if(d == 0)// denominator can't be zero!!
						{	
							while(d == 0)
							{
								System.out.println("\nInvalid value, can't devide by 0!");
								reader.pause();
								d = reader.readInt("Enter the denominator to add:\t");
							}
						}
						input = new Fraction(n,d);
						old = values.get(i-1);
						values.set(i-1,input);
						System.out.println("THe fraction " + old + " has been replaced by " + input);	
						reader.pause();			
						break;
					case 7: // using nested loops to find greatest
						ArrayList<Fraction> copyvalues = new ArrayList<Fraction>();
						for(i = 0; i < values.size(); i++)
						{
							copyvalues.add(values.get(i));
						}
						for(i = 0; i < copyvalues.size(); i++)
						{
							Fraction min = copyvalues.get(i);
							for(int k = i; k < copyvalues.size(); k++)
							{
								if(copyvalues.get(k).compareTo(min) == -1)
								{
									min = copyvalues.get(k);
									copyvalues.remove(k);//replace
									copyvalues.add(i,min);
								}
							}
							System.out.println((i+1) + ".\t" + min);
						}
						reader.pause();
						break;
					case 8:
						System.out.println("Bye!");
						
						reader.pause();
						break;
					default:
						System.out.println("Pick a choice, silly!");
						reader.pause();
						break;
				}	
			}while(choice != 8);
		
	}
	
}