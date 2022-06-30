//Exercise 2   Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
//Here is the formula. Be careful not to use integer division!

//F = C × 	9/5 + 32 

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the degree in Celsius");
        celsius = in.nextDouble();

        fahrenheit = ((celsius * 9)/5) + 32;
        System.out.println("The degree in Fahrenheit is " + fahrenheit);

        //System.out.printf(celsius + "C = %.1f", fahrenheit);
    }
}