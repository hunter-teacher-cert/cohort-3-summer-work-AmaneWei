/*
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
    */

import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        // System.out.println(number);

        Scanner in = new Scanner(System.in);
        int guess;

        System.out.println("I'm thinking of a number between 1 and 100!\nCan you guess what it is?\nType a number");

        
        guess = in.nextInt();
        System.out.println("Your guess is: " + guess);

        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + Math.abs(number - guess));
        
        
    }
}