package edu.kis.vh.stacks;

public class Stack {

    private int total = EMPTY_STACK_INDICATOR;
    
    private static final int EMPTY_STACK_INDICATOR = -1;
    private static final int FULL_STACK_INDICATOR = 11;

    private int[] items = new int[12]; // wywolano gettery i settery zamiast bezposredniego odniesienia sie do zmiennej

    public int getTotal() {
        return total;
    }

    public int[] getItems() {
        return items;
    }

    public void push(int i) {
        if (!isFull())
            getItems()[++total] = i;
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL_STACK_INDICATOR;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total];
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total--];
    }

}
