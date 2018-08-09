// Kenia Hale
// Fraction Class

public class Fraction implements FractionInterface
{
	private int myDenom;
	private int myNum;
	
	//constructors
		public Fraction( )// sets the fraction to 0/1	
		{
			myNum = 0;
			myDenom = 1;
			
		}
			     
		public Fraction(int n, int d) //creates a fully simplified fraction n/d
		{
			myNum = n;
			if(d != 0)
				myDenom = d;
			else
			{
				System.out.println("You can't divide by 0! Denom = 1!");
				myDenom = 1;
				myNum = 0;
			}
						
		}

		public Fraction(double db)  // Creates a Fraction equivalent of the decimal parameter.
		{
			int i = 1; 
			double q = 0;
			while(i <= 100000000) // SINGLE BEST LINES OF CODE EVER WRITTEN
			{
				q = db*i;
				if(q%1 == 0)
				{
					break;
				}
				i*= 10;
			}
			this.myNum = (int)q;
			this.myDenom = i;
			this.simplify();
			
		}
	     // There will be a maximum of 8 digits to the right of the 
	     // decimal. (-1 if you do it the cheap way without a loop)
	     
	//private method
		private void simplify() 		//fully reduces the Fraction
		{
			int i = 1, v = 1;
			while(i <= myDenom || i <= myNum) // finding gcf, the deviding by that
			{
				if(myDenom % i == 0 && myNum % i == 0)
					v = i;// v = greatest common denominator, i = counter
				i++;
			}
			myNum /= v;
			myDenom /= v;
			if(myNum < 0 && myDenom < 0)//if both negative, == positive!
			{
				myNum = Math.abs(myNum);
				myDenom = Math.abs(myDenom);
			}
			if(myNum < 0 || myDenom < 0)// so look like this -4/5 not 4/-5
			{
				if(myDenom < 0 && myNum > 0)
				{	
					myNum = -myNum;
					myDenom = -myDenom;
				}
			}
		}
	
	//public methods
		public Fraction add(Fraction f) // add by cross multiplying
		{
			Fraction answer = new Fraction();
			answer.myNum = this.myNum*f.myDenom + this.myDenom*f.myNum;//cross multiply!
			answer.myDenom = this.myDenom * f.myDenom;
			answer.simplify();
			return answer;
			
		}  
			
		public Fraction subtract(Fraction f)  //returns this minus f
		{
			Fraction answer = new Fraction();
			answer.myNum = this.myNum*f.myDenom - this.myDenom*f.myNum;//cross multiply subtract
			answer.myDenom = this.myDenom * f.myDenom;
			answer.simplify();
			return answer;	
		}
		public Fraction multiply(Fraction f)
		{
			Fraction answer = new Fraction();
			answer.myNum = this.myNum*f.myNum;// easy peasy multiplication
			answer.myDenom = this.myDenom * f.myDenom;
			answer.simplify();
			return answer;	
		}
		
		public Fraction divide(Fraction f)
		{
			Fraction answer = new Fraction();
			answer.myNum = this.myNum*f.myDenom; // cross multiply yoooo
			answer.myDenom = this.myDenom*f.myNum;
			answer.simplify();
			return answer;	
		}
		public double toDouble()	   // converts the fraction to a double
		{
			return (((double)myNum)/myDenom);
		}
	
		public int compareTo(Fraction f) // returns 1 if this is bigger than f 0 if this and f are equal, -1 if f is bigger than this
		{
			this.simplify();
			f.simplify();
			if(this.myNum * f.myDenom == this.myDenom * f.myNum)// cross multiply
			{
				return 0;
			}	
			else if(this.toDouble() < f.toDouble())// checks if the doubles are larger
			{
				return -1;
			}	
			else
			{
				return 1; //CAN I DO THIS????
			}
				
		}

		public boolean equals(Fraction f)
		{
			this.simplify();
			f.simplify();
			if(f.myNum == this.myNum && f.myDenom == this.myDenom)//should multiply do
			{
				return true;
			}
				
			else
			{
				return false;
			}
				
		}	
		public boolean equals(double dd) // two doubles within .00000001 are considered equal 	
		{
			Fraction d = new Fraction(dd);
			return this.equals(d);	
		}
		public boolean equals(int n, int d)	
		{
			Fraction f = new Fraction(n,d);
			return this.equals(f);
		}
	
	//accessors
		public int getNumerator()   	//returns numerator
		{
			this.simplify();
			return this.myNum;
		}
		public int getDenominator()	//returns denominator
		{
			this.simplify();
			return this.myDenom;
		}
		public void print()		//fractions should look like this:  -3/4, 13/23, 1/6, -9/5
		{
			this.simplify();
			System.out.println(toString());
		}
		public String toString()
		{
			this.simplify();
			String s1;
			s1 = myNum + "/" + myDenom;
			return s1;
		}	
//	// BONUS
//		public Fraction FractionList(char[] operators, Fraction[] list)
//		{
//			Fraction answer;
//			for(int i = 0; i < operators.length(); i++)
//			{
//				switch(operators[i])
//					case '+':
//						answer += this.add(i);
//					case '-':
//						answer += this.add()
//			}
//		}				      	
	
}




