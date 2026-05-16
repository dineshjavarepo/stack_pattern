package com.binary.sol;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousSmallerElement {

	
	public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        List<Integer> list = new ArrayList<Integer>();
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<arr.length;i++) {
        	
        	while(!stack.isEmpty() && stack.peek() >= arr[i]) {
        		stack.pop();
        	}
        	
        	if(stack.empty()) {
        		list.add(-1);
        	}else {
        		list.add(stack.peek());
        	}
        	
        	stack.push(arr[i]);
        }
        
		return (ArrayList<Integer>) list;
    }
	
	
}

