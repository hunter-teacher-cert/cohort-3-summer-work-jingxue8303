import java.io.*;
import java.util.*;
import java.util.Arrays.*;


public class Array {
  public static double[] powArray(double []a, int power){
  double []b = new double[a.length];
    for (int i =0; i< a.length; i++){
      b[i]= Math.pow(a[i], power);
    }
    System.out.println(Arrays.toString(b));
    return b;
  }  

  public static int[] histogram (int []scores, int numCounters){
    int[] counts = new int[numCounters];
    for (int score : scores) {
      counts[score]++;
    }
    System.out.println(Arrays.toString(counts));
    return counts;
  }
  


  
  public static void main(String[]arugs){
    int[] s = {4, 4, 3};
    histogram(s,5);
    
  }



  


}