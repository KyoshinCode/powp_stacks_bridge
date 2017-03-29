package edu.kis.vh.stacks.list;

public class StackArray {

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

    /**
     * Push value to the top of the stack
     * @param i - integer value for the stack
     * modifies:items
     */
    public void push(int i) {
        if (!isFull())
            getItems()[++total] = i;
    }

    /**
     * Return boolean indicating if stack is empty
     * @return boolean - true == stack is empty, false if its not
     * modifies:none
     */
    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    /**
     * Returns boolean indicating if stack is full
     * @return boolean - true == stack is full, false if its not
     * modifies:none
     */
    public boolean isFull() {
        return total == FULL_STACK_INDICATOR;
    }

    /**
     * returns last value on stack, stack last unmodified
     * @return last value on the stack (top one)
     * modifies:none
     */
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total];
    }

    /**
     * takes value on the top of the stack, modifies stack
     * @return last value of the stack (top one)
     * modifies:items
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_INDICATOR;
        return getItems()[total--];
    }

}
