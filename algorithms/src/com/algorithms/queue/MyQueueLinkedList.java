package com.algorithms.queue;

/**
 * 
 * MyQueueLinkedList myQueue = new MyQueueLinkedList();
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
 *
 */
public class MyQueueLinkedList {
	
	Node rear;
	Node front;
	int size;
	
	public MyQueueLinkedList() {
		this.size = 0;
		this.rear = null;
		this.front = null;
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if(rear == null) {
			rear = front = newNode;
		} else {
			rear.next = newNode;
			this.rear = newNode;
		}
		
		size++;
	}
	
	public int dequeue() {
		if(front == null) {
			System.out.println("Queue is empty");
			return -1;
		}
		int dequeuValue = this.front.data;
		this.front = this.front.next;
		if (front == null) { // Queue becomes empty
            rear = null;
        }
		
		size--;
		return dequeuValue;
	}
	
	public void print() {
		System.out.println(this.rear.toString());
	}
	
	public void peek() {
		if(this.front == null) {
			System.out.println("Peek Queue is empty");
		}
		System.out.println(this.front.toString());
	}
	
	public class Node {
		int data;
		Node next;
		
		public Node(int value) {
			this.data = value;
			this.next = null;
		}
		
		@Override
		public String toString() {
			return String.format("Node(%d, next = %s)", data, next);
		}
	}

}
