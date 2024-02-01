package pojo;

public class Array {

	public static void main(String[] args) {
//		int []a = {4,6,8,10,2};
//		for(int i =0;i<=3;i++) {
//			System.out.println(a[i]);
//		}
//		int b[]=new int[] {20,30,7,9,80};//dessending order
//		for(int i=0;i<b.length;i++) {
//			for(int j=i+1;j<b.length;j++) {
//				if(a[i]>a[j]) {
//					int temp;
//					 temp =a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//				}
//			}System.out.print(a[i]+" ,");
//		}
		int c[] = new int[] {40,80,59,30};
		for(int i =0;i<c.length;i++) {
			int max =c[1];
//			if(c[i]<max) {
//				max = c[i];
//				
//			}
//			for(int j =1;j<c.length;j++) {
					 if(c[i]>max) {
						 max=c[i];
						 c[i]=max;
						 
					 
						 //System.out.println(max+"max");		 
				
					 }System.out.println(max+"max");
		}
		
		
		
	}
}
