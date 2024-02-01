package Dec5;

public class ControlFlowStatement {

	public static void main(String[] args) {
     int a = 17;
     int b = 18;
     if(a>=18) {
      System.out.println("eligible to vote");
     }
     else {
    	System.out.println("not eligible to vote"); 
     }
     if(b>=18) {
    	 System.out.println("eligble to vote");
     }
     else {
    	 System.out.println("not eligle to vote");
     }
     int d = 13;
     int e = 15;
     int f = 20;
     if(d>=e&&d>=f) {
    	 System.out.println("d is greater");
     }
     else if(e>=f && e>=d) {
    	 System.out.println("e is greater");
     }
     
     else {
    	 System.out.println(" f is greater");
     }
     
     int g = 20;
     int h = 30;
     int i = 10;
     if(g>=h && g>=h) {
    	 System.out.println("g is greater");
     }
     else if(h>=f&&h>=d) {
    	 System.out.println("h is greater");
     }
     
     else {
    	 System.out.println(" i is greater");
     }
     
     if(d>=e || d>=f) {
    	 System.out.println("d is greater");
     }
     else if(e>=f || e>=d) {
    	 System.out.println("e is greater");
     }
     
     else {
    	 System.out.println(" f is greater");
     }
     
     
     
     
	}

}
