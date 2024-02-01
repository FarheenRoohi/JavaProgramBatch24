package Dec5;

public class ControlFlowStatementSwitchCase {

	public static void main(String[] args) {
		int option = 1;
		int a = 10;
		int b = 30;
     switch(option) {
     case 1: 
    	   System.out.println("Add"+(a+b));
    	   break;
     case 2: 
  	   System.out.println("sub"+(a-b));
  	   break;
     case 3: 
  	   System.out.println("Mul"+(a*b));
  	   break;
     case 4: 
  	   System.out.println("Div"+(a/b));
  	   break;
     case 5: 
  	   System.out.println("Percebtage"+(a%b));
  	   break; 
     }
     
     String BankName = "RBI";
     String HDFC;
     String SBI;
     String ICICI;
    switch (BankName) {
     case" HDFC" :
    	 System.out.println("Welcome to HDFC");
    	 break;
     case" PNB" :
    	 System.out.println("Welcome to PNB");
    	 break;
     case"ICICI" :
    	 System.out.println("Welcome to ICICI");
    	 break;
     case"RBI" :
    	 System.out.println("Welcome to RBI");
    	 break;
     }
      
     int OptionX = 3;
     int z = 30;
     int y = 50;
     switch(OptionX) {
     case 1 : System.out.println("y+z"+(z+y));
              break;
     case 2 : System.out.println("y-z"+(z-y));
              break;        
              
     case 3 : System.out.println("y*z"+(z*y));
              break;  
     case 4 : System.out.println("y/z"+(z/y));
               break;         
              
       default : System.out.println((y+z-y) );       
                 break;
              
     }
     
     
     
     
     
     
     
     
     
     
     
	}

}
