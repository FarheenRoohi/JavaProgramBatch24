package Dec5;

public class MethodsInjava {

	public static void main(String[] args) {
		MethodsInjava MJ = new MethodsInjava();
		//System.out.println(MJ.sum(50, 60)); or
	//	int Total = MJ.sum(50, 80);
//		if you want to add mre value the it should write in
		int Total = MJ.sum(50, 80)+20;
		System.out.println(Total);
	}
// return type // fully reusable method
	int sum(int a,int b) {
		int c = a+b;
		return c;
		
	}
	
}
