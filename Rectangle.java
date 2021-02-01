import java.util.Scanner;
public class Rectangle
{
	public double width;
	public double height;
	Rectangle()
	{
		width=1;
		height=1;
	}
	Rectangle(double width, double height)
	{
		this.width=width;
		this.height=height;
	}
	public double getArea()
	{
		return (width*height);
	}
	public double getPerimeter()
	{
		return (2*(width+height));
	}
	public static void main(String[] args)
	{
		Rectangle r1= new Rectangle();
		Scanner input=new Scanner(System.in);
		System.out.println("Default Width : "+r1.width);
		System.out.println("Default Height : "+r1.height);	
		System.out.println("Default Area : "+r1.getArea());
		System.out.println("Default Perimeter : "+r1.getPerimeter());		
		System.out.println("Enter width: ");
		double width = input.nextDouble();
		System.out.println("Enter height: ");
		double height= input.nextDouble();
		Rectangle r2= new Rectangle(width,height);
		System.out.println("Width : "+r2.width);
		System.out.println("Height : "+r2.height);	
		System.out.println("Area : "+r2.getArea());
		System.out.println("Perimeter : "+r2.getPerimeter());
		System.out.println("Enter width: ");
		width = input.nextDouble();
		System.out.println("Enter height: ");
		height= input.nextDouble();
		Rectangle r3= new Rectangle(width,height);
		System.out.println("Width : "+r3.width);
		System.out.println("Height : "+r3.height);	
		System.out.println("Area : "+r3.getArea());
		System.out.println("Perimeter : "+r3.getPerimeter());		
	}
}