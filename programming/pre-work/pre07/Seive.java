public class Seive {
//     Exercise 5   The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
// Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

    public static boolean[] sieve(int n){
        boolean[] isPrime = new boolean[n];

        for (int i = 0; i < n; i ++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i < n; i ++) {
            if (isPrime[i] == true) {
                for (int j = i*i; j < n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        System.out.println("The prime numbers from 0 to 50 are:");

        boolean[] prime = sieve(50);

        for (int i = 2; i < 50; i++) {
            if (prime[i] == true) {
                System.out.println(i + " ");
            }
        }
    }
    
}