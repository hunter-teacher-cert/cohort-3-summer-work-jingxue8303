import java.io.*;
import java.util.*;
/*It is not going to work by only using the enhanced for loop  because it doesn't refer to the index in search operations.*/ 
public class Max{
  

  public static int indexOfMax(int[] a){
    int max = 0;
    int index = 0;
    for (int i=0; i<a.length; i++){
      if (a[i] > max){
        max = a[i];
        index = i;
      }  
    }
    System.out.println(index);
    return index;
    
  }


  
  
  
  public static void main(String[]arugs){
    int[] num = {33,24,16,12};
    indexOfMax(num);
  }
  
}