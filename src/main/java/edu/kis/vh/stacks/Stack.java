package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.StackArray;
import edu.kis.vh.stacks.methods.StackList;

/**
 * Class implementing functionality of stack
 */
public class Stack implements IStack {

    /* Dzieki zastosowaniu interfejsu kod jest latwiejszy do ewentualnych modyfikacji
       Funkcjonalnosc pozostaje bez zmian, a kod jest "czytelniejszy"
     */

    private IStack stack;

    public Stack(StackList stack) {
        this.stack = stack;
    }

    public Stack(StackArray stack){
        this.stack = stack;
    }

    public Stack(){
        this.stack = new StackList();
    }

    public void push(int i) {
        stack.push(i);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int top() {
        return stack.top();
    }

    public int pop() {
        return stack.pop();
    }

}

/*
InteliJ IDEA
Refactor->Rename
Navigate->Declaration Ctrl + B
Navigate->Implementation Ctrl + Alt + B
*/

/*
Uzycie open declaration wraz z kliknieciem myszka na metodzie przenosi w miejsce jej deklaracji
QuickType daje nam bardzo dobry wglad na deklaracje w danym pliku
 */