package Abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		newUserName nu = new newUserName();
//		nu.getData();
//		nu.setdata();
//		nu.addUser("Nehan","UR","Mohammad","608-471-9058");
//		nu.addUser("Nubaid","UR","Mohammad","608-471-9058","204 long view prkw, sun prairie");
		
	}

}
abstract class userName{
	 abstract void addUser(String firstName,String middleName,String lastname,String mobileNumber); {
	}  	abstract void setdata();
	void getData() {
		System.out.println("This is a normal mwthod");
	}
	userName(){
		System.out.println("this is a username constructor");
	}
	userName(int a){
		System.out.println("this is a 1 argument constructor");
	}
}
class newUserName extends userName{
	newUserName(){
		super();
	}
	newUserName(int a){
		super(a);
		System.out.println("this is a 1 ars");
	}

	@Override
	void setdata() {
		System.out.println("This is a abstract methos");
		
	}

	@Override
	void addUser(String firstName, String middleName, String lastName, String mobileNumber) {
		System.out.println("User firstName ="+firstName+", "+"User middleName ="+middleName+", "+"UserlastName =" +lastName+"MobileNumbe ="+mobileNumber);
		
	}
	void addUser(String firstName, String middleName, String lastName, String mobileNumber,String userAddress) {
		System.out.println("User firstName ="+firstName+", "+"User middleName ="+middleName+", "+"UserlastName =" +lastName+"MobileNumbe ="+mobileNumber+ ", "+"UserAdrress ="+ userAddress);
		
	}
	
}