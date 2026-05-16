package com.binary.sol;

import java.util.Stack;

public class NextGreaterElement {

	
	public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
		
		int[] result = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=n-1;i >= 0 ; i--) {
			
			while(!stack.empty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			
			if(stack.empty()) {
				result[i]=-1;
			}else {
				result[i] = stack.peek();
			}
			
			stack.push(arr[i]);
		}
		
		return result;
    }
	
}
