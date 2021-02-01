
import java.util.Scanner;
public class Student
{
	public String Regno;
	public String Name;
	public String Course;
	public float CGPA;
	Student()
	{
		Regno="NULL";
		Name="NULL";
		Course="NULL";
		CGPA=0;
	}
	Student(String Regno, String Name, String Course, float CGPA)
	{
		this.Regno=Regno;
		this.Name=Name;
		this.Course=Course;
		this.CGPA=CGPA;
	}
	public void display()
	{
		System.out.println("Regno: "+Regno);
		System.out.println("Name: "+Name);
		System.out.println("Course: "+Course);
		System.out.println("CGPA: "+CGPA);
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Student s[]= new Student[10];
		Student def= new Student();
		System.out.println("Default values are: ");
		def.display();
		for(int i=0;i<10;i++)
		{
			System.out.println("Regno: ");
			String Regno=input.nextLine();
			System.out.println("Name: ");
			String Name=input.nextLine();
			System.out.println("Course: ");
			String Course=input.nextLine();
			System.out.println("CGPA: ");
			float CGPA=input.nextFloat();
			input.nextLine();
			s[i]=new Student(Regno,Name,Course,CGPA);
		}
		System.out.println("The 9 pointers are: ");
		for(int i=0;i<10;i++)
		{
			if(s[i].CGPA>=9)
			{
				s[i].display();
			}
		}
	}
}