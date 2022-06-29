import java.util.Random;

public class Craps {
    /*
There should be at least three static methods in addition to main. One named roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive. 

A round is played as follows:

The shooter shoots (rolls) the dice.

If he rolls a 2,3, or 12,that’s Craps and he loses.
If he rolls a 7 or 11, that’s a Natural and he wins.
Otherwise:

the value he rolled is now called the Point
the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.

The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.
    */

    // One named roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive.

    public static int roll(int num) {
        int min = 0;
        int max = num;
        int range = max - min + 1;
        int random = (int)(Math.random()*range) + min;

        return random;
    }

    // There should also be one named shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.

    public static int shoot(int numDice, int maxValue) {

        int[] dice = new int[numDice];
        

        for (int i = 0; i < dice.length; i++) {
            dice[i] = roll(maxValue);
            System.out.print(dice[i] + " ");
        }
   
        int sum = 0;
     

        for (int i = 0; i < dice.length; i++) {
            
            sum += dice[i];
            System.out.println("The roll is " + dice[i] + " and the sum is " + sum);
            
        }
        return sum;
        
    }

    // The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

    public static String round() {
        // A round is played as follows:

        // The shooter shoots (rolls) the dice.
        int shoots = shoot(2,6);
        System.out.println(shoots);
        boolean win = shoots == 7 || shoots == 11;
        boolean lose = shoots == 2 || shoots == 3 || shoots == 12;
        
        if (win) {
            return "Natural! You win!";
        }

        else if (lose) {
            return "Craps! You lose!";
        }

        // the value he rolled is now called the Point
        // the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.
        else {
            shoots = shoot(2,6);
            System.out.println(shoots);
            while (!win && !lose) {
                if (!win || !lose) {
                    return "You win after point!";
                }
                else {
                    return "You lose!";
                }
            }
        }
        return "";
    }
    
    public static void main(String[] args) {
        int num = roll(2);
        System.out.println(num);

        System.out.println("=====");
        int num2 = shoot(5,3);

        System.out.println("=====");
        String message = round();
        System.out.println(message);
    }
}