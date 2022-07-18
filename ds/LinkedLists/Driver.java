import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    
    System.out.println(l);
    System.out.println(l.size()); //testing for size 0
    l.add("Hello");
    System.out.println(l.size()); //testing for size 1
    l.add("World");
    l.add("Today");
    System.out.println(l);
    System.out.println(l.get(2)); //testing
    System.out.println(l.get(3)); //testing out of bound
    System.out.println(l.size());
  }
}