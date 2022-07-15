import java.io.*;
import java.util.*;

public class Methods {
  public static boolean isDivisible(int n, int m){
    return n % m ==0;
    }

  
  public static boolean isTriangle(int a, int b, int c){
    if (a+b>c && b+c>a && a+c>b){
      return true;
    } else {
      return false;
    }
  }

  public static int ack(int m, int n){
    int result = 0;
    if (m==0){
      result=n+1;
    } else {
        if(n==0){
          result= ack (m-1,1);
        } else {
            result = ack(m-1, ack(m, n-1));
          }
    }
    
        
    return result;
  }   
  
  
  public static void main(String[]arugs){
    System.out.println(ack (3,3));
  }
  
}  
