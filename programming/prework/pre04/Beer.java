public class Beer{
  
  public static void main(String[] args){
  countdown(4);  
  secondLastVerse();
  lastVerse(); 
  } 
  
  public static void lineA (String a) {
    System.out.println(" bottles of beer on the wall" + a);
  }

  public static void lineB () {
    System.out.println(" bottles of beer,");
  }

  public static void lineC () {
    System.out.println("ya' take one down, ya' pass it around,");
  }

  public static void secondLastVerse (){
    System.out.println("1 bottle of beer on the wall,");
    System.out.println("1 bottle of beer,");
    lineC();
    System.out.println("no bottles of beer on the wall.");
    System.out.println();
  }

  public static void lastVerse () {
    System.out.println("No bottles of beer on the wall, ");
    System.out.println("no bottles of beer,");
    System.out.println("ya' can't take one down, ya' can't pass it around,");
    System.out.println("'cause there are no more bottles of beer on the wall!");
  }

  public static void countdown(int n){
   if(n == 2) {
            System.out.print(n);
            lineA(",");
            System.out.print(n);
            lineB();            
            lineC();
            //avoid the mistake of "1 bottles"
            System.out.println(n-1 + " bottle of beer on the wall.");
            System.out.println();
            
    } else {
            System.out.print(n);
            lineA(",");
            System.out.print(n);
            lineB();
            lineC();            
            System.out.print(n-1);
            lineA(".");
            System.out.println();
            countdown (n-1);
            }

  
          
  }      
}
  
            




  
  
    
     
    
    
    
    






