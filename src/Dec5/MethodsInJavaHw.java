package Dec5;

public class MethodsInJavaHw {

	public static void main(String[] args) {
		MethodsInJavaHw MJHw = new MethodsInJavaHw();
//	int	Total =MJHw.sum(60, 90, 100)+5;      // we can dprint in both way and we can add more
		// value oing like this.
//		System.out.println("Total ="+Total);
		System.out.println(MJHw.sum(9, 8, 8)+3);
		short Total = MJHw.sub(5, 03);
		System.out.println(Total);
		long TotalP = MJHw.plus(35455555, 7867976);
		System.out.println("TotalPlus ="+TotalP );
		double TotalD = MJHw.dble(20.8, 30.9);
		System.out.println("Total Double ="+ TotalD);
		
		 System.out.println("Boolean value = " + boo(10, 5));
		
	}
    // premitive and non primitive data are return type in method.
	//void is not a return type method.
	int sum(int a, int b, int c) {
		return a+b+c;
	
	}
	short sub(int i, int j) {
		short g = (short) (i-j);
		return g;
	}
	
	long plus(int k,int l) {
		int m=k+l;
		return m;
	}
	
	double dble(double d, double e) {
		double s=  d+e;
		return s;
	}
	static boolean boo( int a,int b) {
		boolean c = a>b;
		return c;
		
	}
}
