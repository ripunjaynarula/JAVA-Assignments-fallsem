import java.util.Scanner;
class IllegalArgumentException extends Exception
{
	IllegalArgumentException(String s)
	{
		super(s);
	}
}
class NumberFormatException extends Exception
{
	NumberFormatException(String s)
	{
		super(s);
	}
}
class NoSuchElementException extends Exception
{
	NoSuchElementException(String s)
	{
		super(s);
	}
}
public class stud_exception
{
	String RegNo;
	String Phn_No;
	public boolean onlyDigits(String str) 
    { 
        int count=0;
		for (int i = 0; i < str.length(); i++) 
		{ 
            if (!Character.isDigit(str.charAt(i)))  
			{ 
                return false; 
            } 
        } 
        return true; 
    } 
	public void LengthCheck(String RegNo, String Phn_No) throws IllegalArgumentException
	{
		if((this.RegNo.length()!=9)||(this.Phn_No.length()!=10))
		{
			throw new IllegalArgumentException("Invalid");
		}
		else
		{
			System.out.println("Valid");
		}
	}
	public void CheckNumber(String Phn_No) throws NumberFormatException
	{
		if(!onlyDigits(this.Phn_No))
		{
			throw new NumberFormatException("Invalid");
		}
		else
		{
			System.out.println("Valid");
		}
	}
	public void RegNoPattern(String RegNo) throws NoSuchElementException
	{
		if(!RegNo.matches("[A-Za-z0-9]+"))
		{
			throw new NoSuchElementException("Invalid");
		}
		else
		{
			System.out.println("Valid");
		}
	}
	stud_exception(String RegNo, String Phn_No)
	{
		this.RegNo =RegNo;
		this.Phn_No=Phn_No;
		try{
			LengthCheck(this.RegNo,this.Phn_No);
			CheckNumber(this.Phn_No);
			RegNoPattern(this.RegNo);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Exception occured: "+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception occured: "+e);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception occured: "+e);		
		}
	}
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Reg No:");
		String RegNo= input.nextLine();
		System.out.println("Phn_No:");
		String Phn_No= input.nextLine();
		stud_exception s= new stud_exception(RegNo,Phn_No);
		
	}
}