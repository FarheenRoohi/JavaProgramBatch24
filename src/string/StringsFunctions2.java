package string;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class StringsFunctions2 {

	class Vehicle {
		String make = "BMW";
		String model = "325i";
		String year = "2006";

		Vehicle() {

		}

		Vehicle(String make, String model, String year) {
			this.make = make;
			this.model = model;
			this.year = year;
		}

		public String fullDescription() {
			return String.join(" ", make, model, year);
		}
	}

	public static void main(String[] args) {

		StringsFunctions2 sf = new StringsFunctions2();
		String s = "Nubaid ";
		String s1 = "Nehan ";
		String s3 = "Habeeb Ur rahman";
		String s4 = "Mohammad";
		String s5 = " ";
		String a = "";
		String a1 = "I want to replace Anabia";
		String a2 = "I want /to Replace /Anabia";
		String z = "204, longview pkwy, Sun Prairie, 53590";
		String s2 = new String("Mohammad");

		StringsFunctions2.Vehicle v = sf.new Vehicle("Honda", "Odyssey EX-L", "2019");
		StringsFunctions2.Vehicle v1 = sf.new Vehicle();
		System.out.println(v.fullDescription());
		System.out.println(v1.fullDescription());
		System.out.println(String.join(", ", v.fullDescription(), v1.fullDescription()));

		System.out.println(s1.concat(s2));
		System.out.println(s3.contains("Rahman"));// return true are false
		System.out.println(s3.contains("rahman"));
		System.out.println(s2.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s.isEmpty());// check string empty or not
		System.out.println(s5.isEmpty());// its not empty space is there
		System.out.println(a.isEmpty());
		// String replace
		System.out.println(a1.replace("Anabia", "Maryam"));
		// equal ignore case
		System.out.println(a1.equalsIgnoreCase(a2));// replace ignored
		System.out.println();
		String array[] = a1.split(" ");// split space
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println(s == s1);
		for (String i : array) {
			System.out.println(i);
		}
		String arrayString[] = z.split(",");
		for (String i : arrayString) {
			System.out.println(i);
		}
		System.out.println(s.indexOf('b'));
	}

}
