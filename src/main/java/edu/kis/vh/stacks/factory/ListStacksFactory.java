package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.methods.StackArray;
import edu.kis.vh.stacks.methods.StackList;

/**
 * Created by RFran on 30.03.2017.
 */

public class ListStacksFactory implements IStacksFactory {

    @Override
    public Stack getStandardStack() {
        return new Stack(new StackList());
    }

    @Override
    public Stack getFalseStack() {
        return new Stack(new StackArray());
    }

    @Override
    public StackFIFO getFIFOStack() {
        return new StackFIFO(new StackList());
    }

    @Override
    public StackHanoi getHanoiStack() {
        return new StackHanoi(new StackList());
    }

}