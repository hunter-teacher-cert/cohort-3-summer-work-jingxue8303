import java.util.Random;
import java.util.Arrays;

public class Craps{
  
  
  public static int roll (int max){
    Random random = new Random();
    int number = random.nextInt(max)+1;
    return number;
  }


  public static int shoot(int num1, int num2){
    int diceOne= roll(num1);
    int diceTwo= roll(num1);
    int finalRoll=diceOne + diceTwo;
    return finalRoll;
    
  }


  public static boolean round(){
    boolean isWin = false;
    int t = shoot (6,12);
    System.out.println("Shooter rolls: " + t);
    if (t == 7 || t==11){
      isWin = true;
      
    } else {
        if (t!=2 && t!=3 && t!=12){
          System.out.println("Point and reroll");
          int v = reRoll();
          while (v!=7) {
            if (v==t) {
              isWin = true;
              break;
            }
            v = reRoll();
          }
        }    
      }
    return isWin;
  }

  public static int reRoll(){
    int v = shoot(6,12);
    System.out.println(v);  
    return v;
    
  }

  
  
  
  
  public static void main(String[] args){
    int max = Integer.parseInt(args[0]);
    int numWin = 0;
    int numLose = 0;
    System.out.println(max + " rounds will be played");
    for (int i = 1; i<max+1; i++){
      System.out.println ("Round "+ i + ":");
      if (round()){
        System.out.println("Shooter wins.");
        System.out.println();
        numWin ++;
      } else{
          System.out.println("Shooter loses.");
          System.out.println();
          numLose ++;
        }
    }
    System.out.print("Wins: " + numWin+ " and ");
    System.out.println("Loses: " + numLose + ".");
    
      
      
        
   
    

    
  }
}