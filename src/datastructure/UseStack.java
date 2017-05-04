package datastructure;
import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		List<Integer> list = new ArrayList<Integer>(stack);

		for (Integer x : list)
		{
			System.out.println(x);
		}



	}

}
