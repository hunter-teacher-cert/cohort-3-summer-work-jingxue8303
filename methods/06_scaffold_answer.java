import java.io.*;
import java.util.*;

public class brickwallAnswer {
  public static void main(String[] args){     // Here is an example of a wall that is 3 bricks across and 6 bricks tall.   
    System.out.println("[_____] [_____] [_____]");
    System.out.println("[_] [_____] [_____] [_]") ;
    System.out.println("[_____] [_____] [_____]");
    System.out.println("[_] [_____] [_____] [_]") ;
    System.out.println("[_____] [_____] [_____]");
    System.out.println("[_] [_____] [_____] [_]") ;
    
// Goal: make a method that takes 2 integer inputs (bricks wide and bricks tall) and draws a similar character image. 
//Advanced: takes a 3rd input for how wide each brick is.  

      //Create 1 full brick.  
    
    System.out.println(fullRow(5)); //full row with given # bricks wide
    System.out.println(otherRow(5));
    System.out.println();
    System.out.println(wall(5,4));
  }  
      //Create a method to draw a row of full bricks  ,
    public static String fullRow(int bricksWide){
    String fullbrick = "[_____] ";
    //String halfbrick = "[_]";
       String row = "";
          for(int i = 0; i < bricksWide; i++){
            row = row + fullbrick;
            }
      return row;
    }
  

       
      //System.out.println(fullRow(5));
      //Create a row of bricks that starts with a partial (half-brick)
    public static String otherRow(int bricksWide){
    String fullbrick = "[_____] ";
    String halfbrick = "[_] ";
       String row = halfbrick;
          for(int i = 1; i < bricksWide; i++){
            row = row + fullbrick;
            }
      return row + halfbrick;
    }
      //Create a method that alternately stack the two types of row 
  public static String wall(int rowsTall, int brickwidth){
    String output = "";
    
    for(int i = 0; i<rowsTall; i++){
      if (i%2==0){
        output = output + otherRow(brickwidth) +"\n";
      } else {
          output = output + fullRow(brickwidth) + "\n";
        }
      
    }
    return output;
    
  } 
      
      


}// brickwallAnswer