package Dec5;

public class ConstructorPractise {
      String Name ;
	  int Age;
	  String Address;
	
	
	public static void main(String[] args) {
		ConstructorPractise cp = new ConstructorPractise();
		ConstructorPractise cp1 = new ConstructorPractise("Roohi",30,"204 LongView ParkWay SunPrairie.");
		ConstructorPractise cp2 = new ConstructorPractise("Anabia",5,"204 LongView ParkWay SunPrairie.");
		ConstructorPractise cp3 = new ConstructorPractise("Nubaid",14,"204 LongView ParkWay SunPrairie.");
		ConstructorPractise cp4 = new ConstructorPractise("Nehan",12,"204 LongView ParkWay SunPrairie.");
		ConstructorPractise cp5 = new ConstructorPractise("Habeeb",40 ,"204 LongView ParkWay SunPrairie.");
		    cp1.getdata();
            cp2.getdata();
            cp3.getdata();
            cp4.getdata();
            cp5.getdata();
	}
	ConstructorPractise(){
		
	}
	ConstructorPractise(String name,int age,String address){
		Name = name;
		Age = age;
		Address = address;
	}
   void getdata() {
	   System.out.println("Name ="+ Name +" , " +"Age ="+ +Age+" ,"+"Address ="+Address );
	   
   }
}
