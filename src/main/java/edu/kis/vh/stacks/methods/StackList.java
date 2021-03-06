package edu.kis.vh.stacks.methods;

import edu.kis.vh.stacks.IStack;

import static edu.kis.vh.stacks.IStack.EMPTY_STACK_INDICATOR;

public class StackList implements IStack {

	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}