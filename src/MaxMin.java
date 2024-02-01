
public class MaxMin {

	public static void main(String[] args) {
		
     int a[]= {20,50,25,70};
     int max = a[0];
     for(int i=0;i<a.length;i++) {
    	 for(int j=i;j<a.length;j++) {
    		 if(a[i]<max) {
    			max =a[i];
    			
    		 }
    	 } 
     
	}System.out.println(max);}

}
