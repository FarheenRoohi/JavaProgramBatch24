package dataStructureCollection;

import java.util.ArrayList;

public class ArrayDemo3 {
	static ArrayList<String> array = new ArrayList<String>();
	
	public static ArrayList<String> addAll(ArrayList<String> a) {
		array.addAll(a);
		return array;
	}

	public static void add(String a) {
		array.add(a);
	}
	
	public static void main(String[] args) {
		//list of strings
		String[] str = {"a", "b", "c", "d", "e"};
		// loops through strings and add it to array list
		for (String string : str) {
			 add(string);
		} 
        System.out.println(array);
     
        ArrayList<String> secondArray = new ArrayList<String>();
        secondArray.add("d");
        secondArray.add("e");
        secondArray.add("f");
        System.out.println(secondArray);
        // addall the arraylist to array 
        addAll(secondArray);
        System.out.println(array);
	}

}
