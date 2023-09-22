import java.util.Scanner;
import java.util.Stack;

public class Item1 {

    public static void convertToBinary(Stack<Integer> binaryStack, int decimalValue){
        int quotient, remainder;
        do {
            quotient = decimalValue/2;
            remainder = decimalValue % 2;
            decimalValue = quotient;
            binaryStack.push(remainder); // Pushes a binary digit (remainder) to the array
        } while (decimalValue != 0); // Continues to do this loop until the decimal value is 0
    }

    public static void main(String[] args) {
        Stack<Integer> binaryStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a decimal number: "); // User inputs a decimal number
        int decimalValue = scanner.nextInt();
        scanner.close();

        convertToBinary(binaryStack, decimalValue); // Program converts decimal value to binary value

        System.out.print("Binary Conversion: ");
        while (!binaryStack.empty()){ // Displays the binary conversion of the decimal number input
            binaryStack.peek(); // Displays the top of the stack
            System.out.print(binaryStack.pop()); // Removes the digit on the top of the stack
        }
    }
}
