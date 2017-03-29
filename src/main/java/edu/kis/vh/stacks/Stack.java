package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * Class implementing functionality of stack
 */
public class Stack {

    private StackList stackList;

    public Stack(StackList stackList) {
        this.stackList = stackList;
    }

    public Stack(){
        this.stackList = new StackList();
    }

    public void push(int i) {
        stackList.push(i);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public boolean isFull() {
        return stackList.isFull();
    }

    public int top() {
        return stackList.top();
    }

    public int pop() {
        return stackList.pop();
    }


}

/*
InteliJ IDEA
Refactor->Rename
Navigate->Declaration Ctrl + B
Navigate->Implementation Ctrl + Alt + B
*/
