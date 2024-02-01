package Abstraction;

public class Demo {

	public static void main(String[] args) {
		NewUser nu =new NewUser();
		nu.adduser("roohi");
		nu.editUser("farheen");
		nu.deleteUser1("");

	}

}
interface User{
	int a=10;
	void adduser(String addUser );
	void editUser(String edtUser);
	void deleteUser1(String deleteuser);
			
}
class NewUser implements User{

	@Override
	public void adduser(String addUser) {
		System.out.println("this is Add user");
		
	}

	@Override
	public void editUser(String editUser) {
		
		System.out.println("this is edituser");
	}

	@Override
	public void deleteUser1(String deleteUser) {
		System.out.println("this is deleteuser");
		
	}

	
	
}