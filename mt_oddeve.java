import java.util.Scanner;
class EvenThread extends Thread
{
	int n;
	EvenThread(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("Even Nubers are: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class OddThread extends Thread
{
	int n;
	OddThread(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("Odd Numbers are: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
public class mt_oddeve
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Range: ");
		int n=input.nextInt();
		EvenThread e= new EvenThread(n);
		OddThread o= new OddThread(n);
		e.start();
		o.start();
	}
}