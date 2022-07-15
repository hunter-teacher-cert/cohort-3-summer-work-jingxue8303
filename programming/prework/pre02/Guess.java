import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Guess{
  public static void main(String [] args){
    int answer;
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;    
    System.out.println("I'm thinking of an integer between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    System.out.print("Type a number: ");
    answer =in.nextInt();
    System.out.println("You guess is: " + answer);
    System.out.println("The number I was thinking of is: " + number);

    //compute and display the absolute value of the difference between the user's guess and number generated
    int difference;
    difference = answer - number;
        System.out.println("You were off by: " + Math.abs(difference));

    
    
  }

}