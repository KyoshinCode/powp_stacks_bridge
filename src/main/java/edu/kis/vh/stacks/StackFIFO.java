package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.StackArray;
import edu.kis.vh.stacks.methods.StackList;

public class StackFIFO extends Stack {
    //uzycie StackList pozwala na latwiejsze usuwanie pierwszego elementu *nie musimy przesuwac elementow
    private IStack temp = new StackList();

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

    public StackFIFO(StackArray stackArray) {
        super(stackArray);
    }
}
