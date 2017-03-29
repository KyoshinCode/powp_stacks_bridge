package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    //TODO Add more test like StackHanoiTests

    @Test public void testPush() {
        IStack IstackObj = new Stack();
        int testValue = 4;
        IstackObj.push(testValue);

        int result = IstackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test public void testIsEmpty() {
        IStack IstackObj = new Stack();
        boolean result = IstackObj.isEmpty();
        Assert.assertEquals(true, result);

        IstackObj.push(888);

        result = IstackObj.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test public void testIsFull() {
        IStack IstackObj = new Stack();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = IstackObj.isFull();
            Assert.assertEquals(false, result);
            IstackObj.push(888);
        }

        boolean result = IstackObj.isFull();
        Assert.assertEquals(true, result);
    }

    @Test public void testTop() {
        IStack IstackObj = new Stack();
        final int EMPTY_STACK_VALUE = -1;

        int result = IstackObj.top();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        IstackObj.push(testValue);

        result = IstackObj.top();
        Assert.assertEquals(testValue, result);
        result = IstackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test public void testPop() {
        IStack IstackObj = new Stack();
        final int EMPTY_STACK_VALUE = 0;

        int result = IstackObj.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        IstackObj.push(testValue);

        result = IstackObj.pop();
        Assert.assertEquals(testValue, result);
        result = IstackObj.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
