import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node front = new Node(value, head);
    head = front;
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node worker = head;
    int counter = 0;
    
    while (worker != null) {
      if (counter == index) {
        return worker.getData();
      }
      else {
        counter++;
        worker = worker.getNext();
        // System.out.println(counter);
      }
    }
    return "";
  }

  /* DEMO get
  public String get(int index) {
    int counter = 0;
    Node walker = head;
    
    while (counter != index) {
      walker = walker.getNext();
      counter++;
      if (walker == null)
        return "";
    }
    return walker.getData;
  }

  */

  /**
  Return a string representation of the list
  */
  public String toString(){
    Node worker = head;
    String nodeStr = "";

    while (worker != null) {
      nodeStr += worker;
      worker = worker.getNext();
    }
    
    return nodeStr;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    Node worker = head;
    int counter = 0;
    
    while (worker != null) {
      counter++;
      worker = worker.getNext();
    }
  
    return counter;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){
    Node worker = head;
    Node n = new Node(value);
    int counter = 0;

    while (worker != null) {
      if (index == 0) {
        n.setNext(head);
        head = n;
        break;
      }
      else if (counter == index - 1) {
        n.setNext(worker.getNext());
        worker.setNext(n);
        break;
      }
      
      counter++;
      worker = worker.getNext();
    }
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    int index = 0;
    Node worker = head;
    
    while (worker != null) {
      if (worker.getData() == value) 
        return index;
      index++;
      worker = worker.getNext();
    } 
    return index;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    int len = size();
    // System.out.println(len);
    String[] newArray = new String[len];
    Node worker = head;

    for (int i = 0; i < len; i++) {
      newArray[i] = worker.getData();
      worker = worker.getNext();
    }
    
    return newArray;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
    int counter = 0;
    int len = size();
    Node worker = head;
    Node target;

    while (worker != null) {
      if (index == 0) {
        head = worker.getNext();
        break;
      }
      else if (counter == index-1) {
        target = worker.getNext();
        worker.setNext(target.getNext());
        break;
      }
      else if (index < 0 || index > len-1) {
        System.out.println("Invalid index!");
      }

      counter ++;
      worker = worker.getNext();
    }
  }
}