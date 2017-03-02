package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.Stack;

class StacksDemo {

    public static final int ITERATOR = 15;

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        Stack[] Stacks = {factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
                factory.getHanoiStack()}; //przeniesienie kodu do nowej linii w momencie, gdy nie jest to potrzebne

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                Stacks[j].push(i);

        java.util.Random rn = new java.util.Random(); //cofniecie wiersza
        for (int i = 1; i < ITERATOR; i++)
            Stacks[3].push(rn.nextInt(20));

        for (int i = 0; i < Stacks.length; i++) {       //cofniecie wiersza
            while (!Stacks[i].isEmpty())
                System.out.print(Stacks[i].pop() + "  ");
            System.out.println(); //while odnosi sie tylko do 1 linii po sobie, wiec kolejna linia, nie odnosi sie
        }

        System.out.println("total rejected is " + ((StackHanoi) Stacks[3]).reportRejected());

    }
//alt + <- w srodowisku IntelliJ Idea powoduje przelaczanie sie pomiedzy kartami
}
