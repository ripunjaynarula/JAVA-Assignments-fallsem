import java.util.Scanner;
public class Time
{
    Time(int H,int M,int S)
    {
        System.out.println("The time in HH:MM:SS format is: "+H+":"+M+":"+S);
    }
    Time(int S)
    {
        System.out.println(S);
    }
    Time(int M,int H)
    {
        System.out.print("The time in MM:HH:SS format is: "+M+":"+H+":");
    }
    
    public static void main(String[] args)
    {
        int s,m,h;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Hours");
        h=x.nextInt();
        System.out.println("Enter the Minutes");
        m=x.nextInt();
        System.out.println("Enter the Seconds");
        s=x.nextInt();
        Time j= new Time(h,m,s);
        Time y= new Time(m,h);
        Time z= new Time(s);
    }
}