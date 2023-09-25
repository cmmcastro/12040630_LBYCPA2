package Individual;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create integer deque
        Deque<Integer> deque = new ArrayDeque<>();
        int myint;

        // prompts user to input non-zero integers and to input 0 to end the loop
        System.out.println("Please enter non-zero integers (enter 0 to end)");
        while(true) {
            myint = scanner.nextInt(); // break out of loop if myint equals 0
            if (myint == 0) {
                break; 
            }
            deque.offerLast(myint); // otherwise, insert to the last index of deque
        }

        // displays and removes the first index of deque while deque is not empty
        System.out.println("My deque contains: ");
        while(!deque.isEmpty()) {
            System.out.println(" " + deque.peekFirst());
            deque.pollFirst();
        }

        // prompts user to input non-zero integers and to input 0 to end the loop
        System.out.println("Please enter non-zero integers (enter 0 to end)");
        while(true) {
            myint = scanner.nextInt();
            if (myint == 0) { // break out of loop if myint equals 0
                break;
            }
            deque.offerFirst(myint); // otherwise, insert to the first index of deque
        }

        // displays and removes the first index of deque while deque is not empty
        System.out.println("My deque contains: ");
        while(!deque.isEmpty()){
            System.out.println(" " + deque.peekFirst());
            deque.pollFirst();
        }
        scanner.close();
    }
}