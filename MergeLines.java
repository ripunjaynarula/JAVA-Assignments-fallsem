import java.io.*;
public class MergeLines
{
	public static void main(String args[])
	{               
		try
		{
			BufferedReader br1=new BufferedReader(new FileReader("D:/VTOP/java-19bce0470/file1.txt"));
			BufferedReader br2=new BufferedReader(new FileReader("D:/VTOP/java-19bce0470/file2.txt"));	
			BufferedWriter bw=new BufferedWriter(new FileWriter("D:/VTOP/java-19bce0470/file3.txt"));
			String s=null;
				while((s=br1.readLine()) != null)
			{	
				bw.write(s);
			}
				while((s=br2.readLine()) != null)
			{	
				bw.write(s);
			}
			br1.close();
			br2.close();
			bw.close();
			System.out.println("Success");
		}
		catch(Exception e){
        System.err.println("Error: Target File Cannot Be Read");
		}
		
	}    
}