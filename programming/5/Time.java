import java.io.*;
import java.util.*;


/**
 * Time class by Room 10
* Jing Xue
 * collaborators: Jihae, Alise, Elizabeth, Shana
 */

/**
   INSTRUCTIONS:
   This file contains the starter code for our Time class.
   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.
   Place this file in a folder named programming/5/Time.java
   Basic level (complete all):
   - public Time(int hrs, int mins, int secs) - constructor
   - public void toString()
   - public void set(int hrs, int mins, int secs)
   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)
   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    private int hours;
    private int minutes;
    private int seconds;

    // Constructors
    public Time(){
	    this.hours = 0;
	    this.minutes = 0;
	    this.seconds = 0;
	
    }

    /**
       Parameters:
       - hrs, mins, secs - the time you want to create the class as
       Initialize this instance to represent hrs:mins:secs as the time.
       
     */
    public Time(int hrs, int mins, int secs){
      this.hours= hrs;
      this.minutes = mins;
      this.seconds = secs;
	
	
    }
    
    
    // Methods

    /**
       returns a string representation of the time
    */
    public String toString(){
	     
      String time = ( hours + " : " + minutes + " : " + seconds);
      //System.out.println (time);
      return time;
    }


    

    /**
       Parameters:
       - hrs,mins,secs - ints representing a time
       modifies this instance to represent the time hrs:mins:secs
    */
    public void set(int hrs, int mins, int secs){
	    this.hours = hrs;
      this.minutes = mins;
      this.seconds = secs;
    // add the code to add the time represented by other
	  // to this instance.

    }

    

    /**
       Parameters:
       - other - a variable of type Time
       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
	    this.hours = this.hours + other. hours;
      this.minutes = this.minutes +other. minutes;
      this.seconds = this.seconds + other.seconds; 
        // add the code to add the time represented by other
	  // to this instance.

    }


    /**
       Parameters:
       other - a variable of type Time
       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other){
	    if(this.hours == other.hours && 
         this.minutes == other.minutes &&
         this.seconds == other.seconds){
        return true;
         } else return false; 
    }

    /**
       Parameters:
       other - a variable of type Time
       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)
       A negative number if this instance represents a time less
       than the time of other (this < other)
       0 if the two instances represent the same time.
    */
    public int compareTo(Time other){
	    int secondSum1 = this.hours * 3600 + this.minutes * 60 + this.seconds; 
      int secondSum2 = other.hours * 3600 + other.minutes * 60 + other.seconds;
      int diff = secondSum1 - secondSum2;
      if (diff == 0) {
        return 0; 
      } else {
          if (diff >0){
            return 1;
          } else {
              return -1;
            }
        }

	     
    }
    

    
}//end class