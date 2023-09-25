// Starter Class: MyStack.java 
import java.util.ArrayList;
import java.util.List;

public class MyStack implements StackInterface { 
    private static char stack[] = new char[50]; // max is 50 characters
    private static int top;

    @Override
    public void push(Object j) throws StackFullException {
        //TODO: write your implementation
        if (isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        //System.out.println("Inserting " + j);
        stack[++top] = (char) j;
    }
    @Override
    public void pop() throws StackEmptyException {
        //TODO: write your implementation
        if (isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        //System.out.println("Removing " + stack[top]);
        top--;
    }
    @Override
    public Character top() throws StackEmptyException {
        //TODO: write your implementation
        return stack[top];
    }
    @Override public boolean isEmpty() {
        //TODO: write your implementation
        if (top >= 1){
            return false;
        }
        else{
            return true;
        }
    }
    @Override public boolean isFull() {
        //TODO: write your implementation
        if (top == 50){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int size() {
        //TODO: write your implementation 
        return top;
    }

    public static void displayStack(){
        for (int i = 1; i <= top; i++){
            System.out.print(stack[i]);
        }
    }

    public static void main(String[] args) {
        char[] operators = new char[]{'∧','∨','↑','↓','→','¬','⇔','⊻'};

        String infix = "A+B*C";
        MyStack arr = new MyStack();
        System.out.println("Top of Stack: " + arr.top() + " | top = " + top); // TOS is null, top = 0
        for (int i = 0; i < infix.length(); i++){ // pushes infix expression into stack
            arr.push(infix.charAt(i));
            System.out.println("Top of Stack: " + arr.top() + " | top = " + top);
        }
        arr.pop(); // pops infix expression out of stack
        System.out.println("Top of Stack: " + arr.top() + " | top = " + top);
        System.out.println("Stack size: " + arr.size() + "\nStack: ");
        displayStack();
    }
}
