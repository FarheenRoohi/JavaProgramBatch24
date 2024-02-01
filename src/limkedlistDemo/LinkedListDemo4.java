package limkedlistDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo4 {

	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add("abc");
		ll.add(50);
		ll.add(58);
		ll.add(36);
		ll.add("trd");
		//System.out.println(ll);
		ListIterator itr = ll.listIterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
			if (obj == "abc") {

				System.out.println("this is next Index  = " + itr.nextIndex());
				System.out.println("This is previous index = " + itr.previousIndex());
			}
		}
	}

}
