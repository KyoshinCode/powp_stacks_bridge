package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.StackList;

/**
 * Class implementing functionality of stack
 */
public class Stack implements IStack {

    /* Dzieki zastosowaniu interfejsu kod jest latwiejszy do ewentualnych modyfikacji
       Funkcjonalnosc pozostaje bez zmian, a kod jest "czytelniejszy"
     */

    private StackList stackList;

    public Stack(StackList stackList) {
        this.stackList = stackList;
    }

    public Stack(){
        this.stackList = new StackList();
    }

    @Override
    public void push(int i) {
        stackList.push(i);
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return stackList.isFull();
    }

    @Override
    public int top() {
        return stackList.top();
    }

    @Override
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
