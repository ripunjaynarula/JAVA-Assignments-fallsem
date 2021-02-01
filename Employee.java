import java.io.*;
import java.util.Scanner;
public class Employee implements Serializable
{
	String EmpId;
	String Name;
	float Salary;
	String Address;
	
	Employee(String EmpId, String Name, float Salary,String Address)
	{
		this.EmpId=EmpId;
		this.Name=Name;
		this.Salary=Salary;
		this.Address=Address;
	}
	public static void main(String args[])
	{               
		try
		{
			Scanner input= new Scanner(System.in);
			System.out.println("Enter EmpId");
			String EmpId=input.nextLine();
			System.out.println("Enter Name");
			String Name=input.nextLine();
			System.out.println("Enter Address");
			String Address=input.nextLine();
			System.out.println("Enter Salary");
			float Salary=input.nextFloat();
			Employee e=new Employee(EmpId,Name,Salary,Address);
			FileOutputStream fout=new FileOutputStream("Employee.txt");  
			ObjectOutputStream out=new ObjectOutputStream(fout);  
			out.writeObject(e);  
			out.flush();  
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("Employee.txt"));  
			Employee read=(Employee)in.readObject();  
			System.out.println(read.EmpId+" "+read.Name+" "+read.Salary+" "+read.Address);  
			in.close();  
		}
		catch(Exception e){
        System.err.println("Error: Target File Cannot Be Read");
		}
		
	}    
}