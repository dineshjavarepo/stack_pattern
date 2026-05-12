package com.binary.sol;

import java.util.Stack;

public class EvaluateReversePolicyNotation {
	
	 public static int evalRPN(String[] tokens) {
	 
		 int result=0;
		 Stack<Integer> stack = new Stack<>();
		 
		 for(String str: tokens) {
			 
			 switch (str) {
			case "+": {
				
				int top = stack.pop();
				result = result+ top + stack.peek();
				stack.push(top);
				break;
				
			}case "*": {
				
				result = result*stack.peek();			
				break;
				
			} case "-": {
				
				result = result-stack.peek();
				break;
				
			} case "/": {
				
				result = result/stack.peek();
			}
			default:
				stack.push(Integer.parseInt(str));
			}
			 
		 }
		 
		 return result;
		 
	 }

	 
	 public static int evalRPN1(String[] tokens) {
		 
		 Stack<Integer> stack = new Stack<>();
		 
		 for(String str: tokens) {
			 if("/*+-".contains(str) && str.length()==1) {
				  int data1= stack.pop();
				  int data2= stack.pop();
				  if(str.equals("+")) {
					  stack.push(data2+data1);
				  }else if(str.equals("*")) {
					  stack.push(data2*data1);
				  }else if(str.equals("/")) {
					  stack.push(data2/data1);
				  }else if(str.equals("-")) {
					  stack.push(data2-data1);
				  }
			 }else {
				  stack.push(Integer.parseInt(str));
			  }
		 }
		return stack.pop();
	 }
}
