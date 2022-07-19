import java.io.*;
import java.util.*;

public class PP {
  
  public static void barGraphify(int[] num) {
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%d: ", i); 
      for (int j = 0; j < num[i]; j++) {
        System.out.print("=");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int [] data = new int[] {7,2,3};

    barGraphify(data);
  }

  
}