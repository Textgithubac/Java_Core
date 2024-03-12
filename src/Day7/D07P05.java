package com.learning.core.Day7;

class Stack {
	  private Node top;

	  private static class Node {
	    int data;
	    Node next;

	    Node(int data) {
	      this.data = data;
	    }
	  }

	  public boolean isEmpty() {
	    return top == null;
	  }

	  public void push(int data) {
	    Node newNode = new Node(data);
	    newNode.next = top;
	    top = newNode;
	  }

	  public int pop() {
	    if (isEmpty()) {
	      throw new RuntimeException("Stack is empty");
	    }
	    int data = top.data;
	    top = top.next;
	    return data;
	  }

	  public void reverse() {
	    reverse(top);
	  }

	  private void reverse(Node node) {
	    if (node == null) {
	      return;
	    }
	    int data = pop();
	    reverse(node.next);
	    push(data);
	  }

}
public class D07P05 {
	public static void main(String[] args) {
		Stack stack = new Stack();
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);

	    stack.reverse();

	    while (!stack.isEmpty()) {
	      System.out.print(stack.pop() + " ");
	    }
	  }
}
	


	
