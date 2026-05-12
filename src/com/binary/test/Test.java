package com.binary.test;

import com.binary.sol.BaseBallGame;
import com.binary.sol.EvaluateReversePolicyNotation;
import com.binary.sol.ValidParentheses;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ValidParentheses.isValid("([{}])"));
		System.out.println(ValidParentheses.isValid1("([{}])"));
		System.out.println(BaseBallGame.calPoints(new String[] {"1","2","+","C","5","D"}));
		System.out.println(BaseBallGame.calPoints1(new String[] {"1","2","+","C","5","D"}));
		System.out.println(EvaluateReversePolicyNotation.evalRPN(new String[] {"1","2","+","3","*","4","-"}));
		System.out.println(EvaluateReversePolicyNotation.evalRPN1(new String[] {"1","2","+","3","*","4","-"}));

	}

}
