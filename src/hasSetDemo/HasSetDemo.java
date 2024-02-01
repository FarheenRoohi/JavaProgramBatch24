package hasSetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();//without initial value (default 16)
		//HashSet hs = new HashSet(100);//initial value is defined 100 still load factor/fill ratio is o.75(default HashSet value is 16 annd fill ratio is 0.75)
		//HashSet hs = new HashSet(110,0.09);//here  initial value is 110 and load factor is 0.09
		//HashSet<Integer> hs = new HashSet<Integer>();	
		HashSet<Object> hs = new HashSet<>();
		hs.add(29);
		hs.add(56);
		hs.add(true);
		hs.add("acf");
		hs.add(null);
		System.out.println(hs);
		hs.remove(56);
		HashSet<Object> hs1 = new HashSet<>();//initial capacity
		//HashSet hs2 = new HashSet(100);//initial capacit6y
		hs1.add("Java");
		hs1.addAll(hs);
		System.out.println(hs1);
		System.out.println(hs1.contains("Java"));
		System.out.println(hs1.contains("Welcome"));
		hs1.removeAll(hs);
		System.out.println(hs1);
		System.out.println(hs1.isEmpty());
		//for each loop using to read object ,we cant use for loop inhashset
		for(Object e:hs) {
			System.out.println(e+" "+"for each method");
		}
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+ " "+" iterato method");
		}

	}

}
