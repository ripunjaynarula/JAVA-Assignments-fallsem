import java.util.Scanner;
abstract class Special
{
	abstract double Process(double P,double R);
}
class Discount extends Special
	{
		double Process(double P,double R)
		{
			double net=P-P*(R/100);
			return net;
		}
	}
public class SpecialMain 
{
	public static void main(String args[])
	{
		Discount d=new Discount();
		System.out.printf("Total %f ",d.Process(790.00,55.00));
	}
}