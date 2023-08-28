package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("you");
		list.add("hi");
		list.add("hello");
		list.add("hey");
		list.add("me");
		System.out.println(list);
		
		
		List<Integer> integers = new LinkedList<>();
		integers.add(700);  //Integer.valueOf(700);
		integers.add(100);
		integers.add(400);
		integers.add(300);

		System.out.println(integers);
		
		System.out.println("Doubly Linked List");
		Deque<String> deque = new LinkedList<>();
		deque.add("ind");
		deque.add("sl");
		deque.addFirst("afg");
		deque.addLast("pak");
		System.out.println(deque);
	}
}