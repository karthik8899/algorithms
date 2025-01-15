package com.algorithms.queue;

import java.util.Arrays;

/**
 * Circular queue with arrays
 * 
 * MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(1);
        myQueue.print();
        myQueue.enqueue(2);
        myQueue.print();
        myQueue.peek();
        myQueue.enqueue(3);
        myQueue.print();
        myQueue.enqueue(4);
        myQueue.print();
        myQueue.enqueue(5);
        myQueue.print();
        myQueue.enqueue(6);
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.enqueue(6);
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.enqueue(7);
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
        myQueue.dequeue();
        myQueue.print();
 *
 */
public class MyQueue {

	int[] arr;
	int front;
	int rear;
	int capacity = 0;
	int count = 0;
	
	public MyQueue(int size) {
		this.capacity = size;
		this.arr = new int[size];
		this.front = 0;
		this.rear = -1;
	}
	
	public void enqueue(int value) {
		if(this.capacity == size()) {
			System.out.println("Queue overflow! -->" + value);
			return;
		}
		
		this.rear = (this.rear + 1) % capacity;
		this.arr[this.rear] = value;
		this.count++;
	}
	
	public int dequeue() {
		if(empty()) {
			System.out.println("Quue is empty!");
			return -1;
		}
		
		int value = this.arr[this.front];
		this.arr[this.front] = 0;
		this.front = (this.front + 1) % capacity;
		this.count--;
		System.out.println("Dequeue on " + value);
		return value;
	}
	
	public void peek() {
		   System.out.println("Peek --> " + this.arr[this.front]);
		}
	
   public boolean empty() {
	    //System.out.println("Checking Queue is empty!");
		return size() == 0;
	}
   
   public int size() {
	   //System.out.println("Checking Size --> " + count);
		return count;
	}
	
   public void print() {
	   System.out.println("Array --> " + Arrays.toString(this.arr));
	}
	
}
