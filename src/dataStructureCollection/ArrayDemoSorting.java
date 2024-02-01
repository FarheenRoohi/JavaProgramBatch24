package dataStructureCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemoSorting {

	public static void main(String[] args) {
		ArrayList<Character> alist = new ArrayList<Character>();
		alist.add('A');
		alist.add('B');
		alist.add('G');
		alist.add('P');
		alist.add('F');
		alist.add('A');
		alist.add('D');
		System.out.println(alist);
		ArrayList<Object> list_dub = new ArrayList<Object>();
		list_dub.add('Z');
		list_dub.add('Q');
		System.out.println("Adding elements in other referance varieable");
		list_dub.addAll(alist);
		System.out.println(list_dub);//Z, Q, A, B, G, P, F, A, D]
		//Removing the all elements
		System.out.println("Removing the all elements");
		list_dub.removeAll(alist);
		System.out.println(list_dub);//[Z, Q]
		System.out.println(alist);//[A, B, G, P, F, A, D]
		//Sorting the Elements
		Collections.sort(alist);
		System.out.println(alist);//[A, A, B, D, F, G, P]
		//Sorting the coolection elements inreverse order.
		Collections.sort(alist, Collections.reverseOrder());
		System.out.println(alist);
	}

}
