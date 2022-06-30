import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Nim{
  public static void main (String[] args){
    int stone = 12;
    int stoneTaken = 0;
    int stoneRemain = stone - stoneTaken;
    
    while (stoneRemain > 0){
      Scanner input = new Scanner(System.in);
      System.out.print("Choose the number of stones you want to pick, from 1 to 3: ");
      int player = input.nextInt();
      stoneTaken = player + stoneTaken ;
      stoneRemain = stone - stoneTaken;
      System.out.println("Player took " + player + " stones");
      System.out.println("Stone remaining: " + stoneRemain);
      if (stoneRemain ==0){
        System.out.println("Player wins");
        break;
      }
      Random random = new Random();
      int machine = random.nextInt(3) + 1;
      System.out.println("Machine took " + machine + " stones");
      stoneTaken = stoneTaken + machine;
      stoneRemain = stone - stoneTaken;
      System.out.println("Stone remaining: " + stoneRemain);
      if (stoneRemain ==0){
        System.out.println("Machine wins");
        break;
      }
    }
    System.out.println("The game has ended.");
  }
}