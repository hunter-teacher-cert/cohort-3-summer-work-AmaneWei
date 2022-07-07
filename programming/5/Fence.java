/**
 * Recursion Practice with Strings by Team SweatEquity
 * First Last
 * collaborators: Adam, Richard
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

  /*
  1 = |
  2 = | +  --|
  3 = |--| + --|
  4 = |--|--| + --|
  */
  
  public static String fenceR( int n )
  {
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */

    String fence;
    
    if (n == 0) {
      fence = "";
    } 
    else if (n == 1) {
      fence = "|";
    }
    else {
      fence = fenceR(n-1) + "--|";
    }

    return fence;
  }


  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  }
}