package mapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HashMapEntry {

	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		//retrive individual one after another using for loop
		m.put(101,"A");
		m.put(102,"E");
		m.put(103,"D");
		m.put(104,"C");
		m.put(105,"A");
		m.put(106,"B");
		System.out.println(m);
		for(Object i :m.keySet()) {
			System.out.println(i);
		}
		for(Object i : m.values()) {
			System.out.println(i);
		}
		//combining both key and value
		for(Object i : m.keySet()) {
			System.out.println(i+"   "+m.get(i));//i = printing key, get method returns the value
		}
		//map(I) has child Entry(I)
		//Entry Method
		System.out.println("How to set to get key and value ussing entrySet Method");
		for(Map.Entry entry : m.entrySet()) {//return all the entries from hashmap 101 A
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		//Using Iterator method getting key and value
		System.out.println("Using Iterator");
		Set s =m.entrySet();      //or Iterator itr = m.entrySet().iterator();
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
		Map.Entry entry = (Entry) itr.next();	
		System.out.println(entry.getKey()+"    "+entry.getValue());
	}
	}
}
