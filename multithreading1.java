import java.util.*;

import java.awt.*;
 
class One implements Runnable

{

    One()

    {

        new Thread(this,"one").start();

        

    }

    

    public void run()

    {

        for(int i=0;i<6;i++)

        {

            try

            {

                Thread.sleep(1000);

                

            }

            catch(InterruptedException e)

            {

                System.out.println("Hello");

                                

            }
	System.out.println("Hello");
            

        }

    }

}  

    class Two implements Runnable

    {

        Two(){

        new Thread(this,"two").start();
		

    }

    public void run()
	
    {

        for(int i=0;i<6;i++)

        {

            try

            {

                Thread.sleep(3000);

                

            }

            catch(InterruptedException e)

            {

                System.out.println("Welcome to VIT");

                                

            }
			System.out.println("Welcome to VIT");
            

        }

    }

	} 

    public class multithreading1

    {    

        public static void main(String args[])

        {

            One o1 = new One();

            Two t1 = new Two();

        }

    }


 