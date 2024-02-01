package Dec5;

public class OperatorInJava2 {

	public static void main(String[] args) {
     //logic opertor:- &&(and),||(or).
		//&& operator (when left and right side is true it return true)
		//|| oerator (when one of the side is true it retun true)
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a<b&&b<c);
		System.out.println(a<b&&b>c);
		System.out.println(a>b&&b<c);
		System.out.println(a>b&&b>++c);
		//|| oerator (when one of the side is true it retun true)
		
		int d = 40;
		int f = 60;
		int g = 70;
		
		System.out.println(d<f||f<g);
		System.out.println(d<f||f>g);
		System.out.println(d>f||f>g);
		System.out.println(d>f||f<g);
		//conditional operator:-?:(when first condition is true it return first if not it return second
		// ex:- h = d>f?d:f
		int h = d>f?d:f;
		int i = d<f?d:f;
		System.out.println(h);
		System.out.println(i);
		
		//Bitwise operator:- & , | , ^(x or operator) <<(left shift),>>(right shift)
		// this operatop perfom on bits
//		1 0001
//		2 0010
//		3 0011
//		4 0100
//		5 0101
//		6 0110
//		7 0111
//		8 1000
		
//		it will return true if both the number are 1 
		System.out.println(3&7);
		// it will return if one of the value is 1
		System.out.println(3|5);
		// it will return if both numbers is not match
		System.out.println(4^7);
		// compound Assignment operator:- +=, -=, *=, /=, %=,
		int m = 30;
		int n = 10;
		int o = 65;
		int p = 25;
		int q = 50;
		m+=2;
		n*=3;
		o%=4;
		p/=2;
		q-=6;
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
	}

}
