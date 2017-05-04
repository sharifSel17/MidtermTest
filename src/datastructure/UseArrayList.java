package datastructure;
import java.util.*;
import java.util.ArrayList;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		/*This is how elements should be added to the array list*/
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + arrlist);
		arrlist.add(0, 44);
		arrlist.add(1, 77);

      /* For Each Loop*/
		System.out.println("After Adding Advanced For Loop");
		for (Integer num : arrlist) {
			System.out.println(num);
		}

      /* While Loop for iterating ArrayList*/
		System.out.println("After Adding While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		System.out.println("ArrayList After : " + arrlist);
      /*Looping Array List using Iterator*/
		System.out.println("Iterator");
		Iterator iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("After added current array list is:" + arrlist);


		// remove all even numbers
		Iterator<Integer> itr = arrlist.iterator();
		while (itr.hasNext()) {
			Integer val = itr.next();
			if (val % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println("After removing all the even number arrayList : " + arrlist);

		Stack <Integer> stack = new Stack <Integer> ();
		stack.add(14);
		stack.add(7);
		stack.add(39);
		stack.add(40);
		System.out.println("After peek data arraList is: " + stack.peek());

	}

}





