package edu.kis.vh.stacks;

/**
 * Created by RFran on 30.03.2017.
 */
public interface IStack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
