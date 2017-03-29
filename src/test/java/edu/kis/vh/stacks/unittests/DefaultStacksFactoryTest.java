package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by RFran on 14.03.2017.
 */
public class DefaultStacksFactoryTest {
    @Test public void testStandardStackFactory(){
        DefaultStacksFactory factory = new DefaultStacksFactory();
        IStack result = factory.getStandardStack();
        Assert.assertTrue(result instanceof Stack);
    }

    @Test public void testFalseStackFactory(){
        DefaultStacksFactory factory = new DefaultStacksFactory();
        IStack result = factory.getFalseStack();
        Assert.assertTrue(result instanceof Stack);
    }

    @Test public void testFIFOStackFactory(){
        DefaultStacksFactory factory = new DefaultStacksFactory();
        IStack result = factory.getFIFOStack();
        Assert.assertTrue(result instanceof StackFIFO);
    }

    @Test public void testHanoiStackFactory(){
        DefaultStacksFactory factory = new DefaultStacksFactory();
        IStack result = factory.getHanoiStack();
        Assert.assertTrue(result instanceof StackHanoi);
    }
}
