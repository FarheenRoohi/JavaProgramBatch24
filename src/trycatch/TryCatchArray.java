package trycatch;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TryCatchArray {

	public static void main(String[] args) {
		int []a= {34,56,70,90};
		
		for(int i=0;i<a.length;i++)
		{
			try
			{
		System.out.println("this is a try block"+100/a[i]);
		}
			catch(Exception e) {
				System.out.println("this is a catch block" +a[i]);
				
			}
			
		}
		int b[]= {1,4,7,9,100,0};
		for(int j=0;j<9;j++)
		{try
		{System.out.println(b[j]/20);
		}
		catch(Exception e) {
			System.out.println(b[j]);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
  
	}

}
