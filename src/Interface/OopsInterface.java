package Interface;

public class OopsInterface {

	public static void main(String[] args) {
		B b = new B();
		b.getData();
		b.setData();
		C c= new C();
		c.displaydata();
		c.printData();
	}

}
interface  A{
	int a = 30;
	int b = 40;
	void setData();
	void getData();
}

 class B implements A{

	@Override
	public void setData() {
		System.out.println(a);
		
	}

	@Override
	public void getData() {
		System.out.println(b);
	}
 }
 interface D{
	 int a = 15;
	 void displaydata(); 
 }
 interface M extends D{
	 int b = 10;
	 void printData();
 }
 class C implements M{

	@Override
	public void displaydata() {
		System.err.println(a);
		
	}

	@Override
	public void printData() {
		System.out.println(b);
		
	}
	 
 }
	
	

	
