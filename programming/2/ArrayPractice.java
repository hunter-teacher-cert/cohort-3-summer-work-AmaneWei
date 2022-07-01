/**
 * ArrayPractice by Team BossCoders
 * Amanda Lee
 * collaborators: (Group 7) Adam, SuAnn, Christine 
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:

   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip

   The stubs will have comments describing what they should do

   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue

   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds

   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value

     Returns:
     a new array of integers

     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];
    data[0] = startValue;

    // loop through each element of the array and
    /* YOUR BRILLIANT CODE HERE */
    for (int i = 1; i <= data.length-1; i++) {
        data[i] = data[i-1] + step;
    }
    // assign the appropriate value to each one.
    /* YOUR BRILLIANT CODE HERE */

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use

     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];
    int ran;

    /* YOUR BRILLIANT CODE HERE */
    for (int i = 0; i <= data.length - 1; i++) {
        ran = r.nextInt(maxValue);
        data[i] = ran;
    }

    return data;
  }


  /**
     Parameters:
     data - an array of ints

     Returns:
     nothing

     prints out the array

     Note: data.length stores the length of the array
  */
  public static void printArray( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
    for (int i = 0; i <= data.length-1; i++) {
        System.out.print(data[i] + " ");
    }
      System.out.println();
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for

     Returns:
     the index (location) of the first occurence of value

     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {

    /* YOUR BRILLIANT CODE HERE */
    int index = -1;

    for (int i = 0; i < data.length; i++) {
        if (data[i] == value) {
            index = i;
        }
    }

    return index; // change this (it is just a placeholder to "get past" the compiler)
  }


  /**
     Parameters: data - an array of ints

     Returns: an integer that is equal to the sum of all the elements in the array

     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)

  */
  public static int arraySum( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
    int sum = 0;
    for (int i = 0; i < data.length; i++) {
        sum += data[i];
    }

    return sum; // replace this
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     true if the array is sorted, false otherwise

     That is, if each element is < the element to its right
     then the array is sorted.

     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,13,15 is not

  */
  public static boolean isSorted( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
    for (int i = 0; i < data.length-1; i++) {
        if (data[i] > data[i + 1]) {
            return false;
        }
    }
    return true; // replace this

  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int m;  // will hold the maximum value;
    m = data[0];
      
    /* YOUR BRILLIANT CODE HERE */
    for (int i = 1; i <= data.length - 1; i++) {
        if (data[i] > m) {
            m = data[i];
        }
    }
    return m;
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     the number of odd elements in the array

     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count = 0;

    /* YOUR BRILLIANT CODE HERE */
    for (int i = 0; i <= data.length - 1; i++) {
        if (data[i] % 2 == 1) {
            count++;
        }
    }
    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter

     Postcondition:
     elements of the input array are in reverse order

     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
    int temp;
    for (int i = 0; i <= data.length/2; i++) {
        temp = data[i];
        data[i] = data[data.length - i - 1];
        data[data.length - i - 1] = temp;
    }
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    int[] data = buildRandomArray(10, 20);
    int[] data2 = buildIncreasingArray(10,5,3);

    System.out.println("*Data for buildRandomArray(10,20)");
    printArray(data);
    System.out.println("\n*Data for buildIncreasingArray(10,5,3)");
    printArray(data2);

    // add calls to show that the methods you write work.
    int index = firstOccurence(data2, 20);
    System.out.println("\n*firstOccurence(data2, 20)\nThe first occurance of 20 is " + index);

    int sum = arraySum(data2);
    System.out.println("\n*arraySum(data2)\nThe sum is " + sum);

    boolean sort1 = isSorted(data);
    System.out.println("\n*Is data sorted: " + sort1);
    boolean sort2 = isSorted(data2);
    System.out.println("\n*Is data2 sorted: " + sort2);


    int max1 = findMaxValue(data);
    System.out.println("\n*The max value of data is: " + max1);
    int max2 = findMaxValue(data2);
    System.out.println("\n*The max value of data2 is: " + max2);

    int odd = countOdds(data2);
    System.out.println("\n*There are " + odd + " odd numbers in data2");
    
    flip(data2);
    System.out.println("\n*The flipped order is for data2 is:");
    printArray(data2);
  }
}