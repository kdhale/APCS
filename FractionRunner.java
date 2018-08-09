// MoneyRunner
// Kenia Hale
// Testing the Money Class

public class FractionRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();

		Fraction kenia = new Fraction(15,10);
		Fraction jacob = new Fraction(3,-5);
		Fraction sum;
		int n, d, choice = 0;
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. Decimal\n"
				+ "\t 2. Add\n"
				+ "\t 3. Subtract\n"
				+ "\t 4. Multiply\n"///SIMPLIFY NOT WORKING
				+ "\t 5. Divide\n"
				+ "\t 6. Print\n"
				+ "\t 7. .equals jacob\n"
				+ "\t 8. .equals n,d\n"
				+ "\t 9. .equals dec\n"
				+ "\t 10. compare to\n"
				+ "\t 11. kenia to double\n"
				+ "\t Your Choice: ");
				
				switch(choice)
				{
					case 1:
						double dec = reader.readDouble("Enter a decimal: ");
						Fraction deci = new Fraction(dec);
						System.out.println(deci.toString());
						reader.pause();
						break;
					case 2:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new Fraction(n,d);
						sum = kenia.add(jacob);
						System.out.println(sum);
						reader.pause();
						break;
					case 3:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new Fraction(n,d);
						sum = kenia.subtract(jacob);
						sum.print();
						reader.pause();
						break;
					case 4:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new Fraction(n,d);
						sum = kenia.multiply(jacob);
						sum.print();
						reader.pause();
						break;
					case 5:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new Fraction(n,d);
						sum = kenia.divide(jacob);
						sum.print();
						reader.pause();
						break;
					case 6:
						kenia.print();
						jacob.print();
						reader.pause();			
						break;
					case 7:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new Fraction(n,d);
						kenia.equals(jacob);
						reader.pause();
						break;
					case 8:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						kenia.equals(n,d);
						reader.pause();
						break;
					case 9:
						dec = reader.readDouble("Enter a decimal: ");
						kenia.equals(dec);
						reader.pause();
						break;
					case 10:
						n = reader.readInt("Numerator: ");
						d = reader.readInt("Denominator: ");
						jacob = new Fraction(n,d);
						kenia.compareTo(jacob);
						reader.pause();
						break;
					case 11:
						System.out.print(kenia.getNumerator());
						reader.pause();
						break;
						
						
						
				}	
			}while(choice != 12);
		
	}
	
}
