package com.binary.sol;

import java.util.Stack;

public class ImpementQueueUsingStack {

	  Stack<Integer> instack;
	  Stack<Integer> outstack;
	  
	  public ImpementQueueUsingStack() {
		  instack= new Stack<>();
		  outstack= new Stack<>();
	   }
	    
	    public void push(int x) {
	    	instack.push(x);
	      
	    }
	    
	    public int pop() {
	    	if(outstack.isEmpty()) {
	    		while(!instack.isEmpty()) {
	    			outstack.push(instack.pop());
	    		}
	    	}
	    	return outstack.pop();
	    }
	    
	    public int peek() {
	    	if(outstack.isEmpty()) {
	    		while(!instack.isEmpty()) {
	    			outstack.push(instack.pop());
	    		}
	    	}
	        return outstack.peek();
	    }
	    
	    public boolean empty() {
	        return outstack.isEmpty() && instack.isEmpty();
	    }
}
