package com.algorithms.stack;

/**
 * 
 *     MyStackArray myStack = new MyStackArray(5);
        myStack.size();
        myStack.push("a");
        myStack.push("b");
        myStack.print();
        myStack.peek();
        myStack.push("c");
        myStack.print();
        myStack.push("d");
        myStack.print();
        myStack.push("e");
        myStack.print();
        myStack.push("f");
        myStack.print();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
 *
 */
public class MyStackArray {
	Integer top = -1;
	String[] arr;
	Integer capacity = 0;
	
	public MyStackArray(int size) {
		arr = new String[size];
		capacity = size;
		System.out.println("Top Initial -->" + top);
	}
	
	public void push(String value) {
		System.out.println("Stack Push length " + arr.length);
		if(top == capacity - 1) {
			System.out.println("Stack Max reached");
			return;
		}
		// add value
		arr[++top] = value;
		System.out.println("Top Push -->" + top);
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack Under flow");
			return;
		}
		// Remove value
		top--;
		System.out.println("Top pop -->" + top);
	}
	
	public String peek() {
		if (top == -1) {
            System.out.println("Stack is Empty");
            return "";
        }
		// print next value
		System.out.println(arr[top]);
		System.out.println("Top Peek -->" + top);
		return arr[top];
	}
	
	public void print() {
		// print whole stack
		System.out.println(String.join(",", arr));
	}
	
	public boolean isEmpty() {
        return top == -1;
    }
	
	public int size() {
		System.out.println("size -->" + (top + 1));
        return top + 1;
    }
}
