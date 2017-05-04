package datastructure;
import java.util.*;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue queue = new LinkedList();

		queue.add(14);
		queue.add(7);
		queue.add(39);
		queue.add(40);

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + queue);


      /* For Each Loop*/
		System.out.println("After Adding Advanced For Loop");
		for (Object num : queue) {
			System.out.println(num);
		}

      /* While Loop for iterating ArrayList*/
		System.out.println("After Adding While Loop");
		int count = 0;
		while (queue.size() > count) {
			System.out.println(queue.remove(count));
			count++;
		}

		System.out.println("ArrayList After : " + queue);
      /*Looping Array List using Iterator*/
		System.out.println("Iterator");
		Iterator iter = queue.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("After added current array list is:" + queue);


		// remove all even numbers
		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			Integer val = itr.next();
			if (val % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println("After removing all the even number arrayList : " + queue);

		Stack <Integer> stack = new Stack <Integer> ();
		stack.add(14);
		stack.add(7);
		stack.add(39);
		stack.add(40);
		System.out.println("After peek data arraList is: " + stack.peek());
	}

}
