import java.util.Scanner;
interface Exam
{
	int Pass();
}

interface Classify
{
	String Average(int total);
}

public class Result implements Exam,Classify
{
	int n;
	public int Pass()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the no.of students");
		this.n= input.nextInt();
		int s[]=new int[n];
		int total=0;
		System.out.println("Enter the marks of the students");
		for(int i=0;i<n;i++)
		{
			s[i]=input.nextInt();
			total+=s[i];
		}
		return total;
	}
	public String Average(int total)
	{
		return String.valueOf(total/n);
	}
	String Division(String average)
	{
		int avg= Integer.parseInt(average);
		if(avg>=60)
		{
			return "FIRST";
		}
		else if(avg>=50)
		{
			return "SECOND";
		}
		else
		{
			return "NO DIVISION";
		}
	}
	public static void main(String args[])
	{
		Result r=new Result();
		System.out.println("The Division is: "+r.Division(r.Average(r.Pass())));
	}
}