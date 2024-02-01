package limkedlistDemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add("cat");
		ll.add("rat");
		ll.add("cow");
		ll.add("dog");
		ll.add("lion");
		System.out.println(ll);
		ll.addFirst("Monkey");
		ll.addLast("donkey");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

	}

}
