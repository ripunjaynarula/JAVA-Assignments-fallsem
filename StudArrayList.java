import java.util.*;
class StudArrayList
{
	String StudentID;
	String Name;
	int marks1;
	int marks2;
	int marks3;
	StudArrayList(String StudentID, String Name, int marks1,int marks2,int marks3)
	{
		this.StudentID=StudentID;
		this.Name=Name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		StudArrayList s[]= new StudArrayList[5];
		ArrayList<StudArrayList> alist= new ArrayList<StudArrayList>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter StudentID: ");
			String StudentID=input.nextLine();
			System.out.println("Enter Name: ");
			String Name=input.nextLine();
			System.out.println("Enter marks for subject 1: ");
			int marks1=input.nextInt();
			System.out.println("Enter marks for subject 2: ");
			int marks2=input.nextInt();
			System.out.println("Enter marks for subject 3: ");
			int marks3=input.nextInt();
			input.nextLine();
			s[i]=new StudArrayList(StudentID,Name,marks1,marks2,marks3);
			alist.add(s[i]);
		}
		for(StudArrayList l: alist)
		{
			System.out.println("Student StudentID: "+l.StudentID);
			System.out.println("Student Name: "+l.Name);
			System.out.println("Student marks 1: "+l.marks1);
			System.out.println("Student marks 2: "+l.marks2);
			System.out.println("Student marks 3: "+l.marks3);
		}
	}
}