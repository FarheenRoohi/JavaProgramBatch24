package pojo;

public class ReversePatern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
//			for(int j=5;j<=n-i;j++)
//			{
//				System.out.print(" ");
//			}
			for(int s=1;s<=i;s++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
