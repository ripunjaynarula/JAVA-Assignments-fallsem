import primespackage.Primes;
import java.util.*;

public class TwinPrimes{
 
    public static void main(){
     
        Primes obj=new Primes();
        for(int i=2;i<11;i++){
         
            if (obj.checkForPrime(i) && obj.checkForPrime(i+2)){
             
                System.out.println(i+" and "+(i+2)+" are twin primes. ");
                
            }
            
        }
        
    }
    
}