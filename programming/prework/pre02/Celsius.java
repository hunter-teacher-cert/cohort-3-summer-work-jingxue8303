import java.util.Scanner;
public class Celsius{
  public static void main(String[] args){
    double fahren;
    double celsi;
    final double RATIO = 9.0/5.0;
    final double ZERO = 32.0;
    Scanner in = new Scanner(System.in);
    System.out.print("What is the temperature in celsius? ");
    celsi = in.nextDouble();  
    fahren = celsi * RATIO + ZERO;
    System.out.printf("%.1f C = %.1f F\n", celsi, fahren);
    //System.out.println(cm + " cm");
    //System.out.printf("Four thirds = %.2f\n", 4.0/3.0);
    //inch = 100;
    //cm = inch * CM_PER_INCH;
    //System.out.printf("%d in = %f cm\n", inch, cm);
    //double quotient = 76 / 12;
    //System.out.println(quotient);
    //int remainder = 76 % 12;
    //System.out.println(remainder);
  
  }
}