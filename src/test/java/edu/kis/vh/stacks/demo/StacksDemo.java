package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.stack;

class StacksDemo {

    public static void main(String[] args) {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(),
                factory.GetHanoiStack()}; //przeniesienie kodu do nowej linii w momencie, gdy nie jest to potrzebne

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                stacks[j].push(i);

        java.util.Random rn = new java.util.Random(); //cofniecie wiersza
        for (int i = 1; i < 15; i++)
            stacks[3].push(rn.nextInt(20));

        for (int i = 0; i < stacks.length; i++) {       //cofniecie wiersza
            while (!stacks[i].isEmpty())
                System.out.print(stacks[i].pop() + "  ");
            System.out.println(); //while odnosi sie tylko do 1 linii po sobie, wiec kolejna linia, nie odnosi sie
        }

        System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

    }

}
