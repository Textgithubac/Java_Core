package com.learning.core.Day7;
import java.util.Iterator;
import java.util.Stack;

class UDStack { //user defined stack class
	  Stack < Integer > stk;
	  //cons to create object of UIStack class
	  UDStack() {
	    stk = new Stack < Integer > ();
	  }

	  //to push element into stack
	  void push(int ele) {
	    stk.push(ele);
	    return;
	  }
	  //it will remove the topmost element from stack
	  int pop() {

	    if (stk.isEmpty()) {
	      System.out.println("Underflow Error: Stack is Empty");
	    }
	    return stk.pop();
	  }

	  //to get minimum element from stack O(N)
	  int getMin() {
	    if (stk.isEmpty()) {
	      System.out.println("Underflow Error: Stack is Empty");
	    }

	    Iterator < Integer > itr = stk.iterator();
	    int minElement = stk.peek();
	    while (itr.hasNext()) {
	      int x = itr.next();
	      if (x < minElement) {
			minElement = x;
		}
	    }
	    return minElement;
	  }
	}
	
	  
public class D07P06 {
	public static void main(String args[]) {

	    UDStack stk = new UDStack();

	    stk.push(16);
	    stk.push(15);
	    stk.push(29);
	    stk.push(19);
	    stk.push(18);

	    System.out.println("" + stk.getMin());

	  }
}
