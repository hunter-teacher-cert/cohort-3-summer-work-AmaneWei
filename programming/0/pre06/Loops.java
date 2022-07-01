public class Loops {
    /*
    Exercise 2  
    Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x0, and then improve the guess using this formula:
    
    x1 =(x0 + a/x0) / 2 
    For example, if we want to find the square root of 9, and we start with x0 = 6, then x1 = (6 + 9/6) / 2 = 3.75, which is closer. We can repeat the procedure, using x1 to calculate x2, and so on. In this case, x2 = 3.075 and x3 = 3.00091. So it converges quickly on the correct answer.
    
    Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.
    
    As your initial guess, you should use a/2. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to calculate the absolute value of the difference.
    */

    public static double squareRoot(double a) {
        double roughGuess = a/2;
        double nextGuess = (roughGuess + a / roughGuess) / 2;

        while (nextGuess - roughGuess > 0.00001) {
            roughGuess = nextGuess;
            nextGuess = (roughGuess + a / roughGuess) / 2;
        }

        roughGuess = nextGuess;
        return nextGuess = (roughGuess + a / roughGuess) / 2;

    }

    

    // Exercise 3
    // In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns x^n. Now write an iterative method to perform the same calculation.
    public static int power(double x, int n) {
        int answer = 1;
        for (int i = 0; i < n; i++) {
            answer *= x;
        }
        return answer;
    }

    

    // Exercise 4  
    // Section 6.7 presents a recursive method that computes the factorial function. 
    // Write an iterative version of factorial.

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i ++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("The square root of 9 is: " + squareRoot(9));
        System.out.println("2 to the 4th power is: " + power(2, 4));
        System.out.println("The factorial of 5 is: " + factorial(5));
    }
    
    
}