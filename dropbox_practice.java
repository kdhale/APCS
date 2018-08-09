public class dropbox_practice
{
	public static void main(String[] args)
	{
		do{
			choice = reader.readInt("Please select a choice from the menu(integers from 1-5):\n\n"
				+ "\t 1. Decimal\n"
				+ "\t 2. Add\n"
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
						
						
				}	
			}while(choice != 12);
	}
	public int bin2dec(ArrayList lst, int num)
	{
		if (lst.size() == 0)
			return num + 1;
		else if (lst.get(0) == 1)
			bin2dec()
		
	}
}