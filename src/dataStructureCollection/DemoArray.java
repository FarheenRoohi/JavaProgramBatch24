package dataStructureCollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoArray {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
	    list.add("Roohi");
	    list.add('p');
	    list.add(456);
	    list.add(45.06);
	    //Using for loop
	    System.out.println("Reading the element using for loop");
	    for(int i = 0 ; i <= list.size() -1;i++) {
	    	System.out.println(list.get(i));
	    }
	    //using for each loop
	    System.out.println("reading the element by using for each loop");
	    for(Object e:list) {
	    	System.out.println(e);//Using Object type. e is element
	    }
	    //Using Iterator
	    System.out.println("Reading the elements by using Iterator Method");
	    Iterator it = list.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());//printing the elements and moving to next elements
	    }
	    

	}

}
