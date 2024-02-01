package string;

public class StringBufferInJava {

	public static void main(String[] args) {
		String son1 = "Nubaid";
		String son2 = "Nehan";
		String son3 = "Nehan";
		String s = ("This Is Java");
		String st = new String("Nubaid");
		String s2 = new String("This Is Java");
		System.out.println(st.equals(son1));
		StringBuffer bf = new StringBuffer("This Is Java");// concating in buffer
		System.out.println(bf.equals(s));
		bf.append(", " + "This is String buffer.");
		System.out.println(son1);
		System.out.println(bf);
		System.out.println(son2.equals(son3));
		System.out.println(s2.equals(s));
		System.out.println(son2 == son3);
		System.out.println(String.join(",", son1, son2, son3));

	}

}
