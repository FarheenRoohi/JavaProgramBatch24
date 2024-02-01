package dataStructureCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInListInterface {

	public static void main(String[] args) {
		//int a[] = new int[3];
		ArrayList<Object> al = new ArrayList<Object>();
		ArrayList<String> arrl= new ArrayList<String>();
		ArrayList<Integer> arrl2 = new ArrayList<Integer>();
		//List al3= new ArrayList();//creating arraylist object with pareent list interface
		arrl.add("welcome to the class Math");
		arrl.add("welcome to the class English");
		arrl.add("welcome to the class Science");
		arrl.add("welcome to the class Social");
		System.out.println(arrl.size());// define the number of present in  all size.
		al.add("Welcome");
		al.add(123);
		al.add('a');
		al.add(12.90);
		al.add("Class");
		System.out.println("number of elements present"+ " "+al.size());
		al.add(2, " First");
		al.add(5, 123456);
		System.out.println("concatinating the 2 more elements "+al.size());
		System.out.println("elements in array list"+al); //inserting the values in between printing the list
		al.add("School");
		al.add(01, "Group");
		System.out.println("removing the value from list"+al);
		al.remove(1);
		System.out.println("remove the after 1 Group" +al);
		al.remove("Welcome");
		System.out.println("remove the welcome"+al                                         );
				
		//retreive the or get the specific elements.
		//al.get(5);
		System.out.println(al.get(1));
		al.set(0, "set method");
		System.out.println("after replacing old value123 to new value set method"+al);
		//search method == contains.returns boolean
		//al.contains('a');
		//al.contains('b');
		System.out.println(al.contains('a'));
		System.out.println(al.contains('b'));
		System.out.println(al.isEmpty());
				//array list not empty return false
				
				
				

	}

}
