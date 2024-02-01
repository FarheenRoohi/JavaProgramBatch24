package trycatch;

public class TryCatchInt {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try
		{System.out.println(x/y);}
		catch(Exception e)
		{System.out.println("Exception occures"+e.getMessage());
		e.printStackTrace();
		}

	}

}
