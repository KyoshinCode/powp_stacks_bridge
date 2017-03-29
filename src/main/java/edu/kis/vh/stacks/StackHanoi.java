package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.StackList;

public class StackHanoi extends Stack {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public StackHanoi(StackList stackList) {
        super(stackList);
    }

    public StackHanoi() {
    }

    @Override
    public void push(int in) {
        if (!isEmpty() && in > top())
            totalRejected++;
        else

            super.push(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
