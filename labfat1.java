import java.util.*;
import java.io.*;
public class labfat1 {
    
       public static void main(String[] args) {
          
          double A, B, C;   
          double solution;  
          boolean goAgain;  
                            
                            
          TextIO.putln("This program will print a solution of an equation");
          TextIO.putln("of the form A*X*X + B*X + C = 0, where A, B, and");
          TextIO.putln("C are values that you enter.");
          
          do {
             
             

             TextIO.putln();
             TextIO.putln("Enter values for A, B, and C:");
             TextIO.put("A = ");
             A = TextIO.getlnDouble();
             TextIO.put("B = ");
             B = TextIO.getlnDouble();
             TextIO.put("C = ");
             C = TextIO.getlnDouble();
             TextIO.putln();
             
             

             try {
                solution = root(A,B,C);
                TextIO.putln("A solution of the equation is " + solution);  
             }
             catch (IllegalArgumentException e) {
                TextIO.putln("Sorry, I can't find a solution.");
                TextIO.putln(e.getMessage());
             }
             
             

             TextIO.putln();
             TextIO.put("Do you want to solve another equation? ");
             goAgain = TextIO.getlnBoolean();

          } while (goAgain);
       
       } 
      

       static double root(double A, double B, double C) 
                                   throws IllegalArgumentException {
              
           if (A == 0) {
             throw new IllegalArgumentException("A can't be zero.");
           }
           else {
              double disc = B*B - 4*A*C;
              if (disc < 0)
                 throw new IllegalArgumentException("Discriminant < zero.");
              return  (-B + Math.sqrt(disc)) / (2*A);
           }
       } 
    }  