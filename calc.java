package pack1;

public interface inter1{

public float add(float a, float b);
public float sub(float a, float b);

}

package pack2;

public interface inter2{

public float mul(float a, float b);
public float div(float a, float b);

}


import pack1.inter1;
import pack2.inter2;
import java.util.*;
public class calc implements inter1,inter2{
	
	public float add(float a, float b){
		
		return (a+b);
		
	}
	public float sub(float a, float b){
		
		return (a-b);
		
	}
	
	public float mul(float a, float b){
		
		return (a*b);
		
	}
	public float div(float a, float b){
		
		if(b!=0){
			return (a/b);
		}
		else{
			System.out.println("Denominator cannot be 0");
		}
		
	}
	public static void main(String args[])throws IOException{
		
	Scanner sc= new Scanner(System.in);
	float a=sc.nextFloat();
	float b= sc.nextFloat();
	
	System.out.println(add(a,b));
	System.out.println(sub(a,b));
	System.out.println(mul(a,b));
	System.out.println(div(a,b));
		
		
	}
}

