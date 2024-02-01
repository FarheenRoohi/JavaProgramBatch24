package pojo;

public class PhoneNumber {
	String phoneNumber;
	String phoneType;
	boolean isPrimary;
	
	public PhoneNumber() {
	}
	
	public PhoneNumber(String phoneNumber,String phoneType,boolean isPrimary) {
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
		this.isPrimary = isPrimary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public boolean isPrimary() {
		return isPrimary;
	}

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

}
