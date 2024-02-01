package Dec5;

public class ControlFlowStatementForLoop {

	public static void main(String[] args) { //for loop
		for(int i = 0;i<=10;i++) {
		System.out.print(i+" = ");
		
		 for(int j=1;j<=5;j++) {//inner for loop
			System.out.print(j+" "); 
		 }
		 System.out.println(",");
		}
		for(int i=1;i<=9;i++) {
			System.out.print(i+" = ");
			for(int j=0;j<=5;j++) {
			System.out.print(j+" ");	
			
			}
			System.out.println();
		}
//		int j = 3;
//		for(int i = 1;i<=10;i++) {
//			
//			System.out.println(i +"=" + i*j);
//		}
//		
//		int m = 2;
//		for(int n = 1;n<=10;n++) {
//			System.out.println(( n*m));
//		}
//		int p = 5;
//		int factorial = 1;
//		for(int i = p; i>=2;i--) {
//			factorial = factorial *i;
//			System.out.println("factorial = " +factorial);
//		}
		
	}

}
