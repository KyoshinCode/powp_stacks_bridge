package edu.kis.vh.stacks.integrationtests;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ListStacksFactory;
import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by RFran on 30.03.2017.
 */
public class ListStacksFactoryTest {

    @Test
    public void testStandardStackFactory(){
        ListStacksFactory factory = new ListStacksFactory();
        IStack result = factory.getStandardStack();
        Assert.assertTrue(result instanceof Stack);
    }

    @Test public void testFalseStackFactory(){
        ListStacksFactory factory = new ListStacksFactory();
        IStack result = factory.getFalseStack();
        Assert.assertTrue(result instanceof Stack);
    }

    @Test public void testFIFOStackFactory(){
        ListStacksFactory factory = new ListStacksFactory();
        IStack result = factory.getFIFOStack();
        Assert.assertTrue(result instanceof StackFIFO);
    }

    @Test public void testHanoiStackFactory(){
        ListStacksFactory factory = new ListStacksFactory();
        IStack result = factory.getHanoiStack();
        Assert.assertTrue(result instanceof StackHanoi);
    }
}
