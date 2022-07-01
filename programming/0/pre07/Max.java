public class Max {
    // Exercise 4   
    // Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?

    public static int indexOfMax(int[] a) {
        int max = a[0];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] a = {1,2,4,3};
        
        int max = indexOfMax(a);
        System.out.println("The max number is " + a[max] + " at index #" + max);
        // System.out.println(max);
    }
    
}