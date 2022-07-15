import java.io.*;
import java.util.*;


public class Loops {
  public static double squareRoot(double a){
    double b = a/2;
    double c = (b+a/b)/2 ;
    double d = Math.abs(c-b);
    //System.out.println(b);
    //System.out.println(c);
    //System.out.println(d);
    while (0.0001 < d){
      b=c;
      c=(c+a/c)/2;
      d=Math.abs(c-b);
    }
    System.out.println(c);
    System.out.println(b);
    System.out.println(d);
    System.out.println("The square root of " + a + " is equal to "+ c + ".");
    return c;
  }


  public static double power(double x, int n){
    double result = 1.0;
    for(int i=1; i<=n; i++) {
      result = result * x;
    }
    System.out.println(x + " to the power of " + n + " is equal to " + result);
    return result;

    
  }


  public static int factorial(int n){
    int result = n;
    int initial = n;
    while (n > 2){
      result = result * (n-1);
      n=n-1;
    }
    System.out.println("The factorial of " + initial + " is equal to " + result);
    return result;
  }

public static void main (String[]arugs){
  factorial(4);
  
  }
}  