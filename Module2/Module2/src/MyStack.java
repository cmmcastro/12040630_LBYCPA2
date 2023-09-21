// Starter Class: MyStack.java 
public class MyStack implements StackInterface { 
    private static char arr[] = new char[50]; // max is 50 characters
    private static int top;

    @Override
    public void push(Object j) throws StackFullException {
        //TODO: write your implementation
        if (isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + j);
        arr[++top] = (char) j;
    }
    @Override
    public void pop() throws StackEmptyException {
        //TODO: write your implementation
        if (isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        System.out.println("Removing " + arr[top]);
        top--;
    }
    @Override
    public Object top() throws StackEmptyException {
        //TODO: write your implementation
        return arr[top];
    }
    @Override public boolean isEmpty() {
        //TODO: write your implementation
        return false;
    }
    @Override public boolean isFull() {
        //TODO: write your implementation
        return false;
    }
    @Override
    public int size() {
        //TODO: write your implementation 
        return top;
    }

    public static void displayStack(){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        String infix = "A+B*C";
        MyStack arr = new MyStack();
        arr.push(infix.charAt(0));
        System.out.println("Top of stack: " + arr.top());
        arr.push(infix.charAt(1));
        System.out.println("Top of stack: " + arr.top());
        arr.push(infix.charAt(2));
        System.out.println("Top of stack: " + arr.top());
        arr.pop();
        System.out.println("Top of stack: " + arr.top());
        System.out.println("Stack size: " + arr.size());
        displayStack();
    }
}
