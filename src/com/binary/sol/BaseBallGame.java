package com.binary.sol;

import java.util.Stack;

public class BaseBallGame {

	
	//Approach1
   public static int calPoints(String[] operations) {
     
	   Stack<Integer> stack = new Stack<>();
	   
	   for(String op: operations) {
		   
		   if(op.equals("+")) {
			  int top = stack.pop();
			  int beforTop = stack.peek();
			  int sumtop = top+beforTop;
			  stack.push(top);
			  stack.push(sumtop);
		   }else if(op.equals("C")) {
			   stack.pop();
		   }else if(op.equals("D")) {
			    stack.push(2*stack.peek());
		   }else {
			   stack.push(Integer.parseInt(op));
		   }
	   }
	   
	   int sum =0;
	   
	   for(int x: stack) sum+=x;
	   
	   return sum;
	   
    }
   
   //Approach2
   public static int calPoints1(String[] operations) {
	   
	   Stack<Integer> stack = new Stack<>();
	   
	   for(String st : operations) {
		   
		   switch (st) {
		       case "+": {
				     int top = stack.pop();
				     int sum = top+stack.peek();
				     stack.push(top);
				     stack.push(sum);
				     break;
			   }case "C": {
				     stack.pop();
				     break;
			   }case "D": {
				     stack.push(2*stack.peek());
				     break;
			   }
		      default:
			     stack.push(Integer.parseInt(st));
			     break;
		}
	   }
	   
	   int sum=0;
       for(int x: stack) sum+=x;
	   return sum;
   }
   
}
