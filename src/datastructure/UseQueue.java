package datastructure;

import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> FallclassesQueue = new LinkedList<Integer>();

		System.out.println("Before entering any number: " + FallclassesQueue.peek());
		FallclassesQueue.offer(1);
		FallclassesQueue.add(2);
		FallclassesQueue.add(3);
		FallclassesQueue.offer(4);

		System.out.println("After entering numbers: " + FallclassesQueue.peek());
		System.out.println("Using element the numbers are " + FallclassesQueue.element());
		System.out.println("The Numbers are: " + FallclassesQueue);

		FallclassesQueue.remove();
		FallclassesQueue.poll();

		System.out.println("After removing numbers: " + FallclassesQueue);
		System.out.println("First element of the queue: " + FallclassesQueue.element());

		for ( Integer s: FallclassesQueue){
			System.out.println("After using each for loop method the numbers are: " + s);
		}
		Iterator<Integer> it = FallclassesQueue.iterator();
		while (it.hasNext()){
			System.out.println("After using iterator the numbers are: " + it.next());
		}
	}

}
