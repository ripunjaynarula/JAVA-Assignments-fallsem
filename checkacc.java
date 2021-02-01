import java.util.Scanner;
class Account
{
	double accbalance;
	Account(double accbalance)
	{
		this.accbalance=accbalance;
		if(this.accbalance<0)
		{
			this.accbalance=0.0;
			System.out.println("The Initial Balance is Invalid");
		}
	}
	void credit(double amount)
	{
		this.accbalance+=amount;
		System.out.println("Amount credited: "+amount);
		System.out.println("New Account Balance: "+this.accbalance);
	}
	void debit(double amount)
	{
		if(this.accbalance<amount)
		{
			System.out.println("Insufficient Funds");
		}
		else
		{
			this.accbalance-=amount;
			System.out.println("Amount debited: "+amount);
			System.out.println("New Account Balance: "+this.accbalance);
		}
	}
	void enquiry()
	{
		System.out.println("Current Account Balance: "+this.accbalance);
	}
}
class SavingsAccount extends Account
{
	double interest;
	SavingsAccount(double amount, double interest)
	{
		super(amount);
		this.interest=interest;
	}
	double calculateInterest()
	{
		return interest*accbalance;
	}
	
}

public class checkacc extends Account
{
	double fee;
	checkacc(double amount,double fee)
	{
		super(amount);
		this.fee=fee;
	}
	void credit(double amount)
	{
		super.accbalance=super.accbalance+amount-this.fee;
		System.out.println("Amount credited: "+amount);
		System.out.println("New Account Balance: "+super.accbalance);
	}
	void debit(double amount)
	{
		if(super.accbalance<amount)
		{
			System.out.println("Insufficient Funds");
		}
		else
		{
			super.accbalance=super.accbalance+amount-this.fee;
			System.out.println("Amount debited: "+amount);
			System.out.println("New Account Balance: "+super.accbalance);
		}
	}
	public static void main(String args[])
	{
		Account a= new Account(12345.56);
		a.credit(33.51);
		a.debit(38);
		a.enquiry();
		SavingsAccount sa= new SavingsAccount(12345.56,57);
		double interest= sa.calculateInterest();
		sa.credit(interest);
		checkacc ca=new checkacc(43251.22,66);
		ca.credit(72);
		ca.debit(2589.54);
	}
}