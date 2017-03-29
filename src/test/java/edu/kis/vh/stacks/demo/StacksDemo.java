package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.IStack;

class StacksDemo {

    private static final int ITERATOR = 15;


    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        testStacks(factory);
    }
    private static void testStacks(DefaultStacksFactory factory) {
        IStack[] IStacks = {factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
                factory.getHanoiStack()}; //przeniesienie kodu do nowej linii w momencie, gdy nie jest to potrzebne

        fillStacks(IStacks);
        fillHanoiStack(IStacks[3]);
        printStack(IStacks);

        System.out.println("Rejected: " + ((StackHanoi) IStacks[3]).reportRejected());

    }

    private static void fillStacks(IStack[] stacks) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                stacks[j].push(i);
    }

    private static void fillHanoiStack(IStack stack) {

        java.util.Random rn = new java.util.Random(); //cofniecie wiersza
        for (int i = 1; i < ITERATOR; i++)
            stack.push(rn.nextInt(20));
    }

    private static void printStack(IStack[] stacks) {
        for (int i = 0; i < stacks.length; i++) {       //cofniecie wiersza
            while (!stacks[i].isEmpty())
                System.out.print(stacks[i].pop() + "  ");
            System.out.println(); //while odnosi sie tylko do 1 linii po sobie, wiec kolejna linia, nie odnosi sie
        }

    }
//alt + <- w srodowisku IntelliJ Idea powoduje przelaczanie sie pomiedzy kartami
}
