import java.util.Scanner;
class TestDetails
{
	static float storearr[][];
	static void storeMarks(float arr[][])
	{
		storearr=new float[25][];
		for(int i=0;i<25;i++)
		{
			storearr[i]=new float[arr[i].length];
			storearr[i]=arr[i];
		}
	}
	static void displayMarks()
	{
		for(int i=0;i<25;i++)
		{
			for(int j=0;j<storearr[i].length;j++)
			{
				System.out.print(storearr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class NoticePeriod extends TestDetails
{
	int index[]=new int[25];
	int k=0;
	void benchedStudents(float storearr[][])
	{
		for(int i=0;i<storearr.length;i++)
		{
			if(storearr[i].length<3)
			{
				index[k]=i;
				k++;
			}
			else
			{
				int count=0;
				for(int j=0;j<storearr[i].length;j++)
				{
					if(storearr[i][j]>50f)
					{
						count++;
						if(count>=3)
						{
							break;
						}
					}
				}
				if(count<3)
				{
					index[k]=i;
					k++;
				}
			}
		}
		System.out.println("The indices of the benched students: ");
		for(int i=0;i<k;i++)
		{
			System.out.print(index[i]+" ");
		}
		System.out.println();
	}
}
public class MainStudentTest extends TestDetails
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		float arr[][]=new float[25][];
		for(int i=0;i<25;i++)
		{
			System.out.println("No.of tests");
			int n=input.nextInt();
			System.out.println("Enter the marks of student for attempted tests: ");
			arr[i]=new float[n];
			for(int j=0;j<n;j++)
			{
				arr[i][j]=input.nextFloat();
			}
		}
		storeMarks(arr);
		displayMarks();
		NoticePeriod np=new NoticePeriod();
		np.benchedStudents(arr);
		
	}
}