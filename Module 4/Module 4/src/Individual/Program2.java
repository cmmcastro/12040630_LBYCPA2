// Java program to change elements
// in a LinkedList

package Individual;

import java.util.*;

public class Program2 {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("LBY");
        ll.add("2A");
        ll.add(1, "Geeks");
        System.out.println("Initial LinkedList " + ll);
        ll.set(1, "CP"); // replaces element in index 1 in linked list with a new element
        System.out.println("Updated LinkedList " + ll); // outputs updated linked list after replacing the element
    }
}
