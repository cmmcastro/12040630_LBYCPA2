import java.util.Scanner;
import java.util.Stack;

public class Item2 {
    public static String reverse(String string){
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

    public static String infixToPostfix(String infix, Stack<Character> postfixStack, Stack<Character> stack){
        String postfix = "";

        for (int i = 0; i < infix.length(); i++){
            if (infix.charAt(i) == '(' || infix.charAt(i) == ')'){
                if (infix.charAt(i) == ')'){
                    while (stack.lastElement() == '('){
                        stack.pop();
                    }
                    postfixStack.push(stack.peek());
                }
            }
            else{

            }
        }

        return postfix;
    }

    public static String infixToPrefix(String infix, Stack<Character> prefixStack, Stack<Character> stack){
        String prefix = "";
        return prefix;
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>(), postfixStack = new Stack<>(), prefixStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an infix expression: ");
        String infix = scanner.next();
        scanner.close();

        String postfix = infixToPostfix(infix, postfixStack, stack);
        String prefix = infixToPrefix(infix, prefixStack, stack);
    }
}