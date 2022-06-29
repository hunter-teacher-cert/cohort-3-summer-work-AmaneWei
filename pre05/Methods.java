public class Methods {
    
    // Exercise 2  
    // Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        }
        return false;
    }

    // Exercise 3
    // Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c && b + c > a && c + a > b);
    }

    // Exercise 8  
    // Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.

    // Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).

    public static int ack(int m, int n) {
        if (m == 0) { // n+1	if  m = 0 
            return n + 1;
        }
        else if (n == 0) { // A(m−1, 1)	if  m > 0  and  n = 0 
            return ack(m - 1, 1);
        }
        else { // A(m−1, A(m, n−1))	if  m > 0  and  n > 0
            return ack(m - 1, ack(m, n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(ack(2,1));
    }
}


