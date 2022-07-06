/*
 * Game of Nim by Room 9
 * Jing Xue
 * collaborators: Sarani, Thea, Marisa, Ed
 */

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Nim{
  public static void main (String[] args){
    int stone = 12;
    int stoneTaken = 0;
    int stoneRemain = stone - stoneTaken;
    int player;            // player pick
    int machine;           // machine pick
    int maxPick = 3;       // 

    System.out.println("There are total number of " + stone + " stones.");
    while (stoneRemain > 0){       
      //player's turn
      Scanner input = new Scanner(System.in);   
      System.out.print("Choose the number of stones you want to pick (from 1 to " +
      maxPick + "): ");
      player = input.nextInt();
      input.nextLine();          //down to the end of the line
      stoneTaken = player + stoneTaken ;
      stoneRemain = stone - stoneTaken;
      System.out.println("Player took " + player + " stones");
      System.out.println("Stone remaining: " + stoneRemain);
      if (stoneRemain <=0){        //check win
        System.out.println("Player wins");
        break;      //force out loop
      } 

      //machine's turn
      if (stoneRemain <= maxPick) {     //avoid negative stoneRemain
        machine = stoneRemain;            
      } else {
          Random random = new Random();      
          machine = random.nextInt(maxPick) + 1;
        }
      
      stoneTaken = stoneTaken + machine;
      stoneRemain = stone - stoneTaken;
      System.out.println("Machine took " + machine + " stones");
      System.out.println("Stone remaining: " + stoneRemain);
      if (stoneRemain <=0){    //check win
        System.out.println("Machine wins");
        break;      
      }
    
    }
    System.out.println("The game has ended.");
  }
}