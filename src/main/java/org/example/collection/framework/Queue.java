package collection.framework;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		queue.add("Ankur");

		System.out.println("Elements: " + queue);

		System.out.println("Head:" + queue.element());
		System.out.println("Head:" + queue.peek());

		queue.remove("Amit");

		System.out.println("After removing two elements: " + queue);

	}

}
