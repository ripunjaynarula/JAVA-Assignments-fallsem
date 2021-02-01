import java.io.*;
public class LCase
{
	public static void main(String args[])
	{               
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("D:/VTOP/java-19bce0470/LowerCase.txt")); 
			String s=null;
				while((s=br.readLine()) != null)
			{	
				System.out.println(s.toLowerCase());
			}
		}
		catch(Exception e){
        System.err.println("Error: Target File Cannot Be Read");
		}
		
	}    
}