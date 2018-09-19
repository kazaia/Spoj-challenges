import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static String infixToPolish(String str) {
		Stack<String> stack = new Stack<>();
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			String c = str.substring(i, i+1);
		if( isOperand(c)) {
			result.append(c);
		}
		
		else if ( isOperator(c)) {
			if(stack.isEmpty() ) {
				stack.push(c);

			}else {
				if(c.equals("(")) {
					stack.push(c);
				}
				
				else if( getPrecedence(stack.peek())  < getPrecedence(c) || stack.peek().equals("("))
				{
					stack.push(c);
				}else {
					result.append(stack.pop());
					stack.push(c);
				}
				
				if(c.equals(")")){
					while(!stack.isEmpty() && !stack.peek().equals("(")) {
						result.append(stack.pop());
					} if( stack.peek().equals("("))
						 stack.pop();					
				}
			}
			
		}
		if( i == str.length()- 1 )	
		while(!stack.isEmpty())
			{
				result.append(stack.pop());
			}
		}
		
		return result.toString().replaceAll("[()]", "");
	}
	
	
	public static boolean isOperand(String op) {

		boolean b = false;
		
		if ((op.compareTo("a") >= 0 && op.compareTo("z") <= 0) || (op.compareTo("A") >= 0 && op.compareTo("Z") <= 0))
			b = true;
		else
			b = false;
		return b;

	}

	public static boolean isOperator(String op) {
		boolean b = false ; 
		if( op.equals("+") || op.equals("-") || op.equals("*") ||  op.equals("/") ||  op.equals("(") ||  op.equals(")") ||  op.equals("^"))
			b = true;
		
		return b;
	}

	public static int getPrecedence(String operand) {
		switch (operand) {
		case "+":
		case "-":
			return 1; 
		case "*":
		case "/":
			return 2; 	
		case "^":
			return 3; 	
		case "(":
		case ")":
			return 4; 
		default:
			return 0; 
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		String nums[] = new String[testCases];

		for (int i = 0; i < testCases; i++) {
			nums[i] = scan.next();
		}

		for (int i = 0; i < testCases; i++) {
			System.out.println(infixToPolish(nums[i]));
		}	
	}
}
