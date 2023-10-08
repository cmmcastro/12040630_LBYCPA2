// Importing required classes

package Individual;

import java.util.*;

public class Program3 {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A"); // [A]
        ll.add("B"); // [A, B]
        ll.addLast("C"); // [A, B, C]
        ll.addFirst("D"); // [D, A, B, C]
        ll.add(2, "E"); // [D, A, E, B, C]
        System.out.println(ll);
        ll.remove("B"); // [D, A, E, C]
        ll.remove(3); // [D, A, C]
        ll.removeFirst(); // [A, C]
        ll.removeLast(); // [A]
        System.out.println(ll);
    }
}