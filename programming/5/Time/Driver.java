import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	    //declare a var of appropriate type to assign an instance of Time to
	    Time t;

	    //assign var the address of a newly-apportioned Time object
	    t = new Time();

      System.out.print("t1 is ");
      System.out.println(t);

      Time t2 = new Time(9,44,10);
      System.out.println("\nBefore change");
      System.out.println(t2);

      //set(int hrs, int mins, int secs)

      t2.set(10,18,10);
      System.out.println("\nAfter change");
      System.out.print("t2 is ");
      System.out.println(t2);

      Time t3 = new Time(1,5,40);
      System.out.print("t3 is ");
      System.out.println(t3);

      //public void add(Time other){
      System.out.println("\nAdding t2 and t3");
      t2.add(t3);
      System.out.print("New time is ");
      System.out.println(t2);

      
    }//end main()

}//end class