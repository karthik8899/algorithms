package com.algotithms;

import com.algorithms.stack.MyStackLinkedList;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        MyStackLinkedList myStack = new MyStackLinkedList(5);
        myStack.push(1);
        myStack.print();
        myStack.push(2);
        myStack.print();
        myStack.peek();
        myStack.push(3);
        myStack.print();
        myStack.push(4);
        myStack.print();
        myStack.push(5);
        myStack.print();
        myStack.push(6);
        myStack.print();
        myStack.pop();
        myStack.print();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

    }
}
