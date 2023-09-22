import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Item2 {
    public static String reverse(String string){
        /*
         HOW THE FUNCTION WORKS: (e.g. A + (B * C))
            1. The function checks the last character of the string first, which will be appended to reversedString
            2. If the character read is an open parenthesis '(', a close parenthesis ')' will be appended, and vice versa
            3. If the character read is an operand, it will directly be appended to reverseString
            4. This process will continue until the last character of the string has been appended
            5. reversedString will be returned
         */

        char ch;
        String reversedString = "";
        for (int i = 0; i < string.length(); i++){
 
            // Variable to make code neater
            int index = string.length()-1-i;
 
            // Checks parenthesis for reversing expression for prefix
            if (string.charAt(index) == '('){
                ch = ')';
            }
            else if (string.charAt(index) == ')'){
                ch = '(';
            }
            else{
                ch = (string.charAt(index));
            }
 
            reversedString += ch;
        }
        return reversedString;
    }

    public static String convertStackToString(Stack<Character> stack){
        String string = "", reverseString = "";
        while (!stack.isEmpty()){ // converts stack to string; in reverse though because it's a stack
            reverseString += stack.peek();
            stack.pop();
        }
        string = reverse(reverseString); // reverses the string so it's in the correct order
        return string;
    }

    public static String infixToPostfix(String infix, Stack<Character> postfixStack, Stack<Character> stack, List<Character> operator){
        /* 
        HOW THE FUNCTION WORKS: (e.g. Infix: ((A + B * (C/A))) - (B/C)))
            1. If the function detects an open parenthesis "(" or an operator (^,*,/,+,-), the element will continue to be pushed to stack until an operand (A) is detected 
            2. The operand is pushed to postfixStack and repeat Step 1 and Step 2 until a close parenthesis ")" is detected
            3. If the element at the top of the stack is an operator, the operator is popped from stack and pushed to postfixStack; if the element at the top of the stack is an open parenthesis after the operator is popped, it is popped from stack until another operator is detected
            4. Repeat until the infix expression is converted into postfix expression
            5. Return the postfix expression as a string
        */

        for (int i = 0; i < infix.length(); i++){ // checks each character in infix
            if (infix.charAt(i) == '(' || operator.contains(infix.charAt(i))){ // checks if infix character is open parenthesis or operator
                stack.push(infix.charAt(i)); // pushes infix character to stack
            }
            else{
                if (infix.charAt(i) == ')'){
                    while (!operator.contains(stack.peek())){ // while top of stack is not an operator, pop the element
                        stack.pop();
                    }
                    postfixStack.push(stack.peek()); // if character not a closing parenthesis, push to postfixStack
                    //System.out.println(postfixStack.peek());
                    stack.pop(); // pop the element from stack
                }
                else{
                    postfixStack.push(infix.charAt(i)); // if character is neither a parenthesis or operator, push to postfixStack
                    //System.out.println(postfixStack.peek());
                }
            }
        }

        // fix for converting infix to prefix
        while (!stack.empty()){
            if (operator.contains(stack.peek())){ // top of stack is operator
                postfixStack.push(stack.peek());
                //System.out.println(postfixStack.peek());
                stack.pop();
            }
            else if (stack.peek() == '('){ // top of stack is parenthesis
                stack.pop();
            }
            else{ // top of stack is operand
                postfixStack.push(stack.peek());
            }
        }

        String postfix = convertStackToString(postfixStack);
        return postfix;
    }

    public static String infixToPrefix(String infix, Stack<Character> prefixStack, Stack<Character> stack, List<Character> operator){ // fix code; something wrong not sure yet
        /*
        HOW THE FUNCTION WORKS:
            1. Reverse the infix expression and convert the reversed infix expression to postfix expression
            2. Reverse the postfix expression, which results to the prefix expression
         */
        
        String prefix = "", reverseInfix = reverse(infix), reversePrefix = infixToPostfix(reverseInfix, prefixStack, stack, operator);
        prefix = reverse(reversePrefix);
        return prefix;
    }

    public static void main(String[] args) {
        // Infix: ((A+(B*(C/A)))-(B/C))
        Stack<Character> stack = new Stack<>(), postfixStack = new Stack<>(), prefixStack = new Stack<>(); // initialize stacks
        char[] symbols = new char[]{'^','*','/','+','-'}; // initialize operators
        List<Character> operator = new ArrayList<>();
        for (int i = 0; i < symbols.length; i++){
            operator.add(i,symbols[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an infix expression: "); // user inputs an infix expression
        String infix = scanner.next();
        scanner.close();

        String postfix = infixToPostfix(infix, postfixStack, stack, operator);
        String prefix = infixToPrefix(infix, prefixStack, stack, operator);

        /* System.out.print("Postfix: " + postfix + "\nPrefix: " + prefix); */
        System.out.print("Postfix: " + postfix);
        System.out.print("\nPrefix: " + prefix);
    }
}