public class Seive {
  public static boolean sieve (int n){    
    int numFactor = 0;
    int [] a = new int[n];
    for (int i=0; i<n; i++){
      a[i] = i+1;
      if (n % a[i] ==0){
        numFactor ++;
      }
    }  
    if (numFactor > 2){
      System.out.println("False, "+ n + " is not a prime number.");
      return false;
    } else {
      System.out.println("True, "+ n + " is a prime number");
      return true;
      }  
      
      
  }  
    
  
  
  
  
  
  public static void main(String[]arugs){
    sieve(2);
  }
}