package string;

public class ReverseStrin {

	public static void main(String[] args) {
		String s = "Bank Name Is,Capital One,Sun prairie";
		boolean contains = s.contains("Sun");
		System.out.println(contains);
		String s2 = "Bank one";
		int index =s.indexOf("Name");
		System.out.println(index);
		
		for (int i = s.length() - 1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));
		}
	}
}
