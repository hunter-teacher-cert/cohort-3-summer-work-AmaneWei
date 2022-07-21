import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
    
    public SortSearch(int size){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	    return this.data.get(index);
    }

    //return size of ArrayList
    public int getSize() {
      return data.size();
    }
    
  

    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
    	int smallIndex = start;

      for (int i = start; i < data.size(); i++) {
        if (data.get(i) < data.get(smallIndex)) {
          smallIndex = i;
        }
      }
    	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
      For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	 
       

    */

    // basically a selection sort
    public void sort(){
      // int smallestNum = 0;
      // int smallestIndex = 0;

      
      // for (int i = 0; i < data.size(); i++){
          
      //   smallestNum = data.get(i);
      //   smallestIndex = i;
        
      //   for (int j = i+1; j < data.size(); j++){
      //     if (smallestNum > data.get(i)){
      //       smallestNum = data.get(i);
      //       smallestIndex = i;
      //     }
      //   }
    
      //   if (smallestIndex == i) 
      //     ;
      //   else {
      //     int temp = data.get(i);
      //     data.set(i, data.get(smallestIndex));
      //     data.set(smallestIndex, temp);
      //   }
      // }

      int len = data.size();

      for (int i = 0; i < len - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < len; j++) 
          if (data.get(j) < data.get(minIndex))
            minIndex = j;

        int temp = data.get(minIndex);
        data.set(minIndex, data.get(i));
        data.set(i, temp);
      }

    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
      for(int i = 0; i < data.size(); i++)
      {
        if (data.get(i) == value)
        {
          return i;
        }
        
      } // ends the for loop
	
	
	    return -1; // return if not found
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){
      // create assign variables  representing the high, low and middle indices 
      int low = 0;
      int high = data.size() - 1;
      int middle = (low + high) / 2;
  	// while we're not done:
  	//   if the item is at data.get(middle), return middle
      while (low <= high){
        if (data.get(middle) == value){
          return middle;
        }
        //   otherwise, update high, low, and middle
        else if (value > data.get(middle)){
          low = middle + 1;
          middle = (low + high) / 2;
          // high is unchanged
        } else {
          high = middle - 1;
          middle = (low + high) / 2;
          // low is unchanged
        }
      }
	    return -1;

	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
      int middle = (lowIndex + highIndex) / 2;
      if (lowIndex > highIndex ){
        return -1;
      } else {
        if (data.get(middle) == value){
          return middle;
        } else if (value > data.get(middle)){
          return binarySearchRecursive(value, middle + 1, highIndex);
        } else {
          return binarySearchRecursive(value, lowIndex, middle - 1);
        }
      }
	    
    }
    
	
    public String toString(){
	    return ""+data;
    };


    public void builtinSort(){
	    Collections.sort(data);
	
    }
    

    
}
