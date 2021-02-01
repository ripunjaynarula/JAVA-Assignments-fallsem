import java.io.*;
import java.util.*;
public class ReverseContent
{
	public static void main(String args[])
	{               
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("D:/VTOP/java-19bce0470/java.txt")); 
			String s=null;
			
				while((s=br.readLine()) != null)
			{	
				StringBuilder input= new StringBuilder();
				input.append(s);
				input=input.reverse();
				System.out.println(input);
			}
		}
		catch(Exception e){
        System.err.println("Error: Target File Cannot Be Read");
		}
		
	}    
}