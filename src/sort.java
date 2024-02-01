
public class sort {

	public static void main(String[] args) {
		int a[]= {11,4,9,20,1,30,4,55,90};
		int temp=0;
		for(int i = 0;i<a.length;i++) {
			//int temp=0;
			for(int j=i;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
					
			}
				
				
		} for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ " ,");
	}  
	
	}

}
