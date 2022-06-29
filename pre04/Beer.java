/*
99 bottles of beer on the wall,
99 bottles of beer,
ya' take one down, ya' pass it around,
98 bottles of beer on the wall.

No bottles of beer on the wall,
no bottles of beer,
ya' can't take one down, ya' can't pass it around,
'cause there are no more bottles of beer on the wall!
*/

public class Beer {
    
    public static void printBeer(int numBottles) {
        if (numBottles > 0) {
            if (numBottles == 1) {
                System.out.println(numBottles+" bottle of beer on the wall,\n" + numBottles + " bottle of beer,");
                System.out.println("ya' take one down, ya' pass it around, no more bottles of beer on the wall.");
                numBottles --;
            }
            else if (numBottles >= 2) {
                System.out.println(numBottles + " bottles of beer on the wall,\n" + numBottles + " bottles of beer,") ;
                numBottles --;
                System.out.println("ya' take one down, ya' pass it around, " + numBottles + " bottles of beer on the wall");
            }
            
        }
        else {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,\n'cause there are no more bottles of beer on the wall!");
        }
        
        
    }//printBeer

    public static void displayBeerSong(int numBottles) {
        if (numBottles >= 0) {
            printBeer(numBottles);
            System.out.println();
            displayBeerSong(numBottles-1);
        }
    }//display

    public static void main(String[] args) {
        displayBeerSong(99);
    }
    
}