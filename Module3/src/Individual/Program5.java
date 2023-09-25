package Individual;

public class Program5 {
    static int MAX = 6;
    int[] q = new int[MAX];
    int head = 0; //index of front
    int tail = 0; //index of first free slot
    public int size() {
        return ((tail - head + MAX) % MAX);
    }

    public void push(int item) {
        if (size() == MAX - 1){
            System.out.println("Queue Overflow");
        } 
        q[tail] = item; tail = (tail+1) % MAX;
    }

    public void pop() {
        head = (head+1) % MAX;
    }

    public boolean isEmpty(){
        return (head == tail);
    }

    public int front(){
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        }
    return q[head%MAX];
    }

    public int back() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        }
        return q[(tail - 1 + MAX)%MAX];
    }

    public static void main(String[] args) {
        Program5 t = new Program5();
        t.push(10);
        t.push(20);
        t.push(30);
        t.push(40);
        t.push(50);
        //t.push(60);
        //Overflow t.pop();
        t.pop();
        t.pop();
        t.push(33);
        System.out.println("Tail = " + t.tail);
        while(!t.isEmpty()) {
            System.out.println(t.front());
            System.out.println("Size = " + t.size());
            t.pop();
        }
    }
}
