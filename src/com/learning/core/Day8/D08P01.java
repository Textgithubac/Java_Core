package com.learning.core.Day8;

public class D08P01 {
	private int[] queueArray;
	private int front, rear;
	private int maxSize;
	
	public D08P01(int size) {
		maxSize = size;
		queueArray = new int[size];
		front = -1;
		rear = -1;
		
	}
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if(front == -1) {
			front = 0;
		}
		rear = (rear + 1) % maxSize;
		queueArray[rear] = item;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int item = queueArray[front];
		if(front == rear) {
			front = rear = -1;
		}
		else {
			front = (front + 1) % maxSize;
		}
		return item;
		
	}
	public boolean isEmpty() {
		return front == -1;
	}
	public boolean isFull() {
		return (rear + 1) % maxSize == front;
	}
	public void display() {
		if(isEmpty()) {
			System.out.print("Queue is Empty");
			return;
		}
		System.out.print("");
		for(int i = front; i <= rear; i++) {
			System.out.print(queueArray[i]+ " ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		D08P01 q1 = new D08P01(5);
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		
		System.out.print("Elements in queue: ");
		q1.display();
		q1.dequeue();
		System.out.print("After removing first element: "); 
		q1.display();
	}

}
