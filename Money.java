//Money.java
//Kenia Hale!!!!!
//This simple class consists of only 2 instance variables, containing dollars and cents values.
//It is both incomplete and incorrect.
//Your task:  Complete, fix it, and thoroughly test it.

public class Money             
{
	// private instance variables
	private int myDollars;
	private int myCents;
	
	// default constructor method -- no parameters
	public Money()
	{
		myDollars = 0;
		myCents = 0;
	}
	// constructor method to input dollars and cents
	public Money(int newDollars, int newCents)
	{
		myDollars = newDollars;
		myCents = newCents;
		this.normalize();
	}

	//Accessor methods -- return the private variable values
	public int getDollars()
	{
		return myDollars;
	}
	
	public int getCents()
	{
		return myCents;
	}
	
	//  One Money parameter add method
	//  This method combines the totals in this and the parameter amount

	// Money sum = sarah.add(jojo);
	public Money add(Money amount)
	{
		Money result = new Money();
		this.normalize();
		result.myCents = this.myCents + amount.myCents;
		result.myDollars = this.myDollars + amount.myDollars;
		
		result.normalize();
		return result;
	}
	// 	Two int parameter add method  -- YOU WILL ADD THIS AND MUCH MORE!!!
	//  This method gets passed dollars and cents instead of a Money object
	public Money add(int dollars, int cents)
	{
		Money result = new Money();
		
		result.myCents = this.myCents + cents;
		result.myDollars = this.myDollars + dollars;
		
		result.normalize();
		return result;
	}
	
	
	public Money subtract(Money money)
	{
		Money result = new Money();
		
		result.myCents = this.myCents - money.myCents;
		result.myDollars = this.myDollars - money.myDollars;
		
		result.normalize();
		return result;
		
	}
	
	public Money subtract(int dollars, int cents)
	{
		Money result = new Money();
		
		result.myCents = this.myCents - cents;
		result.myDollars = this.myDollars - dollars;
		
		result.normalize();
		return result;
	}
	
	public Money multiply(int mult)
	{
		Money result = new Money();
		
		result.myCents = this.myCents * mult;
		result.myDollars = this.myDollars * mult;
		
		result.normalize();
		return result;
	}


	//This method should fix the problem of myCents > 99 or myCents < 0
	//Think carefully about which methods should call normalize()
	//COMPLETING THIS METHOD IS THE MAIN PART OF THIS ASSIGNMENT
	private void normalize()
	{
		if(myCents>99) // so no 100s in cents
		{
			while(myCents>99)
			{
				myCents -= 100;
				myDollars++;
			}
		}  
		if(myCents < 0) // so will add negative cents values correct, know to subtract from dollars
		{
		
			while(myCents <0)
			{
				myDollars--;
				myCents += 100;
			}
			
		}
		if(myDollars < 0)// bc if went through both of these and still - dollars, must be negative, so == 0
		{
			myDollars = 0;
			myCents = 0;
		}
	}

	//This method (incorrectly) displays the values attractively to the screen 
	// THIS METHOD REQUIRES ONLY A SMALL MODIFICATION TO WORK PROPERLY
	public void print()
	{
		System.out.println(toString());
	}

	
	// This method (incorrectly) overwrites the automatic toString() method	
	// THIS METHOD REQUIRES ONLY A SMALL MODIFICATION TO WORK PROPERLY
	public String toString()
	{
		this.normalize();
		String s1;
		if(myCents<10)
			s1 = "$" + myDollars + ".0" + myCents;
		else
			s1 = "$" + myDollars + "." + myCents;
		return s1;
	}
}






