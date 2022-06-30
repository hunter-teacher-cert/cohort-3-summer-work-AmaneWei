/**
* Game of Nim by Amanda Lee

GOAL:

Be the player to remove the last stone.

RULES:

bag contains 12 stones initially
a move consists of removing 1-3 stones from the bag
YOUR CODING MISSION:

Write a program that will allow a human at console to play against your "AI" a game of NIM.

prompt user for number of stones they wish to remove each turn
tell user how many stones the AI removed and how many stones remain
facilitate play until human or AI wins, and announce winner 

*/

import java.io.*;
import java.util.*;

public class Nim {
    

    public int getAIMove(int numStones) {
        int stonesAI = (int)(Math.random()*3)+1;
        if (numStones == 3) stonesAI = 3;
        else if (numStones == 2) stonesAI = 2;
        else if (numStones == 1) stonesAI = 1;
        return stonesAI;
    } //getAIMove
    
    public void playGame() {

        int stones = 12;
        int stonesTaken;
        
        Scanner in = new Scanner(System.in);

        System.out.println(
            "This is the Game of Nim!\n\nThere are 12 stones in the bag and it's your goal to be the player to remove the last stone!\n\n" +
            "You can only remove 1-3 stones from the bag. The computer can also do the same.\n\n" +
            "GOOD LUCK!"
        );


        // loop until games ends
        while (stones > 0) {
            // prompt user input (user turn)
            System.out.print("Enter the number of stones to take: ");
            stonesTaken = in.nextInt();
            while (stonesTaken != 1 && stonesTaken != 2 && stonesTaken != 3) {
                System.out.print("Please pick a number from 1-3: ");
                stonesTaken = in.nextInt();
            }
            
            // calculate number of stones remaining, print
            stones -= stonesTaken;
            if (stones > 1) {
                System.out.println("\nThere are " + stones + " stones left.");
            }
            else {
                System.out.println("\nThere is " + stones + " stone left.");
            }
            // check for win
            if (stones <= 0) {
                System.out.println("\n\n~~You Win! :)~~");
                break;
            }
            
            // ai turn
            stonesTaken = getAIMove(stones);
            System.out.println("\nThe AI took " + stonesTaken + " stones.");
            
            // calculate number of stones remaining, print
            stones -= stonesTaken;
            // if (stones < 0) stones = 0;
            if (stones > 1) {
                System.out.println("\nThere are " + stones + " stones left.");
            }
            else {
                System.out.println("\nThere is " + stones + " stone left.");
            }

            if (stones <= 0) {
                System.out.println("AI Wins!");
            }
        }
    } //playGame
    
    public static void main(String[] args) {

        Nim g = new Nim();
        
        
        // int a = g.getAIMove(5);
        // System.out.println(a);

        g.playGame();

        
    } //main

        
}