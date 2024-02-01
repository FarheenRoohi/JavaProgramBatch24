package Inheritance;

public class SimpleInheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.setData();
		obj.showDeta();
		System.out.println("a = "+obj.a+ " , "+ " b = "+ obj.b);
        C objC = new C();
        objC.setData();
        objC.printData();
        System.out.println("a = "+ obj.a + " ,"+ "c  ="+ " "+objC.c );
	}
    
}
class A{
	int a =20;
	void setData() {
		System.out.println("This is a parent class A ="+a);
	}
}
class B extends A{
	int b = 30;
	void showDeta() {
		System.out.println("This is a child class b ="+b);
	}
}
class C extends A{
	int c = 10;
	void printData() {
		System.out.println("this C is another chid class C"+ c );
	}
}