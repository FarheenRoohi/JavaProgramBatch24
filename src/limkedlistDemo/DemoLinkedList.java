package limkedlistDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add("welcome");
		ll.add('d');
		ll.add(null);
		ll.add("abc");
		System.out.println(ll);
		ll.add(2, " to java");
		System.out.println(ll);
		System.out.println(ll.size());
		ll.remove(4);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll);
		ll.remove("abc");
		System.out.println(ll);
		System.out.println(ll.get(1));//retriving
		ll.set(0,"hello");
		System.out.println(ll);
		System.out.println(ll.contains(" to java"));
		System.out.println(ll.contains("Abc"));
		System.out.println(ll.isEmpty());
		for(int i = 0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		for(Object e :ll) {
			System.out.println(e);
		}
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
