package com.learning.core.Day8;

public class D08P03 {
	private int capacity;
	private int[] queueArray;
	private int front;
	private int rear;
	private int size;
	
	public D08P03(int capacity) {
		this.capacity = capacity;
		this.queueArray = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == capacity;
	}
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue Overflow");
			return;
		}
		rear = (rear + 1) % capacity;
		queueArray[rear] = item;
		size++;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		int removedItem = queueArray[front];
		front = (front + 1) % capacity;
		size--;
		return removedItem;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Circular queue is Empty");
			return;
		}
		int count = 0;
		int index = front;
		while(count < size) {
			System.out.print(" "+queueArray[index]);
			index = (index + 1) % capacity;
			count++;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		D08P03 q = new D08P03(5);
		q.enqueue(14);
		q.enqueue(13);
		q.enqueue(22);
		q.enqueue(-8);
		
		System.out.print("Elements in circular queue:");
		q.display();
		
		q.dequeue();
		System.out.print("After removing first element:");
		q.display();
		}

}
