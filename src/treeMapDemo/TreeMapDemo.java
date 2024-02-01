package treeMapDemo;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap mp = new TreeMap<>();
		mp.put(103, "roohi");
		mp.put(104, "farheen");
		mp.put(106, "parveen");
		mp.put(108, 30);
		mp.put(109, "abc");
	    System.out.println(mp);
	   // System.out.println(mp.descendingMap());
	    NavigableMap<Integer,Object> nm = mp.descendingMap();
	    System.out.println(nm);

	}

}
