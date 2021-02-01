import java.io.*;
import java.util.Scanner;
class Loan implements Serializable
{
	String CustomerName;
	String Address;
	int Age;
	float Salary;
	float LoanAmount;
	String LoanType;
	Loan(String CustomerName,String Address,int Age,float Salary,float LoanAmount,String LoanType)
	{
		this.CustomerName=CustomerName;
		this.Address=Address;
		this.Age=Age;
		this.Salary=Salary;
		this.LoanAmount=LoanAmount;
		this.LoanType=LoanType;
	}
	public static void main(String args[])
	{
		try{
		Scanner input= new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("Loan.txt");  
		ObjectOutputStream out=new ObjectOutputStream(fout);
		Loan l[]= new Loan[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Customer's Name: ");
			String CustomerName= input.nextLine();
			System.out.println("Enter Address: ");
			String Address= input.nextLine();
			System.out.println("Enter Loan Type: ");
			String LoanType=input.nextLine();
			System.out.println("Enter Age: ");
			int Age=input.nextInt();
			System.out.println("Enter Salary: ");
			float Salary= input.nextFloat();
			System.out.println("Enter Loan Amount: ");
			float LoanAmount= input.nextFloat();
			input.nextLine();
			l[i]= new Loan(CustomerName,Address,Age,Salary,LoanAmount,LoanType);
			out.writeObject(l[i]);
		}
		out.flush();  
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Loan.txt"));
		while (true) {
			try {
            Loan read = (Loan) in.readObject();
            if(!((read.CustomerName).matches("[A-Za-z]+")))
			{
				System.out.println("Name Invalid");
			}
			else if(read.Age<18)
			{
				System.out.println("Invalid! Minimum Age not met");
			}
			else if(read.Salary<20000)
			{
				System.out.println("Invalid! Minimum Salary not met");
			}
			else if((read.Salary*100000)/2162>=read.LoanAmount)
			{
				System.out.println("Invalid! Exceeds eligible loan amount");
			}
			else if(((read.LoanType).equals("housing"))||((read.LoanType).equals("vehicle"))||((read.LoanType).equals("personal")))
			{
				System.out.println("Invalid Loan Type");
			}
			else{
				System.out.println("Valid");
			}
			} catch (EOFException exp) {
            break;
			}
		}

		in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.println("Error: Target File Cannot Be Read");
		}
			
	}
}