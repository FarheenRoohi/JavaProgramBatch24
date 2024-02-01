package Dec5;

import pojo.Person;
import pojo.Address;
import pojo.PhoneNumber;
import pojo.Email;
public class PersonDetails {

	public static void main(String[] args) {
		Person person = new Person();
	    PhoneNumber phn = new PhoneNumber(); 
	    Email e = new Email();
		Address a = new Address();
				
		Person personTwo = new Person("Roohi", "Farheen", "", "04/21/1980");
		Person personThree = new Person("Nubaid", "Mohammad", "0", "05/24/2009",new PhoneNumber ("6084719058","Home",true ),new Email("roohihabeeb04@gmail.com","Work",true),new Address("204 longview prkw", "Sun Prarie", "WI", 53590));
		
		person.setfName("Habeeb");
		person.setlName("Mohammd");
		person.setmName("R");
		person.setDob("06/15/1977");
		a.setAddress1("5360 congress ave");
		a.setCity("Madison");
		a.setState("WI");
		a.setZip(53718);
		person.setAddress(a);
		
		System.out.println(person.getPersonDetails());
		System.out.println(personTwo.getPersonDetails());
		System.out.println(personThree.getPersonDetails());
		System.out.println(a.getFullAddress());
		System.out.println(personThree.address.getFullAddress());
		System.out.println(personThree.getPhoneNumber().getPhoneNumber());
		System.out.println(personThree.getPhoneNumber().getPhoneType());
		System.out.println(personThree.getPhoneNumber().isPrimary());
		System.out.println(personThree.getEmail().getEmail());
		System.out.println(personThree.getEmail().getEmailType());
		System.out.println(personThree.getEmail().getIsPrimary()); 
    
	}



}
