// MoneyRunner
// Kenia Hale
// Testing the ProperFraction Class

public class ProperFractionRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();

		ProperFraction kenia = new ProperFraction(22,7);
		ProperFraction jacob = new ProperFraction(2,1);
		Fraction jamison = new Fraction(15,10);
		Fraction sum;
		int n, d, choice = 0;
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 6. Print\n"
				+ "\t 7. get remainder\n"
				+ "\t 8. get whole\n"
				+ "\t Your Choice: ");
				
				switch(choice)
				{
					case 6:
						jamison.print();
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new ProperFraction(n,d);
						jacob.print();
						reader.pause();			
						break;
					case 7:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new ProperFraction(n,d);
						System.out.println(jacob.getRemainder());	
						reader.pause();
						break;
					case 8:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new ProperFraction(n,d);
						System.out.println(jacob.getWhole());
						reader.pause();
						break;

						
				}	
			}while(choice != 12);
		
	}
	
}
