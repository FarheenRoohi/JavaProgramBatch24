package string;

public class StringFunction3 {

	public static void main(String[] args) {
		String aa = "10";
		String bb = "true";
		Integer in = 10;
		Boolean cc = false;
		String c = "202.06";
		String s = " This is java ";
		String s1 = "THIS IS JAVA";
		String s3 = "This is java and";
		String s2 = "this is a string function in java";
		String h = "204,long view,parkway";
		String f = "204/longview/parkway";
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		System.out.println(sb);
		System.out.println(s2.replace("function", "Method"));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.toLowerCase().equals(s1.toLowerCase()));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s3));
		String arrayofString[] = { "this is a string method in java" };
		for (int i = 0; i <= arrayofString.length - 1; i++) {
			System.out.println(arrayofString[i]);
		}
		for (String i : arrayofString) {
			System.out.println(i);
		}

		String a[] = h.split(",");
		for (String i : a)
			System.out.println(i);

		String b[] = f.split("/", 3);
		for (String i : b)
			System.out.println(i);
		System.out.println(s.indexOf("v"));
		System.out.println(s.indexOf("i", 3));
		System.out.println(h.indexOf("long view", 0));
		System.out.println(s.trim());
		String str = String.valueOf(in);
		System.out.println(str);
		System.out.println(Integer.valueOf(aa));
		System.out.println(Boolean.valueOf(bb));
		System.out.println(cc.toString());
		System.out.println(s1.toLowerCase());
		System.out.println(s.toLowerCase().equals(s1.toLowerCase()));
		System.out.println(s2.toUpperCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}

}
