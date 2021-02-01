import java.util.Scanner;
class SameColorBallException  extends Exception
{
	SameColorBallException (String s)
	{
		super(s);
	}
}
public class ball_exception
{
	public void RandomPickGenerator()
	{
		int count=0;
		int arr[]=new int[10];
		Scanner input=new Scanner(System.in);
		while(count<10)
		{
			System.out.println("Enter ball red:0, green:1, blue:2, yellow:3");
			int num=input.nextInt();
			arr[count]=num;
			try
			{
				if(count>2)
				{
					if((arr[count-3]==arr[count-2])&&(arr[count-2]==arr[count-1])&&(arr[count-1]==arr[count]))
					{
						throw new SameColorBallException("Invalid");
					}
					else
					{
						count++;
					}
				}
				else
				{
					count++;
				}
			}
			catch(SameColorBallException e)
			{
				System.out.println("Do not enter the same colored ball more than thrice ");
			}
		}
		int r=0,b=0,y=0,g=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]==0)
			{
				r++;
			}
			else if(arr[i]==1)
			{
				g++;
			}
			else if(arr[i]==2)
			{
				b++;
			}
			else
			{
				y++;
			}
		}
		System.out.println("Red balls: "+r);
		System.out.println("Blue balls: "+b);
		System.out.println("Green balls: "+g);
		System.out.println("Yellow balls: "+y);
	}
	public static void main(String args[])
	{
		ball_exception r= new ball_exception();
		r.RandomPickGenerator();
	}
}