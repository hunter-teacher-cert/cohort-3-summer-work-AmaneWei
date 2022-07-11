/**
 * SuperArray by Team MarvelvsDC
 * Amanda Lee
 * collaborators: Christine, Marisa
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */
    numberElements = 0;
    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */
    data = new int[size];
    
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
    data = new int[10];
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
    numberElements = 0;
    
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value ) // DONE
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */
    if (numberElements == data.length) {
      grow();
    }
    
    // add item
    /* YOUR SIMPLE+SMART CODE HERE */
    data[numberElements] = value;

    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */
    numberElements ++;
    // System.out.println(numberElements);
  }//end add()


  public boolean isEmpty() // DONE
  {
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
    return numberElements == 0;
    // if (numberElements == 0)
    //   return true;
    // else
    //   return false;
  }


  public int get(int index) // DONE
  {
    //return item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    if (index > numberElements) {
      System.out.println("Index does not exist");
      return 0;
    }    
    else {
      return data[index];
    }
  }


  public String toString() // DONE
  {
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
    String output = "[";
    
    for (int i = 0; i < data.length; i++) {
      if (data[i] == 0)
        output += "-";
      else
        output += data[i];
      
      if (i != data.length-1)
        output += "  ";
      
    }
    
    output += "]";
    return output;
    
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index) // DONE
  {
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    if (index >= numberElements || index < 0)
      System.out.println("Cannot find element to remove at index "+ index);
    else {
      for (int i = index; i < numberElements; i++) { // i = 1, i < 3
        if (i != numberElements-1)
          data[i] = data[i+1];
      }
      data[numberElements-1] = 0;
      numberElements --;
      // System.out.println(numberElements);
    }
    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
   
  }


  public void add(int index, int value) // size[10] --> add(13, A)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */
    int len = data.length;

    if (numberElements == len) {
      grow();
    }

    if (index > len) {
      for (int i = len-1; i <= index; i++) {
        grow();
      }
    }


    // if adding a value at an index higher than numElements
    
    // while (index > data.length) {
    //   grow();
    // }
    // if (numberElements < data.length) {
      // System.out.println("hi");
        // System.out.println("index " + index);
        // System.out.println("num ele " + numberElements)
      
      
      // shift elements toward the end of the array
    
    
    for (int i = numberElements - 1; i >= index; i--) {
        // i = 2, 2 > 1
      data[i+1] = data[i];
    }
      // insert new element
    data[index] = value;
      // increment numElements
    numberElements ++;
    
  } // add


  //private 
  public void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */
    int[] copy = new int[data.length+1];

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */
    for (int i = 0; i < data.length; i++) {
      copy[i] = data[i];
    }

    // System.out.println("GROW");
    // for (int i = 0; i < copy.length; i++) {
    //   System.out.print(copy[i] + " ");
    // }

    // UP TO HERE WORKS, WILL COMPLETE LATER


    
    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
    data = copy;
  }//end grow()

}//end class