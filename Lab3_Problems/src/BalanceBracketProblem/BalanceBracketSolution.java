package BalanceBracketProblem;

import java.util.EmptyStackException;
import java.util.Stack;

public class BalanceBracketSolution {
	
	public static boolean CheckBalance(String input) 
	{
		try 
		{
			Stack<Character> stack = new Stack<>();
			for(int i=0; i<input.length();i++)
			{
				if(input.charAt(i)=='[' || input.charAt(i)=='{' || input.charAt(i)=='(')
				{
					stack.push(input.charAt(i));
					continue;
				}
				char stackTop;
				if(input.charAt(i) == ')')
				{
					stackTop = stack.pop();
					if(stackTop == '{' || stackTop == '[')
						return false;
					
				}
				else if(input.charAt(i) == '}')
				{
					stackTop = stack.pop();
					if(stackTop == '(' || stackTop == '[')
						return false;
					
				}
				else if(input.charAt(i) == ']')
				{
					stackTop = stack.pop();
					if(stackTop == '(' || stackTop == '{')
						return false;
					
				}
				
			}
			if(stack.isEmpty())
			{
				return true;
			}
			return false;
		}
		catch (EmptyStackException e) {
			System.out.println("Stack Underflow");
			return false;
		}
	}

}
