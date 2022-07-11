import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
    
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();

    System.out.println("Testing empty print:");
    System.out.println(sa);
    
    System.out.println("\nTesting isEmpty (should be true)");
    System.out.println(sa.isEmpty());
    
    

    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    System.out.println("\nTesting add(value)");
    sa.add(5);
    System.out.println("Added 5 \n"+ sa);
    sa.add(8);
    System.out.println("\nAdded 8 \n"+ sa);
    sa.add(3);
    System.out.println("\nAdded 3 \n"+ sa);
    sa.add(4);
    System.out.println("\nAdded 4 \n"+ sa);

    System.out.println("\nTesting get(index)");
    System.out.println("Index 0: " + sa.get(0));
    System.out.println("Index 6: " + sa.get(6)); // 6 within size, but empty
    System.out.println("Index 10: " + sa.get(10)); // out of bounds

    System.out.println("\nTesting remove(index)");
    sa.remove(6); // should not be able to remove
    sa.remove(1);
    System.out.println("Removed index 1\n"+ sa);

    System.out.println("\nTesting add(index, value)");
    sa.add(2, 9);
    System.out.println("Added 9 at index 2 \n"+ sa);
    sa.add(1, 1);
    System.out.println("Added 1 at index 1 \n"+ sa);

    // System.out.println("\nTesting grow");
    // sa.grow();

    // sa.add(15, 1);
    // System.out.println(sa);
    // -----------------------------------------------------------

    //precondition: newly-instantiated SuperArray of default capacity
    
    System.out.println("\nTesting overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    
    System.out.println(sa.isEmpty());
    
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    System.out.println(sa);
    
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);

    
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);

    sa.remove(5);
    System.out.println(sa);

    sa.remove(15);
    System.out.println(sa);
  
  }//main  

}//class SuperArrayDriver