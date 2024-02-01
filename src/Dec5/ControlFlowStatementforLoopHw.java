package Dec5;

public class ControlFlowStatementforLoopHw {

	public static void main(String[] args) {
		int p = 3;
		for(int q = 1; q<=10; q++ ) {
		System.out.println("3*"+q+" = "+  q*p);
	}
		int j = 2;
		for(int k = 0; k<=10; k++) {
			System.out.println((k+j++));
		}
		int n = 5;
		int factorial = 1;
		for(int m = n; m>=2; m--) {
			factorial = factorial *m; 
			System.out.println("Factorial ="+factorial);
		}
		int l = 30;
		for(int k = 0; k<=10; k++) {
			System.out.println((k+l));
			
		}
				
  }

}
