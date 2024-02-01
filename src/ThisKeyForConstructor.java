
public class ThisKeyForConstructor {
    
	ThisKeyForConstructor(){
		this(20);
		System.out.println("This is a 0 arg constructor");
	}
	
	ThisKeyForConstructor(int a){
		this(10,20);
		System.out.println("This is a 1 arg constructor");
	}
	ThisKeyForConstructor(int a, int b){
		this(10,30,80);
		System.out.println("This is a 2 args constructor");
	}
	ThisKeyForConstructor(int a,int b,int c){
		
		System.out.println("This is a 3 arg constructor");
	}
	public static void main(String[] args) {
		ThisKeyForConstructor tkc = new ThisKeyForConstructor();
		System.out.println("this is a main method");

	}

}
