import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println("Created empty LinkedList");
    System.out.println(l);

    l.add("Hello");
    l.add("World");
    l.add("!");

    System.out.println("\nAdded three strings");
    System.out.println(l);

    String s = l.get(1);
    System.out.println("\nTesting .get(1) method");
    System.out.println(s);

    int size = l.size();
    System.out.println("\nTesting .size() method: ");
    System.out.print(size);

    l.add(1, "pizza");
    System.out.println("\nTesting .add(1, \"pizza\") method");
    System.out.println(l);

    l.add(0, "hot dogs");
    System.out.println("\nTesting .add(0, \"hot dogs\") method");
    System.out.println(l);

    int index = l.indexOf("World");
    System.out.print("\nTesting index of world method: ");
    System.out.println(index);
    
    index = l.indexOf("hot dogs");
    System.out.print("\nTesting index of hotdogs method: ");
    System.out.println(index);

    String[] test = l.toArray();
    System.out.println("\nTesting toArray method: ");
    for(int i = 0; i < test.length; i++) {
      System.out.print(test[i] + " ");
    }
    System.out.println();

    l.remove(0);
    System.out.println("\nTesting .remove(0) method");
    System.out.println(l);

    l.remove(2);
    System.out.println("\nTesting .remove(2) method");
    System.out.println(l);
  }
}