package mapCollection;

import java.util.HashMap;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		m.put(101,"Roohi");
		m.put(102,"Habeeb");
		m.put(103,"Nubaid");
		m.put(104,"Nehan");
		m.put(106,"Anabia");
		m.put(105,"Roohi");
		System.out.println(m);
		m.put(105, "Farheen");
		System.out.println(m);//dublicate not allowed in key thsts y its replace the value at 105 key farheen value
		m.get(102);//its returns the value of 102
		System.out.println(m.get(103));
		System.out.println(m.values());//returs the set of vales [Roohi, Habeeb, Nubaid, Anabia, Farheen]
		System.out.println(m.keySet());//returns the set of keys [101, 102, 103, 104, 105]
		m.remove(105);
		System.out.println(m);//remove the pair  {101=Roohi, 102=Habeeb, 103=Nubaid, 104=Anabia}
		System.out.println(m.containsKey(106));  
		System.out.println(m.containsKey(108));
		System.out.println(m.containsValue("habeeb"));
		System.out.println(m.containsValue("Habeeb"));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.entrySet());//returs the set of pair eg  105 roohi
		m.replace(106, "maryam");
		System.out.println(m);
      
	

	}

}
