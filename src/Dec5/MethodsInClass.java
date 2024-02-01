package Dec5;

public class MethodsInClass {

	public static void main(String[] args) {
		MethodsInClass  mc = new MethodsInClass ();
		mc.sum(30, 600);
		mc.nameAge("Nubaid",14);
        System.out.println(mc.getFullName("habeeb", "    ", "mohammad"));
	}
     void sum (int a, int b) {
    	 int c =a+b;
    	 System.out.println(c);
     }
     void nameAge(String Name, int age) {
    	 System.out.println("Name = "+Name+ " ,"+" Age = "+age +" years old");
     }
     String getFullName(String fName,String mName, String lName) {
    	 String fullName = "";
    	 if(mName.isBlank()) {
    		fullName = fName + " " + lName;
    	 } else {
    		 fullName = fName + " " + mName + " "+ lName;
    	 }
//    	 String fullName =  fName + " " + mName  + " "+ lName;
    
    	 return fullName;
     }
}
