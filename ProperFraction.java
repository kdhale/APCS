public class ProperFraction extends Fraction
{
	public ProperFraction(int n, int d)
	{
		super(n,d); 
	}
	
	public int getWhole()
	{
		int whole = 0;
		int n = getNumerator();
		int d = getDenominator();// super simple, concatination
		whole = n/d;
		
		return whole;
	}
	
	public int getRemainder()
	{
		int whole = 0; // modulus , change if one negative
		int n = getNumerator();
		int d = getDenominator();
		if(n < 0 || d < 0)
			n = -n%d;
		else
			n = n%d;
		return n;
	}
	public void print()
	{
		System.out.println(toString());
	}
	public String toString()
	{
		int d = getDenominator();
		int whole = this.getWhole();
		int n = this.getRemainder();
		String s1;
		if(whole != 0 && n != 0)// both whole and numerator exist
			s1 = whole + " " + Math.abs(n) + "/" + Math.abs(d);
		else if(n == 0)// numerator == 0, show whole#
			s1 = whole + " ";
		else
			s1 = super.toString();	// if no whole number, show toString from parent
			
		return s1;
	}
}