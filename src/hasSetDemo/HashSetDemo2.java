package hasSetDemo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(5);
		System.out.println(hs+" = set 1");
		HashSet hs1 = new HashSet<>();
		hs1.add(3);
		hs1.add(7);
		hs1.add(5);
		hs1.add(9);
		System.out.println(hs1+" = set2");//union
		//hs1.addAll(hs);
		//System.out.println(hs1+" "+"= union result");
		//hs1.retainAll(hs);
		//System.out.println(hs1);//intersection common number present in both hs and hs1
		//System.out.println(hs1.containsAll(hs));//subset
		hs1.removeAll(hs);
		System.out.println(hs1);//difference

	}

}
