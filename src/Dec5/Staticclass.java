package Dec5;

public class Staticclass {

	public static void main(String[] args) {
		Staticclass sc = new Staticclass ();
		sc.display();
		Staticclass.show();

	}
   void display() {
	    System.out.println("this is a display method");
   }
	
	static void show() {
		System.out.println("this is a show method");
	}
	
	
}
