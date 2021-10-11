package Lab3Problems;

import java.util.Scanner;
import java.util.Stack;
public class BalancingBracket {
	static boolean checkBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch=='('||ch== '{'||ch =='[')
				stack.push(ch);
			if(stack.isEmpty())
				return false;
			char popch;
			switch(ch) {
			case ')':   popch = stack.pop();
			if(popch!='(')
				return false;
			break;
			case '}': 	popch = stack.pop();
			if(popch!='{')
				return false;
			break;
			case ']': 	popch = stack.pop();
			if(popch!= '[')
				return false;
			break;
			}							
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean result;
		System.out.println("Enter a String Bracket Expression: ");
		String str = sc.next();
		result = checkBalanced(str);
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
		sc.close();
	}
}
