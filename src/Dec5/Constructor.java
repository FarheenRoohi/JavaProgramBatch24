package Dec5;

public class Constructor {

	public static void main(String[] args) {
		Constructor c = new Constructor();
		
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor(10,60);
		Constructor c3 = new Constructor((short)10);
		Constructor c4 = new Constructor(10.3f);
	}

	Constructor(){
		System.out.println("this is a default constructor");
		System.out.println();
	}
	
	Constructor(int a){
		System.out.println("this is a 1 argument constructor");
		System.out.println("a = "+a);
	}
	
	Constructor(int a, int b){
	 System.out.println("this is a 2 agrs constructor");
	 System.out.println("a = "+a+" ,"+"b = "+b);
	}
	
	Constructor(short a){
	System.out.println("this is a shor 1 args constructor");
	System.out.println("short a = " +(short)a);
	}
	
	Constructor(float a){
		System.out.println("thisis a 1 float agr constructor");
		System.out.println("float a = "+( float )a);
	}
}
