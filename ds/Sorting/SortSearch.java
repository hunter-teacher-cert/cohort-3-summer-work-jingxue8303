//Room 14: Will, Wayne, Jing
import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
✔ 1. Analyze the two constructors - try to figure out how they work.
✔ 2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
✔  1. Read the description of findSmallestIndex and complete the method.
✔  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
✔   1. Complete the sort method - read comments for description
✔   2. Uncomment the lines in sortProjectDriver to test.

Search Project:
✔   1. Complete the linear search (BASIC)
✔   2. Complete the binary search (Intermediate)
✔   3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

  /* Sort project starts here */
    
  /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data
    
  private Random r; 

    
  public SortSearch(){
	  data = new ArrayList<Integer>();
	  r = new Random();
    
	  for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	  }
  }
    
  public SortSearch(int size){
	  data = new ArrayList<Integer>();
	  r = new Random();
    
	  for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	  }
  }

  /* Convenience function to get data out of the ArrayList from the driver */
  public int get(int index){
	  return this.data.get(index);
  }

  
  
  public ArrayList <Integer> swap(int a, int b){
    int temp1 = data.get(a);
    int temp2 = data.get(b);
    data.set(a,temp2);
    data.set(b,temp1);
    return data;
  }
    
    
  
  /*
  return the index of the smallest data idem from index start to the end
  of the ArrayList. If there are multiple of the smallest value,
  return any of them.
      
  Example, if the arraylist has:
  5,3,10,6,8
  if start was 2 (start at index 2, value 10) then it would return 3
  which is the index of the value 6 which is the index with the
  smallest value from start to end
  On the other hand, if start was 0, then the method would
  return 1 since the value 3 is in index 1 and that is the smallest.    
  */
  
  public int findSmallestIndex(int start){
	  int smallIndex = start; 
    
	  for (int i= start; i< data.size(); i++){
      if(data.get(i) < data.get(smallIndex)){ // compair the value at i to the value at smallIndex by Will
        smallIndex = i; //update if needed
      }
    }
    
	  return smallIndex;
  }


    /**
    Implement the selection sort algorithm by sorting the ArrayList
    data in place.
    Algorithm:
    Loop a variable that represents the ArrayList index from
    0 to the end of the ArrayList.
    For each index, find the smallest from that Location
	  to the end of the array and swap it with that index. 
    */
    public void sort(){
      for (int i =0; i <data.size()-1;i++){
        int start = i;
        int indexMin = findSmallestIndex(i);
        swap(start, indexMin);
      }
      // start at index of 1, track index and index -1 for compairson

      // FOR each thing in the AL
        // set up current value and index below the current for moving up
        //int temp = data.get(i); // this is the item in the list to be sorted
        //int pos = i -1; // this is lowest spot not yet sorted

        // loop through from moving index to end of data WHILE not sorted in chunk
            // bump higher number up as we bring down the lower number
            // reduce the tracker as we've brought down our smallest

      // insert temp var value at value freed up by moving up the larger number
        
          


    }



    /* Search project starts here */
    
    /**
    performs a linear search. Returns the index of the first occurence of
    value in the ArrayList data or -1 if not found.
    This works by starting at the first element and searching one element at a time 
    until either the element is found or you've looked at all the elements.
    This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
	    int indexNum = -1;
	    for (int i = 0; i <data.size();i++){
        if (data.get(i) == value){
          indexNum = i;
          break;
        }
      }
      return indexNum; 
    }
  // Alternative Method using while loop 
  /* 
    public int linearSearch(int value){
	    int retVal = -1; // init return to base case

      int i = 0;  
      // I'm starting to like while loops more for loops with conditionals
      while((i < data.size()) && (retVal == -1)){
        if(data.get(i) == value){ retVal = i; }
        i++;
      }
      
	    return retVal; // replace this return
    }
  */
    
    /**
    Implement a binary search as specified by the comments
    This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){
	    // create assign variables  representing the high, low and middle indices 
      int low = 0;
      int high = data.size() -1 ;
      int mid = (low + high) /2; // int division means will always be an index

      
	    
      while(true){ // while we're not done:
        
	      //   otherwise, update high, low, and middle
        if(data.get(mid) == value){  //   if the item is at data.get(middle), return middle
          return mid;
        } else if (low >= high){ // out of range, does not exist in the arrayList
          // high & low only equal each other if there is no occurance in the list
          return -1;
        } else if (data.get(mid) < value){ // dig higher because we are low
          // exclude the mid as well because we tested in the first if and to make 
          // sure we check the last case in the arra
          low = mid +1;
        } else { // dig lower because we are too high
          // exclude the mid as well because we tested in the first if and to make 
          // sure we check the last case in the arra
          high = mid -1; 
        }

        mid = (low + high) /2; // update mid to center of the new range
	      
      }
      

    }

    /*public int binarySearchRec(int value){
      return binarySearchRecursive(value, 0, data.size()-1);
    */
  
    /**
    Implement a RECURSIVE binary search as specified by the comments  
    This algorithm only works on sorted ArrayLists.
    */
    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
	    
      if(highIndex >= lowIndex){   // rule out the case of value not found 
        // set our new midpoint fist
        // int mid = lowIndex + (highIndex - lowIndex) /2;
        int mid = (highIndex + lowIndex) /2;  // coequal statements
        
        // return if found
        if(data.get(mid) == value){
          return mid;
        }
        // otherwise figure out which one to do.
        
        // we are too low and need to search high
        if(data.get(mid) < value){
          return binarySearchRecursive(value, mid +1, highIndex);
        }

        
        //otherwise we are too high
        return binarySearchRecursive(value, lowIndex, mid-1);

      }
	    return -1; // exception case, not found
    }
    
	
    public String toString(){
	    return ""+data;
    }


    public void builtinSort(){
	    Collections.sort(data);
    }
    

    
}