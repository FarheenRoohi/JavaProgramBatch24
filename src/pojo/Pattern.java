package pojo;

public class Pattern {

	public static void main(String[] args) {
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++)
			{
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++)
			{
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		int n = 10;
		for(int i =0;i<n-1;i++) 
		{
			for(int j=0;j<n-1;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		int m=5;
		for(int i =0;i<5;i++) 
		    {
			
			for(int j=0;j<5;j++)
			{
				if(i==0||i==4||j==0||j==4) {
			System.out.print("*");
			}else
			{System.out.print(" ");
			}
			}
			System.out.println();
		}
		
		    }
	}


