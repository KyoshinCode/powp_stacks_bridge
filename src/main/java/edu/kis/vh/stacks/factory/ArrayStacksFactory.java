package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.methods.StackArray;
import edu.kis.vh.stacks.methods.StackList;

/**
 * Created by RFran on 30.03.2017.
 */

public class ArrayStacksFactory implements IStacksFactory {
    @Override
    public IStack getStandardStack() {
        return new Stack(new StackArray());
    }

    @Override
    public IStack getFalseStack() {
        return new Stack(new StackList());
    }

    @Override
    public StackFIFO getFIFOStack() {
        return new StackFIFO(new StackArray());
    }

    @Override
    public StackHanoi getHanoiStack() {
        return new StackHanoi(new StackArray());
    }
}