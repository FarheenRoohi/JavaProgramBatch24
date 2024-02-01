package string;

public class StringAll {

	private static int i;

	public static void main(java.lang.String[] args) {
		String s = new String();
		String s1 = new String("Roohi");
		StringBuffer sb = new StringBuffer("String Buffer");
		String s3 = new String(sb);
		String s4 = new String(s1);
		System.out.println(s3);
		System.out.println(s4);
		String r = "reverse";
		String p = "level";
		for (int i = p.length ()- 1; i >= 0; i--) {
			System.out.println(p.charAt(i));
		}
		for (int i = r.length() - 1; i >= 0; i--) {
			System.out.println(r.charAt(i));
		}
		String a ="level";
		String reverse = "level";
		System.out.println(a.equals(reverse));
		String b = " up";
		System.out.println(a.concat(b));
		String name = "Nehan  Mahammad Rahman";
		String arr[]={"Nehan"," Rahman","Mohammad"};
		System.out.println(arr[2]+" "+arr[0]+" "+arr[1]);

	}

};
