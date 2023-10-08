// Java program to add elements
// to a LinkedList

package Individual;

import java.util.*;

public class Program1 {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("LBY"); // adds element to linked list
        ll.add("CP2A"); // adds element to link list
        ll.add(1, "DLSU"); // adds element to index 1 of linked list; increments initial element's index
        System.out.println(ll); // outputs the linked list elements
    }
}