/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */

/*

word = odd
3 = d
2 = d + d
1 = dd + o

okay
kay + o
ay + k + o
y + a + k + o
yako

*/

  
  public static String reverseR( String s )
  {
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */

    int len = s.length();

    if (len <= 1)
      return s;
    else
      return reverseR(s.substring(1)) + s.charAt(0);
  
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}