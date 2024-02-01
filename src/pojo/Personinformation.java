package pojo;

public class Personinformation {

	String fName ;
	String mName;
	String lName;
	String dob;
	String address;
	String noAddress;
	
	Personinformation(String firstName,String MiddleName,String LastName,String DOB,String Address){
		this.fName = firstName;
		this.mName = MiddleName;
		this.lName = LastName;
		this.dob = DOB;
		this.address = Address;
		
	}
	Personinformation(String firstName,String MiddleName,String LastName,String DOB,String Address,String NoAddress){
		this.fName = firstName;
		this.mName = MiddleName;
		this.lName = LastName;
		this.dob = DOB;
		this.address = Address;
		this.noAddress = NoAddress;
	}
	Personinformation(){
		
	}
	public void getfName(String fName){
		    this.fName = fName;
	}
	public String setfName() {
		return fName;
	}
	
	public void getmName(String mName){
	    this.mName = mName;
}
     public String setmName() {
	     return mName;
}
	public void setlname(String lName) {
		this.lName = lName;
	}
	 public  String getlName(String string) {
		 return lName;
	 }
	public void setdob(String dob) {
		this.dob = dob;
	}
	String getdob(String string) {
		return dob;
	}	
	public void setaddress(String address) {
		this.address = address;
	}
		
	 String getaddress() {
		return address;
	}
	
	void setNoAddress(String noAddress) {
		this.noAddress = noAddress;
	}
	public String getNoAddress() {
		return noAddress;
	}
	public static void main(String[] args) {
		
		Personinformation pi = new Personinformation();
		pi.setdob("");
		pi.setfName();
		System.out.println(pi.getdob("20 April 1980"));
	}
	

}
