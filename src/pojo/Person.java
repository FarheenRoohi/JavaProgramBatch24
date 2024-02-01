package pojo;

public class Person {
	
	public String fName;
	public String lName;
	public String mName;
	public String dob;
	public PhoneNumber phoneNumber;
	public Email email;
	public void PhoneNumber() {
		//this.phoneNumber = phoneNumber;
	}

//	public void setPhoneNumber(PhoneNumber phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//	public void getPhoneNumber(PhoneNumber phoneNumber) {
//		return phoneNumber;
	public void Email(Email email) {
		this.email = email;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Address address;
	public String emails;
	
	public String noaddress;
	public Person(String firstName, String lastName, String middleNme, String dob) {
		this.fName = firstName;
		this.lName = lastName;
		this.mName = middleNme;
		this.dob = dob;
	}
	
	public Person(String firstName, String lastName, String middleNme, String dob, Address address) {
		this.fName = firstName;
		this.lName = lastName;
		this.mName = middleNme;
		this.dob = dob;
		this.address = address;
	}
	public Person(String firstName, String lastName, String middleNme, String dob, PhoneNumber phoneNumber,Email email, Address address) {
		this.fName = firstName;
		this.lName = lastName;
		this.mName = middleNme;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setNoAddress(String noaddress) {
		this.noaddress =noaddress;}
	
	public String getPersonDetails() {
		String details = fName + " " + lName + "\n" + dob + "\n" + address+"\n";
		String fullName = " ";
		String homeAdress = " ";
		String noaddress = "-";
		if(mName.isEmpty() ){
			fullName = fName + " " + lName;
			//homeAdress = address+noaddress;
			
		} else {
			fullName = fName + " " + mName + " " +lName;
		}
//		String homeAddress = " ";
//		homeAddress = address;
//		if(address.isEmpty()) {
//			homeAddress = address;
//		} else {
//			homeAddress = " " +address;
//		}
		return details;
	}
	

}
