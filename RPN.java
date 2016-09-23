/********************
	Reverse Polish Notation
	Shahzore Qureshi
**********************/

import java.util.Stack;

public class RPN {
	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<Integer>();

		for(int i = 0; i < args.length; i++) {
			try {
				Integer integer = Integer.valueOf(args[i]);
				//If there is no error, push integer to stack.
				stack.push(integer);
			} catch (Exception e) {
				//If there is an error, the value is most likely an operator.
				Integer operandOne = stack.pop();
				Integer operandTwo = stack.pop();
				if(args[i].equals("+")) {
						System.out.println(operandOne + " + " +  operandTwo);
						stack.push(operandOne + operandTwo);
				} else if (args[i].equals("-")) {
						System.out.println(operandOne + " - " +  operandTwo);
						stack.push(operandOne - operandTwo);
				} else if (args[i].equals("*")) {
						System.out.println(operandOne + " * " +  operandTwo);
						stack.push(operandOne * operandTwo);
				} else if (args[i].equals("/")) {
						System.out.println(operandTwo + " / " +  operandOne);
						stack.push(operandTwo / operandOne);
				} else {
						throw new Exception("Unsupported Operator: " + args[i]);
				}
			}
		}
	
		if(stack.size() == 1) {
				System.out.println("Result: " + stack.pop());
		} else {
				System.out.println("Error. Invalid syntax.");
		}
	}
}
