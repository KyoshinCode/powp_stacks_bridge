package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.StackList;

public class StackFIFO extends Stack {

    private IStack temp = new Stack();

    public StackFIFO(StackList stackList) {
        super(stackList);
    }

    public StackFIFO() {
    }

    @Override
    public int pop() {
        while (!isEmpty())

            temp.push(super.pop());

        int ret = temp.pop();

        while (!temp.isEmpty())

            push(temp.pop());

        return ret;

    }
}
