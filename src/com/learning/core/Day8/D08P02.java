package com.learning.core.Day8;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
		
	}
}
	
public class D08P02 {
	private Node front;
	private Node rear;
	
	public D08P02() {
		this.front = null;
		this.rear = null;
	}
	public boolean isEmpty() {
		return front == null;
	}
	public void enqueue(int item) {
		Node newNode = new Node(item);
		if(isEmpty()) {
			front = rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		int removedItem = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return removedItem;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		Node current = front;
		
		
		while(current != null) {
			System.out.print(" "+ current.data);
			current = current.next;
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		D08P02 q = new D08P02();
		q.enqueue(89);
		q.enqueue(99);
		q.enqueue(109);
		q.enqueue(209);
		q.enqueue(309);
		
		System.out.print("Elements in queue:");
		q.display();
		
		q.dequeue();
		q.dequeue();
		
		System.out.print("After removing two elements:");
		
		q.display();
		}

}
