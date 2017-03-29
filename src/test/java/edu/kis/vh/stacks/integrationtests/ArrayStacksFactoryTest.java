package edu.kis.vh.stacks.integrationtests;

/**
 * Created by RFran on 30.03.2017.
 */

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by RFran on 30.03.2017.
 */

public class ArrayStacksFactoryTest {

    @Test
    public void testStandardStackFactory(){
        ArrayStacksFactory factory = new ArrayStacksFactory();
        IStack result = factory.getStandardStack();
        Assert.assertTrue(result instanceof Stack);
    }

    @Test public void testFalseStackFactory(){
        ArrayStacksFactory factory = new ArrayStacksFactory();
        IStack result = factory.getFalseStack();
        Assert.assertTrue(result instanceof Stack);
    }

    @Test public void testFIFOStackFactory(){
        ArrayStacksFactory factory = new ArrayStacksFactory();
        IStack result = factory.getFIFOStack();
        Assert.assertTrue(result instanceof StackFIFO);
    }

    @Test public void testHanoiStackFactory(){
        ArrayStacksFactory factory = new ArrayStacksFactory();
        IStack result = factory.getHanoiStack();
        Assert.assertTrue(result instanceof StackHanoi);
    }
}