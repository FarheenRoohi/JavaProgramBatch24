package pojo;

public class Email {
	String email;
	String emailType;
	Boolean isPrimary;
	public Email() {
		
	}
	public Email(String email,String emailType,Boolean isPrimary) {
		this.email = email;
		this.emailType = emailType;
		this.isPrimary = isPrimary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public Boolean getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
  
}
