package Dec5;

public class ConstructorString {
       String studentName;
       int studentrollNumber;
	public static void main(String[] args) {
		ConstructorString roohi = new ConstructorString("Roohi",2001);
         roohi.getdata();
         ConstructorString anabia = new ConstructorString("Anabia",2018);
         anabia.getdata();
	}
   
	ConstructorString(String Name,int rollNumber){
		 studentName = Name;
		 studentrollNumber = rollNumber;
		
	}
	void getdata() {
		 System.out.println( " StudentrollNumber = "+studentrollNumber+ " , " +"Studentname = " + studentName);
	}
	
}
