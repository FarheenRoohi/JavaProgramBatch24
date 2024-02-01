package Dec5;

public class StaticBlock {
	 int a = 20; // instance vatiable
	 static int b = 30; // this is a static vriable
     //instance block.
	{
	System.out.println("this is a instance block");
	}
	static {
		System.out.println("this is a static block");
	}
	
	public static void main(String[] args) {
		System.out.println("this is the main start");
		StaticBlock sb = new StaticBlock();
		System.out.println("this is a main end");
		System.out.println("b = "+ b);
		System.out.println("a = "+sb.a);
	}

}
   class Outerclass{
	   
	  class Innerclass {
		void dispay() {  
		    System.out.println("This is a inner display method innerouter class");
		
			
		}
	   
	   class StaticInner{
		   static void show() {
		   System.out.println("this is a static method inner static class ");
		   }
	   }
	   }
	   
   }
   
   
   
   
   
   
   