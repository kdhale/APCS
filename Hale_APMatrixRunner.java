// MoneyRunner
// Kenia Hale
// Testing the Money Class

public class Hale_APMatrixRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();

	//	System.out.println(kenia.oneCell(0,0,apm)); //96??
	//	System.out.println(mult);
	
		// Constructors
		
		int[][] kenia1 = {{1,2,3},{4,5,6},{7,8,9},{1,2,3}};//{{1,2,3},{4,5,6}};
		int[][] apm1 = {{7},{8},{9}};//
		int[][] jacob1 = {{1,0,0},{0,1,0},{0,0,1}};// identity
		int[][] m1 = {{77,22,1,33},{5,3,10,4},{66,44,2,55}};
		int[][] cross1 = {{11,22,33,5,44,55},{22,33,44,6,55,66},{4,5,6,7,8,9},{33,44,55,8,66,77},{44,55,66,9,77,88}};
		APMatrix jacob = new APMatrix(jacob1);
		APMatrix kenia = new APMatrix(kenia1);
		APMatrix apm = new APMatrix(apm1);
		APMatrix cross = new APMatrix(cross1);//
		APMatrix m2 = new APMatrix(m1);
		
		// second constructor
		
		
		//System.out.println(jacob.sumCross(1,3));
		
		// accessors
		
		
		

		
		//System.out.println(m2.sumCross(2,3));
		System.out.println(kenia.matrixMultiply(jacob));
//		

//		int method, row, col;
//		APMatrix m1, m2, m3, m4, a1;
//	//////////////////////////////////////////////////////////////////////
//				System.out.println("\n\n\n\n\n\n\n\nMenu 4 -- removeCross Testing");
//				System.out.println("***** CASE 1 ***** \n\n");
//				int [][]sc1 = {{1,2},{3,99}};
//				int [][]sc2 = {{99}};
//				m1 = new APMatrix(sc1);  
//				m2 = new APMatrix(sc2);  
//				m3 = m1.removeCross(1,1);
//				System.out.println("The STUDENT matrix is: \n" + m3);
//				System.out.println("The CORRECT matrix is: \n" + m2);
//				System.out.println("If the STUDENT matrix matches the CORRECT matrix, \n"
//									+ "give 1/1 pt.");
//				reader.pause();
//
//				//////////////////////////////////////////////////////////////////////
//				System.out.println("\n\n\n\n\n\n\n\nMenu 4 -- removeCross Testing");
//				System.out.println("***** CASE 2 ***** \n\n");
//				int [][]sc5 = {{3}};
//				m2 = new APMatrix(sc5);  
//				m3 = m1.removeCross(1,2);
//				System.out.println("The STUDENT matrix is: \n" + m3);
//				System.out.println("The CORRECT matrix is: \n" + m2);
//				System.out.println("If the STUDENT matrix matches the CORRECT matrix, \n"
//									+ "give 1/1 pt.");
//				reader.pause();
//				//////////////////////////////////////////////////////////////////////
//				System.out.println("\n\n\n\n\n\n\n\nMenu 4 -- removeCross Testing");
//				System.out.println("***** CASE 3 ***** \n\n");
//				int [][]sc3 = {{11,22,33,5,44,55},{22,33,44,6,55,66},{4,5,6,7,8,9},{33,44,55,8,66,77},{44,55,66,9,77,88}};
//				int [][]sc4 = {{11,22,33,44,55},{22,33,44,55,66},{33,44,55,66,77},{44,55,66,77,88}};
//				m1 = new APMatrix(sc3);  
//				m2 = new APMatrix(sc4);  
//				m3 = m1.removeCross(3,4);
//				System.out.println("The STUDENT matrix is: \n" + m3);
//				System.out.println("The CORRECT matrix is: \n" + m2);
//				System.out.println("If the STUDENT matrix matches the CORRECT matrix, \n"
//									+ "give 1/1 pt.");
//				reader.pause();
//				//////////////////////////////////////////////////////////////////////
//				System.out.println("\n\n\n\n\n\n\n\nMenu 4 -- removeCross Testing");
//				System.out.println("***** CASE 4 ***** \n\n");
//				int [][]sc6 = {{11,22,33,44},{22,33,44,55},{33,44,55,66}};
//				m2 = new APMatrix(sc6);  
//				m3 = m3.removeCross(4,5);
//				System.out.println("The STUDENT matrix is: \n" + m3);
//				System.out.println("The CORRECT matrix is: \n" + m2);
//				System.out.println("If the STUDENT matrix matches the CORRECT matrix, \n"
//									+ "give 1/1 pt.");
//				reader.pause();
//				//////////////////////////////////////////////////////////////////////
//				System.out.println("\n\n\n\n\n\n\n\nMenu 4 -- removeCross Testing");
//				System.out.println("***** CASE 5 ***** \n\n");
//				int [][]sc7 = {{33,44,55},{44,55,66}};
//				m2 = new APMatrix(sc7);  
//				m3 = m3.removeCross(1,1);
//				System.out.println("The STUDENT matrix is: \n" + m3);
//				System.out.println("The CORRECT matrix is: \n" + m2);
//				System.out.println("If the STUDENT matrix matches the CORRECT matrix, \n"
//									+ "give 1/1 pt.");
//				reader.pause();
//				//////////////////////////////////////////////////////////////////////
//				System.out.println("\n\n\n\n\n\n\n\nMenu 4 -- removeCross Testing");
//				System.out.println("***** CASE 6 ***** \n\n");
//				int [][]sc8 = {{33,55}};
//				m2 = new APMatrix(sc8);  
//				m3 = m3.removeCross(2,2);
//				System.out.println("The STUDENT matrix is: \n" + m3);
//				System.out.println("The CORRECT matrix is: \n" + m2);
//				System.out.println("If the STUDENT matrix matches the CORRECT matrix, \n"
//									+ "give 1/1 pt.");
//				reader.pause();



	}
	
}