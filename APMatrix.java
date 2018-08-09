// Kenia Hale APMatrix

public class APMatrix
{
	KeyboardReader reader = new KeyboardReader();
	
	//private variable
	private int[][] kenia;
	
	//constructors
	public APMatrix(int R, int C, boolean enter)
	{
		if(enter == true)
		{
			kenia = new int[R][C];
			for(int i = 0; i < kenia.length; i++)
				for(int k = 0; k < kenia[i].length; k++)
					kenia[i][k] = reader.readInt("Enter a value: ");// read in values
		}
		else
			kenia = new int[R][C];
	}
	
	public APMatrix(int[][] copyMe)
	{
		kenia = new int[copyMe.length][copyMe[0].length];// new 
		for(int i = 0; i < copyMe.length; i++)
			for(int k = 0; k < copyMe[i].length; k++)
				kenia[i][k] = copyMe[i][k]; 
	}
	// Party methods!!!
	public APMatrix matrixMultiply(APMatrix m1)
	{
//		int sum = 0;
//		boolean enter = false;
//		if(this.getColumns() == m1.getRows())
//		{
//			APMatrix matrix = new APMatrix(this.getRows(),m1.getColumns(),enter);
//			for(int i = 0; i < matrix.getRows(); i++)// populating matrix
//				for(int k = 0; k < matrix.getColumns(); k++)
//					matrix.kenia[i][k] = this.oneCell(i,k,m1); // populating each cell
//			return matrix;	
//		}
//		else // error
//		{
//			System.out.println("Can't multiply these matrixes!");
//			return null;
//		}

		int sum = 0;
		boolean enter = false;
		if(this.getColumns() == m1.getRows())
		{
			APMatrix matrix = new APMatrix(this.getRows(),m1.getColumns(),enter);
			for(int i = 0; i < matrix.getRows(); i++)// populating matrix
				for(int k = 0; k < matrix.getColumns(); k++)
				{
					sum = 0;
					for(int row = 0; row < m1.getRows(); row++) // col of this = row of mm
					{
						sum += (this.kenia[i][row]) * (m1.kenia[row][k]);
					}
						
					matrix.kenia[i][k] = sum;
				}
			return matrix;	
		}
		else // error
		{
			System.out.println("Can't multiply these matrixes!");
			return null;
		}
	}
	
	public int sumCross(int r, int c) // incorrect index values, one too many
	{
		int sum =0;
		r--;
		c--;
		
		if(r < 0 || r >= this.getRows())
		{
			System.out.println("Incorrect index values!!");
			return -1;
		}
		else if(c < 0 || c >= this.getColumns())
		{
			System.out.println("Incorrect index values!!");
			return -1;
		}
		else
		{
			for(int row = 0; row < this.getRows(); row++) // col of this = row of mm
				sum += (this.kenia[row][c]);
			for(int col = 0; col < this.getColumns(); col++) // col of this = row of mm
				sum += (this.kenia[r][col]);
			sum -= this.kenia[r][c];
			return sum;
		}

	}
	
	public APMatrix removeCross(int r, int c)// index one too many
	{
		if(r < 0 || r >= this.getRows())
		{
			System.out.println("Incorrect index values!!");
			return this;
		}
		else if(c < 0 || c >= this.getColumns())
		{
			System.out.println("Incorrect index values!!");
			return this;
		}
		else
		{
			int[][] copy1 = new int[this.getRows()][this.getColumns()-1];
			int[][] copycopy1 = new int[this.getRows()-1][this.getColumns()-1];
			APMatrix copy = new APMatrix(copy1);// same rows, get rid of column
			APMatrix copycopy = new APMatrix(copycopy1); // get rid of row
			r--;
			c--;
			int row = 0, col = 0;
			
			// copy YAY WORKING, get rid of col
			for(row = 0; row < this.getRows(); row++) // up to the row number, correct
				for(col = 0; col < c; col++)
				{
					copy.kenia[row][col] = this.kenia[row][col];
				}
					
			for(row = 0; row < this.getRows(); row++) // top bit right
				for(col = c+1; col < this.getColumns(); col++)
				{
					copy.kenia[row][col-1] = this.kenia[row][col];
				}
					
	
			// copycopy get rid of row
			
			for(row = 0; row < r; row++) // up to the row number, correct
				for(col = 0; col < copy.getColumns(); col++)
					copycopy.kenia[row][col] = copy.kenia[row][col];
			for(row = r+1; row < copy.getRows(); row++) // bottom left
				for(col = 0; col < copy.getColumns(); col++)
					copycopy.kenia[row-1][col] = copy.kenia[row][col];	
			return copycopy;
		}

		
	}
	
	
	//accessors
	public int getRows() // no matter what, kenia variable refers to the int[][] in the APMATRIX
	{
		return kenia.length;
	}
	public int getColumns()
	{
		return kenia[0].length;
	}
	
	public String toString()
	{
		String s1 = "";
		for(int i = 0; i < kenia.length; i++)
		{
			for(int k = 0; k < kenia[i].length; k++)
				s1 += kenia[i][k] + "\t";
			s1 += "\n";
		}	
		return s1;
	}
//	public int oneCell(int r, int c, APMatrix mm)//mm = multiplied matrix always uses correct index values
//	{
//		int sum = 0, row = 0;
//		for(row = 0; row < mm.getRows(); row++) // col of this = row of mm
//			sum += (this.kenia[r][row]) * (mm.kenia[row][c]); // HOLY COW THIS LINE TOOK ME 3 HOURS, say kenia bc [][]		
//		return sum;
//	}
	

}