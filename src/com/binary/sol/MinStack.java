package com.binary.sol;

import java.util.Stack;

public class MinStack {

	  Stack<Integer> stock;
	  Stack<Integer> minStack;
	   public MinStack() {
		   stock= new Stack<>();
		   minStack = new Stack<>();
	    }
	    
	    public void push(int val) {
	        stock.push(val);
	        if(minStack.isEmpty() || val <= minStack.peek()) {
	        	minStack.push(val);
	        }
	    }
	    
	    public void pop() {
	        if(stock.peek().equals(minStack.peek())) {
	        	minStack.pop();
	        }
	        
	        stock.pop();
	    }
	    
	    public int top() {
	       return stock.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
}
