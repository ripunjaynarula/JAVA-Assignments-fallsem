import java.io.*;
public class collectstats
{
	public static void main(String args[])
	{               
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("D:/VTOP/java-19bce0470/statsfile.txt")); 
			String s=null;
			int count=0;
			int countb=0;
			int countsemi=0;
				while((s=br.readLine()) != null)
			{	
				if (s.trim().isEmpty()) 
				{
					countb++;
				}
				else if(s.endsWith(";"))
				{
					countsemi++;
				}
				else
				{
				}
				count++;
			}
			System.out.println("The Statistics are:");
			System.out.println(" Total Lines: "+count);
			System.out.println("no. of Blank SLines: "+countb);
			System.out.println("no. of Lines Ending with Semicolon: "+countsemi);

		}
		catch(Exception e){
        System.err.println("Error: Target File Cannot Be Read");
		}
		
	}    
}