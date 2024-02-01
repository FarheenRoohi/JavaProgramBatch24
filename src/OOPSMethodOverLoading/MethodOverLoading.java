package OOPSMethodOverLoading;

public class MethodOverLoading {
	
	public int add(int a,int b ) {
		return a+b;
	}
	public double add(float a, float b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		MethodOverLoading ml = new MethodOverLoading();
		ml.add(10, 40);
		int print = ml.add(10, 40);
		ml.add(10.5f, 20.50f);
		double result = ml.add(0.5f, 4.0f);
		System.out.println(ml.add(10, 20));
		System.out.println(ml.add(5.5f,5.0f));
		System.out.println(result);
		System.out.println(print);
		System.out.println();
		Login rbi = new Login();
		rbi.loginForm();
		NewLogin sbi = new NewLogin();
		sbi.loginForm();
	}
}
//overriding
 class Login{
	 void loginForm() {
		 System.out.println("this is userName");
		 System.out.println("this is a userPassword");
		 System.out.println("this is a submitButton");
		
	 }
 }
 
 class NewLogin extends Login{
	 void loginForm() {
		 System.out.println("this is userName");
		 System.out.println("this is userPassword");
		 System.out.println("this is a phoneNumber");
		 System.out.println("this is a submitButton");
		
		 System.out.println("this is new login deta");
	 }	 
 }
 
 
 
 