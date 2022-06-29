/*
Exercise 1   The goal of this exercise is to practice encapsulation with some of the examples in this chapter.
1. Starting with the code in Section 8.6, write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.
2. Starting with the code in Section 8.10, write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.
*/
public class Array {
    // Exercise 1 Q 1
    public static double[] powArray(double a[]) {
        double[] newA = new double[a.length];
        for (int i = 0; i < a.length; i ++) {
            newA[i] = Math.pow(a[i], 2);
        }
        return newA;
    }


    // Exercise 1 Q 2
    public static int[] histogram(int[] scores) {
        int[] newHist = new int[100];
        for (int i = 0; i < scores.length; i++) {
            newHist[scores[i]]++;
        }
        return newHist;
        
    }

    public static void main(String[] args) {
        double[] a = {1,2,3,4};
        

        double[] b = powArray(a);
        for (int i = 0; i < b.length; i++){
            
            System.out.println(b[i]);
        }

        int[] c = {1,2,3,4,5,6};
        
        int[] hist = histogram(c);
        for (int i = 0; i < hist.length; i++){
            System.out.println(hist[i]);
        }
        
    }
}