package pojo;

public class LamdaExpression {

	public static void main(String[] args) {
		A obj =() -> 
			System.out.println("hello world"); 
		
		obj.show();
 
	}

}
interface A{
	int a =10;
	void show();
}


