package com.algotithms;

import com.algorithms.queue.MyQueueLinkedList;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    	MyQueueLinkedList myQueue = new MyQueueLinkedList();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        //myQueue.print();
        myQueue.peek();
        myQueue.enqueue(3);
        myQueue.peek();
        myQueue.enqueue(4);
        myQueue.peek();
        myQueue.enqueue(5);
        myQueue.peek();
        myQueue.enqueue(6);
        myQueue.peek();
        myQueue.dequeue();
        myQueue.peek();
        myQueue.enqueue(6);
        myQueue.peek();
        myQueue.dequeue();
        myQueue.peek();

    }
}
