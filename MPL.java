import java.util.Scanner;
public class MPL{
	int Standard;
	int No_of_Students;
	int marks[];
	int bestmark;
	int classavg;
	MPL(int Standard, int No_of_Students)
	{
		this.Standard=Standard;
		this.No_of_Students=No_of_Students;
		Scanner input= new Scanner(System.in);
		System.out.println("Form to fill up all the students marks: ");
		this.marks=new int[No_of_Students];
		int a=-1,sum=0;
		for(int i=0;i<No_of_Students;i++)
		{
			marks[i]=input.nextInt();
			sum=sum+marks[i];
			if(marks[i]>a)
			{
				a=marks[i];
			}
		}
		this.classavg=sum/No_of_Students;
		this.bestmark=a;
		System.out.println("First mark is: "+bestmark);
	}
	void findBestClass(MPL m[],int n)
	{
		int a=-1;
		for(int i=0;i<n;i++)
		{
			if(m[i].bestmark>a)
			{
				a=m[i].bestmark;
			}
		}
		for(int i=0;i<No_of_Students;i++)
		{
			if(m[i].bestmark==a)
			{
				System.out.println("Class with highest mark is: "+m[i].Standard);
				break;
			}
		}
	}
	void findBestClass(MPL m[])
	{
		int a=-1;
		for(int i=0;i<No_of_Students;i++)
		{
			if(m[i].classavg>a)
			{
				a=m[i].classavg;
			}
		}
		for(int i=0;i<No_of_Students;i++)
		{
			if(m[i].classavg==a)
			{
				System.out.println("Class with highest average is: "+m[i].Standard);
				break;
			}
		}
	}
	
	public static void main(String args[])
	{
		MPL m= new MPL('A',5);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no.of classes");
		int n= input.nextInt();
		MPL arr[]=new MPL[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter standard");
			int std= input.nextInt();
			System.out.println("Enter No.of Students");
			int num= input.nextInt();
			arr[i]=new MPL(std,num);
		}
		arr[0].findBestClass(arr,n);
		arr[0].findBestClass(arr);
	}
}