import java.util.Scanner;
import java.util.Stack;

public class Item1 {

    public static void main(String[] args) {
        int decimal, value, quotient, remainder, counter = 0;

        Stack<Integer> binaryStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: "); // User inputs a decimal number
        decimal = scanner.nextInt();
        scanner.close();
        value = decimal;

        do {
            quotient = value/2;
            remainder = value % 2;
            value = quotient;
            binaryStack.push(remainder); // Pushes a binary digit (remainder) to the array
            counter++;
        } while (value != 0); // Continues to do this loop until the value is 0

        System.out.print("Binary Conversion: ");

        while (counter != 0){ // Displays the binary conversion of the decimal number input
            binaryStack.peek(); // Displays the top of the stack
            System.out.print(binaryStack.pop()); // Removes the digit on the top of the stack
            counter--;
        }
    }
}
