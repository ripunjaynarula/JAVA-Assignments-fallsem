import java.io.*;
public class FileCharacterCount
{
	public static void main(String args[])
	{               
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("D:/VTOP/java-19bce0470/LowerCase.txt")); 
			String s=null;
			int count=0;
				while((s=br.readLine()) != null)
			{	
				count+=s.length();
			}
			System.out.println("Character Count of File is: "+count);
		}
		catch(Exception e){
        System.err.println("Error: Target File Cannot Be Read");
		}
		
	}    
}