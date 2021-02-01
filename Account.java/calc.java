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
			return 0;
		}
		
	}
	public static void main(){
	 
	calc obj=new calc();
	System.out.println("Enter the 2 numbers:");
	Scanner sc= new Scanner(System.in);
	float a=sc.nextFloat();
	float b= sc.nextFloat();
	
	System.out.println(obj.add(a,b));
	System.out.println(obj.sub(a,b));
	System.out.println(obj.mul(a,b));
	System.out.println(obj.div(a,b));
		
		
	}
}

