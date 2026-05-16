package com.binary.sol;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
	
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	
    	//Add next element in num2 array
    	for(int num : nums2) {
    		while(!stack.empty() && num > stack.peek()) {
    			map.put(stack.pop(), num);
    		}
    		stack.push(num);
    	}
        
    	//Add -1 if no next element there 
    	while(!stack.isEmpty()) {
    		map.put(stack.pop(), -1);
    		
    	}
    	
    	int[] result = new int[nums1.length];
    	for(int i=0;i<nums1.length;i++) {
    		result[i] = map.getOrDefault(nums1[i], -1);
    	}
    	
    	return result;
    }

}
