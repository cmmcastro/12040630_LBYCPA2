package GroupActivity;

import static org.junit.jupiter.api.Assertions.*;

class StackListTest {
    private int DEFAULT_SIZE = 10;

    @org.junit.jupiter.api.Test
    void push() {
        StackList<Integer> stack = new StackList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            stack.push(i);
        }
        assertEquals(9, (int) stack.top()); // Corrected the order of arguments in assertEquals
    }

    @org.junit.jupiter.api.Test
    void pop() {
        StackList<Integer> stack = new StackList<>(); // Corrected the generic type
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            stack.push(i);
        }
        for (int j = 9; j >= 0; j--) {
            assertEquals(j, (int) stack.top()); // Corrected the generic type
            stack.pop();
        }
    }

    @org.junit.jupiter.api.Test
    void top() {
        StackList<Integer> stack = new StackList<>();
        assertThrows(StackEmptyException.class, stack::top);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        StackList<Integer> stack = new StackList<>();
        assertTrue(stack.isEmpty()); // Use assertTrue for boolean conditions
    }

    @org.junit.jupiter.api.Test
    void size() {
        StackList<Integer> stack = new StackList<>();
        int i = 0;
        while (i < DEFAULT_SIZE) {
            stack.push(i);
            i++;
            assertEquals(i, stack.size());
        }
    }
}
