package dataStructures;
import java.util.*;
public class stackPushPop {
//pushing means we are putting something on top of the stack
//popping means we are taking something off of the stack
	public static void main(String[] args) {
		
		//here we create our stack
		Stack<String> stack = new Stack<String>();
		//here we are adding items to the stack through 'push'
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
	}
	
	private static void printStack(Stack<String> s) {
		if (s.isEmpty()) {
			System.out.println("you have nothing in your stack");
		}
		else
		{
			System.out.printf("%s TOP\n", s );
		}
	}
}
