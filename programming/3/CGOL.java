import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * First Last
 * collaborators: First Last, First Last
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class CGOL
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char[rows][cols];
    for (int x = 0; x < rows; x++) {
      for (int y = 0; y < cols; y++){
        board[x][y] = '+';  
      } 
    } // for int x
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    int rows = board.length;
    int cols = board[0].length;  
    for(int x = 0; x < rows; x++){     
      for(int y = 0; y < cols; y++){    
        System.out.print(board[x][y] + " ");
      }
      System.out.println(); 
    }
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int rows, cols, count;
    rows = board.length;
    cols = board[0].length;
    count = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
          if ((i <= r + 1 && i >= r - 1) && 
              (j <= c + 1 && j >= c -1) && 
              (i != r || j != c)) {
                if (board[i][j] == 'X') {
                  count ++;
                }
          }
      }
    }
    
    return count;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    char currentCell, nextCell;
    int count;
    
    currentCell = board[r][c];
    nextCell = board[r][c];
    count = countNeighbours(board,r,c);

    // ALIVE
    if (currentCell == 'X') {
      //count < 2 or > 3, die
      if (count < 2 || count > 3) {
        nextCell = '+';
      }
      //count is 2 or 3, stay
      else {
        nextCell = 'X';
      }
    }
    // DEAD
    else {
      // count is 3, alive
      if (count == 3) {
        nextCell = 'X';
      }
      // count < 3, stay
      else {
        nextCell = '+';
      }
    }

    return nextCell;
  }


  // //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    // get rows and cols from the given board
    int rows = board.length;
    int cols = board[0].length;
    
    //assemble the board using the parts already created 
    char[][] newBoard = new char [rows][cols];

    //traverse
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        //set the cell to be the next gen's cell
        setCell(newBoard, i, j, getNextGenCell(board, i, j));
      }
    }
    // get the next gen cell

    return newBoard;
  }


  public static void main( String[] args )
  {
    
    char[][] board;
    board = createNewBoard(25,25);

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    System.out.println("\nTesting Count Neighbors");
    int c11 = countNeighbours(board, 1, 1 );  // should return 3
    int c01 = countNeighbours(board, 0, 1 );  // should return 2
    int c02 = countNeighbours(board, 0, 2 );  // should return 1
    int c55 = countNeighbours(board, 5, 5 );  // should return 0
    System.out.println("(1,1) returns " + c11);
    System.out.println("(0,1) returns " + c01);
    System.out.println("(0,2) returns " + c02);
    System.out.println("(5,5) returns " + c55);

    System.out.println("\nTesting getNextGenCell");
    char cell11 = getNextGenCell(board, 1, 1);   // should return X alive
    System.out.println("(1,1) will turn " + cell11);
    char cell01 = getNextGenCell(board, 0, 1);  //  should stay alive
    System.out.println("(0,1) will turn " + cell01);
    char cell02 = getNextGenCell(board, 0, 2);   // should stay dead
    System.out.println("(0,2) will turn " + cell02);
    char cell55 = getNextGenCell(board, 5, 5);  //  should stay dead
    System.out.println("(5,5) will turn " + cell55);

    System.out.println("\nTesting generateNextBoard");
    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

  }//end main()

}//end class