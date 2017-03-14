package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.Stack;

class StacksDemo {

    public static final int ITERATOR = 15;


    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        testStacks(factory);
    }
    private static void testStacks(DefaultStacksFactory factory) {
        Stack[] Stacks = {factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
                factory.getHanoiStack()}; //przeniesienie kodu do nowej linii w momencie, gdy nie jest to potrzebne

        System.out.println("Rejected: " + ((StackHanoi) Stacks[3]).reportRejected());

    }

    private static void fillStacks(Stack[] stacks) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                stacks[j].push(i);
    }

    private static void fillHanoiStack(Stack stack) {

        java.util.Random rn = new java.util.Random(); //cofniecie wiersza
        for (int i = 1; i < ITERATOR; i++)
            stack.push(rn.nextInt(20));
    }

    private static void printStack(Stack[] stacks) {
        for (int i = 0; i < stacks.length; i++) {       //cofniecie wiersza
            while (!stacks[i].isEmpty())
                System.out.print(stacks[i].pop() + "  ");
            System.out.println(); //while odnosi sie tylko do 1 linii po sobie, wiec kolejna linia, nie odnosi sie
        }

    }
//alt + <- w srodowisku IntelliJ Idea powoduje przelaczanie sie pomiedzy kartami
}
