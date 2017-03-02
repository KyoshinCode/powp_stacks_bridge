package edu.kis.vh.stacks;

public class Stack {

    public int total = -1;
    public static final int NEGATIVE = -1;
    public static final int POSITIVE = 11;
    private int[] ITEMS = new int[12];

    public void push(int i) {
        if (!isFull())
            ITEMS[++total] = i;
    }

    public boolean isEmpty() {
        return total == NEGATIVE;
    }

    public boolean isFull() {
        return total == POSITIVE;
    }

    public int top() {
        if (isEmpty())
            return NEGATIVE;
        return ITEMS[total];
    }

    public int pop() {
        if (isEmpty())
            return NEGATIVE;
        return ITEMS[total--];
    }

}
