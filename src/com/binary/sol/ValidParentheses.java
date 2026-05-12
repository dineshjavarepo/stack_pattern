package com.binary.sol;

import java.util.Stack;

public class ValidParentheses {

	//Approach 1
	 public static boolean isValid(String s) {
		 
		 Stack<Character> satck = new Stack<>();
		 
		 for(char ch: s.toCharArray()) {
			 if(ch=='{' || ch=='[' || ch=='(') {
				 satck.push(ch);
			 }else {
				 if(satck.isEmpty()) return false;
				 if(ch ==')' && satck.pop() != '(') return false;
				 if(ch ==']' && satck.pop() != '[') return false;
				 if(ch =='}' && satck.pop() != '{') return false;
			 }
		 }
		return satck.isEmpty();
	        
	  }
	 
	 //Approach2
	 
	 public static boolean isValid1(String s) {
		 
		 Stack<Character> stack = new Stack<>();
		 
		 for(char ch : s.toCharArray()) {
			 if(ch=='{') {
				 stack.push('}');
			 }else if(ch=='[') {
				 stack.push(']');
			 }else if(ch=='(') {
				 stack.push(')');
			 }else {
				 if((stack.isEmpty() || ch != stack.pop()))  return false;
				
			 }
		 }
		 
		 return stack.isEmpty();
	 }
	 
}
