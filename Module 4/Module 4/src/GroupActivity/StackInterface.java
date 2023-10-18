package GroupActivity;

public interface StackInterface<E> {
    public void push(E j);
    public void pop() throws StackEmptyException;
    public E top() throws StackEmptyException;
    public boolean isEmpty();
    public int size();
}
