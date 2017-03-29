package edu.kis.vh.stacks;

/**
 * Created by RFran on 30.03.2017.
 */
public interface IStack {
    int EMPTY_STACK_INDICATOR = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
    /*
    Wyciagniecie stalych do interfejsu kazda zmiana w jednym miejscu dotyczy wszystkich klas implementujacych interfejs
     */
}
