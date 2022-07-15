import java.io.*;
import java.util.*;

public class pairProgramming{
  public static void barGraphify(int[] nums){
    for (int i =0; i< nums.length; i++){
      System.out.print(i + ": ");
        for(int j =1; j<=nums[i]; j++){
          System.out.print("=");
      }
        System.out.println();
  }
    System.out.println();
}


  

  public static void main (String[] args){
    int [] data = {1,2,3,4,5};
    int [] data2 = {3,0,3,5,8,2,2,2};
    barGraphify (data);
    barGraphify (data2);
  }
}