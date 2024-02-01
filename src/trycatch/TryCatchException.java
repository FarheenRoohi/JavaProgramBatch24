package trycatch;

public class TryCatchException {

	public static void main(String[] args) {
		int f[]= new int[] {1,3,60};
		int a =  10;
 
		System.out.println("before exceptin");
		
		try{
			int b = a/0;
			for(int i=0; i>=f.length;i++) {
				System.out.println(f[i]);
				System.out.println("hello");
			}
			
		}
		catch( Exception e) {
			int b = a/2;
		    System.out.println(b);
			System.out.println(a);
			for(int i=0;i<=f.length;i++) {
				System.out.println(f[i]);
				e.printStackTrace();
				System.out.println(e.getMessage());
		}
		
				
	}
		int []num = {39,45,70,12};
		try
		{ for(int i=0;i<num.length;i++) {
			System.out.println(100/num[i]+"Exception occure for");
		}
		}
		catch(Exception e) {
			System.out.println("exception occcure+num[i");
		}
			
  }
}
