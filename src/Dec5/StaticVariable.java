package Dec5;

public class StaticVariable {
	int a= 20; 
	 static int b =30;
	 void incriment() {
		 a= a+1;
		 b = b+1;
		 System.out.println(a+" = a ," + b+ "=b"); 
	 }

	public static void main(String[] args) {
		
          StaticVariable sv = new StaticVariable();
          StaticVariable sv1 = new StaticVariable();
          StaticVariable sv2 = new StaticVariable();
          sv.incriment();
          sv1.incriment();
          sv.incriment();
          Staticclass sc = new Staticclass();
          // calling staticclass instance method display and ststic ethod fto other clss.
          sc.display();
          Staticclass.show();
	}

}
