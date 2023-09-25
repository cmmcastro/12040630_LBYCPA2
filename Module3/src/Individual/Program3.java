package Individual;

import java.util.Scanner;

public class Program3 {
    int SIZE = 5; // determines the size of the array
    int[] q = new int[SIZE]; // initialize integer array q
    int front = 0; // initialize front to 0
    int rear = 0; // initialize rear to 0
    static Scanner scanner;
    void enqueue(){
        int no;
        if (rear == SIZE && front == 0) { // if rear equals the size of the array and front equals 0, the queue is full
        System.out.println("Queue is full");
        } 
        else{ // otherwise, prompt user to enter a number and insert into the queue at index rear
            System.out.println("Enter the number: ");
            no = scanner.nextInt();
            q[rear] = no;
        }
        rear++; // increment rear by 1
    }

    void dequeue() {
        int no;
        if (front == rear){ // if front equals rear, the queue is empty
            System.out.println("Queue is empty");
        }
        else{ // otherwise, increment front by 1 and make the new front of the queue to be q[front]
            no = q[front]; front++;
            System.out.println(no + " -removed from queue"); // "removes" the integer from the queue; still in the array, but will not be reached
        }
    }

    void display() {
        int i, temp = front;
        if (front == rear){ // if front equals rear, the queue is empty
            System.out.println("The queue is empty");
        }
        else{ // otherwise, displays the elements in the queue
            System.out.println("Elements in the queue: ");
            for (i = temp; i < rear; i++){
                System.out.println(q[i]);
            }
        }
    }

    public static void main(String[] args) {

        // create a new queue queueClass
        Program3 queueClass = new Program3();
        scanner = new Scanner(System.in);
        while(true) { // while the user does not input 4 to exit the program, the loop will repeat
            System.out.println("[1] Add element\n" + "[2] Remove Element\n" + "[3] Display List\n" + "[4] Program Exit");
            System.out.println("Enter your choice: "); // prompts user to choose a function
            int ch = scanner.nextInt();
            switch (ch) {
                case 1: {
                    queueClass.enqueue(); break; // if the user inputs 1, it will prompt the user to enter a number to enqueue into queueClass
                }
                case 2: {
                    queueClass.dequeue(); break; // if the user inputs 2, it will remove the integer at the front of queueClass, unless the queue is empty
                }
                case 3: {
                    queueClass.display(); break; // if the user inputs 3, all elements inside queueClass will be displayed, unless the queue is empty
                }
                case 4: {
                    System.exit(0); // exits the loop and program
                } 
                default: {
                    System.out.println("Invalid choice"); // displays only if user inputs a number other than 1 to 4
                }
            }
        }
    }
}
