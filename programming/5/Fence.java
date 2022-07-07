/**
 * Recurrsion Practice by Room 10
 * Jing Xue
 * collaborators: Jihae, Alise, Elizabeth, Shana
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n ){
    if ( n ==1) {
      return "|";
    }  else {
        return fenceR(n-1)+ "--|";
        }
    
      
  }


  public static void main( String[] args )
  {

    for( int i = 1; i < 10; i++ ) { //not printing 0 post
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    

  }
}