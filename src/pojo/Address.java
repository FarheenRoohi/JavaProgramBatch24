package pojo;

public class Address {
	 String address1;
	 String city;
	 String state;
	 int zip;
    
	public Address(){
		 
	 }
	 public Address(String address1,String city,String state,int zip) {
		 this.address1 = address1;
		 this.city = city;
		 this.state = state;
		 this.zip = zip;
		 
	 }
	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getFullAddress() {
		return address1 + "\n" + city +", " + state + " " + zip;
	}
}
