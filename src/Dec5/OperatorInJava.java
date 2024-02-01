package Dec5;

public class OperatorInJava {
   
	public static void main(String[] args) {
		int a = 10; // assignment operator:- =
        System.out.println(a);
        // Arthematic operator:- +,-,*,/,%,++a (pre increment operator),a++(post increment operator)
	                            //  --a(pre decrement operator),a--(post decrement operator)
	    int b = 3;
	    int c = 5;
	    System.out.println(a+b);
	    System.out.println(a-b);
	    System.out.println(a*b);
	    System.out.println(a/b);
	    System.out.println(a%b);
	    System.out.println(++c);//6
	    System.out.println(c++);//6
	    System.out.println(++c);//8
	    System.out.println(c++);//8
	    System.out.println(++c);//10
	    System.out.println(--c);//9
	    System.out.println(c--);//9
	    System.out.println(c); //8
	    //Relational operator:- >,<,>=,<=,==,!=,
	    int p = 25;
	    int h = 35;
	    int r = 25;
	    int g = 20;
	    int i = ++g;
	    System.out.println(p>h);
	    System.out.println(p<h);
	    System.out.println(p>=h);
	    System.out.println(p<=h);
	    System.out.println(p>=r);
	    System.out.println(p<=r);
	    System.out.println(p==h);
	    System.out.println(p==r);
	    System.out.println(p!=h);
	    System.out.println(p!=r);
	    System.out.println(i);
	    
	    
	    
	    
	    
	    
	    
	}

}
