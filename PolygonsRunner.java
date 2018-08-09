//McKeen 
//PolygonsRunner.java
//An introduction to inheritance in OOP

//import TerminalIO.KeyboardReader;

public class PolygonsRunner
{
	public static void main(String[]args)
	{
		KeyboardReader reader = new KeyboardReader();
		Polygons[] test = new Polygons[4];
		test[0] = new Triangle(9,1,"acute");
		test[1] = new Triangle(9,1,"acute");
		test[2] = new Rectangles(2,2);
		test[3] = new Rectangles(3,4);
		
		for(int i = 0; i < test.length; i++)
		{
			test[i].displayInfo();
		}
	}	
}
