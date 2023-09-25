package Individual;

import java.util.LinkedList;
import java.util.Queue;

public class Program1 {
    public static void main(String[] args) { 
        // create an integer queue intq
        System.out.println("INTEGER QUEUE");
        Queue<Integer> intq = new LinkedList<>();

        // checks if intq is empty (TRUE)
        System.out.println("isEmpty() = " + intq.isEmpty());

        // inserts elements in intq (42,100,49,201)
        intq.offer(42);
        intq.offer(100);
        intq.offer(49);
        intq.offer(201);

        // checks if intq is empty (FALSE)
        System.out.println("isEmpty() = " + intq.isEmpty());

        // peeks the front of the queue in intq (42)
        System.out.println("peek() = " + intq.peek());

        // displays the size of the queue in intq (4)
        System.out.println("size() = " + intq.size());

        // displays and removes elements in intq while intq is not empty, starting with the front of the queue
        while (!intq.isEmpty()) {
            System.out.println("poll() = " + intq.poll()); // remove 42, then 100, then 49, then 201
        }

        // checks if intq is empty (TRUE)
        System.out.println("isEmpty() = " + intq.isEmpty());

        // create a new string queue charq
        System.out.println("STRING QUEUE");
        Queue<String> charq = new LinkedList<>();

        // checks if charq is empty (TRUE)
        System.out.println("isEmpty() = " + charq.isEmpty());

        // inputs elements in charq (cat, dog, ape, mouse, horse)
        charq.offer("cat");
        charq.offer("dog");
        charq.offer("ape");
        charq.offer("mouse");
        charq.offer("horse");

        // checks if charq is empty (FALSE)
        System.out.println("isEmpty() = " + charq.isEmpty());

        // peeks the front of the queue in charq (cat)
        System.out.println("peek() = " + charq.peek());

        // displays the size of the queue in charq (5)
        System.out.println("size() = " + charq.size());

        // displays and removes elements in charq while charq is not empty, starting with the front of the queue
        while (!charq.isEmpty()) {
            System.out.println("poll() = " + charq.poll()); // remove cat, dog, ape, mouse, horse
        }

        // checks if charq is empty (TRUE)
        System.out.println("isEmpty() = " + charq.isEmpty()); 
    }
}