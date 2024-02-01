package treeSetDemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		TreeSet t = new TreeSet <> ();
		// Homogenious typ of elements or object are store
		t.add(10);
		t.add(20);
		t.add(50);
		t.add(30);
		t.add(34);
		t.add(89);
//		System.out.println(t);
//		System.out.println(t.pollFirst());
//		NavigableSet nav = t.descendingSet();
//		System.out.println(nav);
//		System.out.println(t.add(45));
//		System.out.println(t);
//		t.pollLast();
//		System.out.println(t);
//		SortedSet s = t.headSet(80);
//		System.out.println(t);
//		System.out.println(s);
//		SortedSet ss =t.tailSet(30);	
//		System.out.println(ss);
//		SortedSet s1 =t.subSet(20, 50);
//		System.out.println(s1);
		Iterator it = t.iterator();
		while(it.hasNext());
		//Object obj = it.next();
		System.out.println(it.next());

	}

}
