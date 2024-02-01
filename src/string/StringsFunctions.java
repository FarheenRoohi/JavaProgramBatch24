package string;

public class StringsFunctions {
	//methods

	public static void main(String[] args) {
		String arr[] = {"abc", "def "};
		String s = "myHome";
		String s1 = new String("myHome");
		String s2 = "my home is in sun prairie";
		System.out.println(s==s1);//string object is comparing
		System.out.println(s.equals(s1));// comparing string object value what it is contains
		 //String methods name or function    description
		//char charAt(int index)              it return cha value for particular index
		s.charAt(1);
		System.out.println(s.charAt(1));
		System.out.println(s.length());//show length
		System.out.println(s.substring(4));
		System.out.println(s2.substring(03, 7));
		
		String fName = "Nubaid";
		String mName = "Ur Rahaman";
		String lName = "Mohammad";
		System.out.println(String.join(" ",fName,mName,lName));//giving space in between and not printing comma at the end

		System.out.println(arr[0]);
		for(String i: arr) {
			System.out.println(i);
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		String a[]= {"My","Name","Is","Roohi"};
		for(String j : a) {
			System.out.print(j+" ");
		}
		
	}

}
