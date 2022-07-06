/**
 * ArrayPractice by Team BossCoders
 * Jing Xue
 * collaborators: Moo Joon, Ed, Joel
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds
   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;
import java.util.Random;


public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step ){
    int[] data = new int[size];

    // loop through each element of the array and
    for(int i=0; i<data.length; i++){
      
      // assign the appropriate value to each one.
      data[i] = startValue + i*step;       
    }
    
    
  return data;

  }
    
  public static int[] buildRandomArray(int size, int maxValue ){
    Random random = new Random();
    int[] data = new int[size];
    for (int i=0; i< size; i++){
      int number = random.nextInt(maxValue);
      data[i] = number;
    }
  

    return data;
  }


  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
     Another Note: yes, we know William live coded this a few minutes ago.
  */
  public static void printArray( int[] data ){
    for (int i=0; i <data.length; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence(int[] data, int value ){
    int targetIndex = data.length;
    for (int i=0; i< data.length; i++){
      if (data[i] == value){
        targetIndex = i;
      
      }
    }
    return targetIndex;
  }


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data ){
    int sum = 0;
    for (int i = 0; i <data.length; i++){
      sum = sum + data[i];
    }
      

    return sum; // replace this
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not
  */
  public static boolean isSorted( int[] data ){
    for (int i=0; i < data.length-1; i++){
      if (data[i] > data[i+1]){
        return false;
      }
      
    }

    return true; // replace this

  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int max = data[0];  // will hold the maximum value;
    for (int i =0; i< data.length; i++){
      if (data [i] > max){
        max = data[i];
      }
    }
    return max;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count=0;
    for (int i=0; i< data.length; i++) {
      if (data [i] % 2 != 0) {
       count ++; 
      }
    }
    /* YOUR BRILLIANT CODE HERE */

    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data ){
    //loop through half of the array
    for(int i=0; i<data.length/2; i++){

      //store the first element
      int temp = data[i];

      //move the last element to the first spot
      data[i] = data[data.length -1 -i];

      //move the first element to the last spot
      data [data.length -1 -i] = temp;
    }
  }
      

  public static void main( String[] args ){
    int[] data = buildRandomArray(5, 10);
    int[] data2 = buildIncreasingArray(10,5,2);
    System.out.println("data array: ");
    printArray(data);
    System.out.println("data2 array: ");
    printArray(data2);

    int fo = firstOccurence(data,7);
    System.out.println("First occurrence of 7 is at " + fo);

    int mv =  findMaxValue(data);
    System.out.println("Max value is " + mv);

    int sum = arraySum(data);
    System.out.println("Array sum is " + sum);

    boolean sort = isSorted(data);
    boolean sort2 = isSorted(data2);
    System.out.println( "sorted data?" +  sort );
    System.out.println( "sorted data2?" +  sort2);

    int co = countOdds(data);
    System.out.println("The number of odds in data: " + co);

    flip(data);
    System.out.println("The flipped array:");
    printArray(data);
    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    // int[] data = buildRandomArray(10, 20);
    // int[] data2 = buildIncreasingArray(10,5,3);
    // printArray(data);
    // printArray(data2);

    // add calls to show that the methods you write work.
  }
}