package string;

public class StringInjava {

	public static void main(String[] args) {
		//String litteral store string cocstent pool;
		//String object store in heap 
		String s="Roohi";
		String s1="roohi";
		String s3="roohi";
		String s4=s.concat("Farheen");
		s=s.concat("parveen");//not concating in string
		System.out.println(s);
		System.out.println(s);
		System.out.println(s1==s3);
		System.out.println(s==s1);
		System.out.println(s4);
		String p = "Maryam";
		//String Object
		String z = new String("Anabia");
		System.out.println(z);
		
		System.out.println(z.concat(" "+p));
		System.out.println(s);

	}

}
