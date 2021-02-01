import java.util.Scanner;
public class StudentDetails
{
	String RegNo;
	String Name;
	float CGPA;
	String Program;
	String School;
	String Proctor;
	
	void display()
	{
		System.out.println("RegNo: "+this.RegNo);
		System.out.println("Name: "+this.Name);
		System.out.println("CGPA: "+this.CGPA);
		System.out.println("Program: "+this.Program);
		System.out.println("School: "+this.School);
		System.out.println("Proctor: "+this.Proctor);
	}
	StudentDetails()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Regno");
		this.RegNo=input.nextLine();
		System.out.println("Enter Name");
		this.Name=input.nextLine();
		System.out.println("Enter CGPA");
		this.CGPA=input.nextFloat();
		input.nextLine();
		System.out.println("Enter Program");
		this.Program=input.nextLine();
		System.out.println("Enter School");
		this.School=input.nextLine();
		System.out.println("Enter Proctor");
		this.Proctor=input.nextLine();
	}
	
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter no.of students");
		int n= input.nextInt();
		StudentDetails s[]=new StudentDetails[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new StudentDetails();
		}
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}