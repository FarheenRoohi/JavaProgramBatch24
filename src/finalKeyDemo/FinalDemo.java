package finalKeyDemo;

public class FinalDemo {
	
	final int a = 20;

	public static void main(String[] args) {
		int b;
		FinalDemo f = new FinalDemo();
		System.out.println(f.a);
		 A a = new A();
		 a.showData();
		 C c = new C();
		 c.display();
		 G g = new G();
		 g.setData();
		 g.getClass();
		 
		 
	}

}
class A{
	final void showData() {
		int a = 10;
		System.out.println(a);
	}
}
//class B extends A{
//	final void showData() {
//
//	}
//}
final class C{
	void display() {
		int b = 30;
		System.out.println(b);
	}
}
//class D extends C{
//	
//}
class E{
	final class F{
	 void playData() 
	 {
		 System.out.println("this is a final class play method");
	 }
	}
	class Z{
		void getData() 
		{
			System.out.println("this is a get data method class z");
		}
	}
}
class G extends E{
	void setData() {
		System.out.println("this is a setdata class g setData method");
	}
	final class F{
		 void playData() {
			 System.out.println("this is a final class play method");
		 }
	}
}





