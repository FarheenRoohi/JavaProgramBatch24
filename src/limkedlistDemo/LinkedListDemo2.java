package limkedlistDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("E");
        ll.add("C");
        ll.add("F");
        ll.add("D");
        ll.add("B");
        System.out.println(ll);
        LinkedList<String> l = new LinkedList<String>();
        l.addAll(ll);
        System.out.println(l);
        l.add("F");
        l.add("D");
        System.out.println(l);
        l.removeAll(ll);
        System.out.println(l);
        Collections.sort(ll);
        System.out.println(ll);
        Collections.sort(ll,Collections.reverseOrder());
        System.out.println(ll);
        Collections.shuffle(ll);
        System.out.println(ll);
	}

}
