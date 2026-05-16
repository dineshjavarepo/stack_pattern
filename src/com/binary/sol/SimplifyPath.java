package com.binary.sol;

import java.util.Stack;

public class SimplifyPath {
	
	 public static String simplifyPath(String path) {
		 
		 Stack<String> stack = new Stack<String>();
		 String[] paths = path.split("/");
		 
		 for(String str : paths) {
			 
			 if(str.equals(".") || str.equals("")) {
				 continue;
			 }else if(str.equals("..")) {
				 if(!stack.empty()) {
					 stack.pop();
				 }
			 }else {
				 stack.push(str);
			 }
					 
		 }
		 
		 return "/" + String.join("/", stack);
	        
	    }

}
