package com.learning.core.Day7;
import java.util.Scanner;
class Node{
	double data;
	Node next;
	
	Node(double data){
		this.data = data;
		this.next = null;
	}
}
public class D07P02 {
	private Node top;
	
	public D07P02() {
		this.top = null;
	}
	public void push(double data) {
		Node newNode = new Node(data);
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	public double pop() {
		if(top == null) {
			System.out.println("Stack is empty:");
			return Double.NaN;
		}
		double poppedData = top.data;
		top = top.next;
		return poppedData;
	}
	public void display() {
		if(top == null) {
			System.out.println("Stack is empty:");
			return;
		}
		Node current = top;
		while(current != null) {
			System.out.println(current.data+"");
			current=current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		String[] elements = input.split("\\s+");
		D07P02 stack = new D07P02();
		for(String element : elements) {
			stack.push(Double.parseDouble(element));
			
		}
		System.out.println("The elements are:");
		stack.display();
		stack.pop();
		stack.pop();
		System.out.print("After popping twice:" );
		stack.display();
	}

}
