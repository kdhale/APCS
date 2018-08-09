public class Rectangles extends Polygons
{
	private boolean isSquare = false;
	
	public Rectangles(double w, double h)
	{
		super(w,h);//calling parent constructor
		if(w == h)
		{
			isSquare = true;//
		}
	} 
	
	public boolean getIsSquare()
	{
		return isSquare;
	}
	
	public double getArea()//AREAAAA
	{
		return getWidth()*getHeight();  //Where do getWidth and getHeight come from?  I don't see them here!
			
	}
	public void displayInfo()
	{
		System.out.println("\n\nSHAPE INFO:");
		if(isSquare == true)// checking square?
			System.out.println("The figure is a square.");
		else
			System.out.println("The figure is a rectangle.");
		System.out.println("Area:  " + getArea());
		super.displayInfo();
		//calling parent's display info
	}	
}