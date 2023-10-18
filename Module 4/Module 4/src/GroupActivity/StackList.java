package GroupActivity;

public class StackList<E> implements StackInterface<E> {
    private Node<E> head;
    private int size;
    public StackList() {
        this.head = null;
        this.size = 0;
    }
    class Node<E>{
        E data;
        Node<E> next;
        Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    @Override
    public void push(E j){
        Node<E> node = new Node<>(j);
        node.next = head;
        head = node;
        size++;
    }
    @Override
    public void pop() throws StackEmptyException {
        if (head == null) {
            throw new StackEmptyException("Stack is empty");
        }
        head = head.next;
        size--;
    }
    @Override
    public E top() throws StackEmptyException {
        if (head == null) {
            throw new StackEmptyException("Stack is empty");
        }
        return head.data;
    }
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int size() {
        return size;
    }
}