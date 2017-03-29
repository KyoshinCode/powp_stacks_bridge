package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IStacksFactory {

     IStack getStandardStack();


     IStack getFalseStack();

     StackFIFO getFIFOStack();

     StackHanoi getHanoiStack();

}
