package Dec5;

public class Forloop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,15,5};
		int b = a[0];
        for(int i=0;i<a.length;i++) {
        	if(a[i] <b) {
      		b = a[i];
        	}
        }
        System.out.println(b);
	}

}
