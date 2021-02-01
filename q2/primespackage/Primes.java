package primespackage;


public  class Primes{
    
    public boolean checkForPrime(int n){
    
    int c=0,i;
    
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        c++;
    }
    return (c==1);
    }
    
}
