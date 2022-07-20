import java.io.*;
import java.util.*;

public class SortSearchDriver {
  public static void main(String[] args) {


	// Uncomment these to test part 1
	
	  SortSearch ss = new SortSearch(20);
	  System.out.println(ss);
	  //ss.swap(0,19); //checking swap method;
		//System.out.println(ss); //checking swap method
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);  // begin at the start of list
	System.out.println("Starting at 0: ss["+ i +"] = "+ss.get(i)+" : " + ss);

  i = ss.findSmallestIndex(3);  // begin at indicated index
	System.out.println("Starting at 3: ss["+ i + "] = "+ss.get(i)+" : " + ss);

  i = ss.findSmallestIndex(10);  // begin at indicated index
	System.out.println("Starting at 10: ss["+ i + "] = "+ss.get(i)+" : " + ss);
  
	// three different test to determine accuracy - works
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();
	System.out.println(ss);
  
  System.out.println(ss.linearSearch(7)); //testing linear search

  System.out.println("------------------bin1 test------------------");
  System.out.println(ss);
  System.out.println(ss.binarySearch(0));
  System.out.println(ss.binarySearch(15));
  System.out.println(ss.binarySearch(21));
    // using 3 test cases to check for out of bounds values
  System.out.println("------------------bin2 test------------------");
  System.out.println(ss);
  System.out.println(ss.binarySearchRecursive(0,5,10));
  System.out.println(ss.binarySearchRecursive(7,1,18));
  System.out.println(ss.binarySearchRecursive(19,10,15));
  
  }
}