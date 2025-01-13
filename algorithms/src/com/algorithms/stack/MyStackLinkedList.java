package com.algorithms.stack;

/**
 *  MyStackLinkedList myStack = new MyStackLinkedList(5);
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
 *
 */
public class MyStackLinkedList {
	Node top;
	
	public MyStackLinkedList(int size) {
		this.top = null;
	}
	
	public void push(int value) {
		
		Node newNode = new Node(value);
		newNode.next = top;
		this.top = newNode;
	
	}
	
	public int pop() {
		if (top == null) {
			System.out.println("Nothing in list");
			return -1;
		}
		
		int poppedValue = top.data;
		this.top = top.next;
		return poppedValue;
	
	}
	
	public int peek() {
       if(top == null) {
    	   System.out.println("Stack is empty!");
    	   return -1;
       }
	   
       return this.top.data;
	}
	
	public void print() {
		// print whole stack
		System.out.println("Stack Linked list --> " + this.top.toString());
	}
	
	public boolean isEmpty() {
        return top == null;
    }
	
//	public int size() {
//		System.out.println("size -->" + (top + 1));
//        return top + 1;
//    }
	
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		    this.next = null;
		}
		
		@Override
	    public String toString() {
	        return String.format("Node(%d, next = %s)", data, next);
	    }
	}

}
