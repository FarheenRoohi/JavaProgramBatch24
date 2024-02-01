package Dec5;

public class VarieableInJava2 {
     int a = 20; //instance variable
     static int z = 10;//static variable
	public static void main(String[] args) {
		System.out.println(z);
		//System.out.println(a); variable should be static keyword when method is ststic.
		VarieableInJava2 obj = new VarieableInJava2();//object is created for instance variable in static method.
		System.out.println(obj.a);
		int e = 5;
		System.out.println(e);
	}
	// local variable
    void Display() {
      int d = 30;
//    	System.out.println('d');
    	VarieableInJava2 obj = new VarieableInJava2();
    	System.out.println(d);
    	System.out.println(z);
    	System.out.println(obj.a);
    }
}
