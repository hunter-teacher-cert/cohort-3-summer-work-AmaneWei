import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Amanda Lee
 * collaborators: Aasine, Alana, Sam
 */

/**
   INSTRUCTIONS:

   Place this file in a folder named programming/3/.

   This file contains the following completed method. Use it as a model
   to help you with the other methods:

   - buildBoard

   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):

   Basic level (complete all):
   - printBoard *
   - copyBoard *

   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *

   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString

   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.

   Ex: buildBoard(3,4,'x') will return this 2D array:

   xxxx
   xxxx
   xxxx
   xxxx

   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters

     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    /* YOUR AWESOME CODE HERE */
      for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[i].length; j++) {
              System.out.print(board[i][j]);
          }
        System.out.println();
      }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row

     Returns:
     Nothing

     Change the 2D array board so that all the elements in the
     specified row are set to value.

     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx

     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    /* YOUR AWESOME CODE HERE */

      int col = board[0].length;
      
      for (int i = 0; i < col; i++) {
          board[row][i] = value;
      }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    /* YOUR AWESOME CODE HERE */
      int row = original.length;
      int col = original[0].length;

      char[][] copy = new char[row][col];

      for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
              copy[i][j] = original[i][j];
          }
      }
      return copy;
    
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board

     Returns:
     nothing

     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.

     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo

     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col

     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ

     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ

     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    /* YOUR AWESOME CODE HERE */
      char x = 'X';
      
      // board[row][col-1] 
      // board[row][col+1] 
      
      // board[row-1][col-1] 
      // board[row-1][col] 
      // board[row-1][col+1] 
      
      // board[row+1][col-1] 
      // board[row+1][col] 
      // board[row+1][col+1] 

      for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[i].length; j++) {
              if ((i <= row + 1 && i >= row - 1) && 
                  (j <= col + 1 && j >= col -1) && 
                  (i != row || j != col)) {
                  board[i][j] = x;
              }
          }
      }
          
  }

   /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).

     Example:

     Given the array

     qqzqq
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz

     ...
     explodeAllchar(board,'z')
     will change board to

     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz

  */
  public static void explodeAllChar(char[][] board, char c)
  {
    /* YOUR AWESOME CODE HERE */
      for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[i].length; j++) {
            if (board[i][j] == c) {
                // System.out.println("It matches!");
                explodeSquare(board, i, j);
            }
          }
      }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.

     This will insert the parameter word into board in the downward
     direction. See examples below

     Example:

     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx

     downString(board,1,1,"Hello") will change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx

     Given the above array, downString(board,4,3,"World") will
     change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx

     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
      int len = word.length();
    /* YOUR AWESOME CODE HERE */
      for (int i = 0; i < len; i++) {
          board[row + i][col] = word.charAt(i);
      }
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */

    System.out.println("Below is the board for b");
    printBoard(b);

    System.out.println("\nSet Row 2 to Os");
    setRow(b, 2, 'O');
    printBoard(b);

    System.out.println("\nCopy of b board");
    char[][] copyB = copyBoard(b);
    printBoard(copyB);

    System.out.println("\nExplode at (3,5)");
    explodeSquare(copyB, 3, 5);
    printBoard(copyB);

    char[][] board = buildBoard(5,5,'O');
    board[1][1] = 'Z';
    board[3][4] = 'Z';
    System.out.println("\nBelow is the board for explode char");
    printBoard(board);

    System.out.println("\nExplode char Z");
    explodeAllChar(board, 'Z');
    printBoard(board);

    System.out.println("\ndownString cat");
    downString(board, 1,1, "cat");
    printBoard(board);
  }
}