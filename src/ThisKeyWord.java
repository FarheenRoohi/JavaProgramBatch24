
public class ThisKeyWord {
	
	int a;
	int b;

	public static void main(String[] args) {
		ThisKeyWord tkw = new ThisKeyWord();
		tkw.setData(20,30);
		tkw.getData();
        
	}
   void setData(int a,int b) {
	   
	   this.a = a;
	   this.b = b;
	   this.getData();//with this we can invoke the current class method implicetly.
	   this.getData();
	   getData();//compiler will take care no need to be
   }
   void getData() {
	   System.out.println("a = "+a+", "+"b = "+b+",");
	   
   }
}
