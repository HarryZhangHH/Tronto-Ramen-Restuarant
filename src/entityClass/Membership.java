package entityClass;
/**
 * @title:Membership.java
 * @author group63
 * @version V4.3
 * @description:An Entity class: store the basic information of a membership
 */

public class Membership extends Customer{
	private String id;
	private String firstname;
	private String surname;
	private String email;
	private String phoneNo;
	private String password;

	/**
	 * @param id id of customer
	 * @param password password of customer
	 * @param firstname firstname of customer
	 * @param surname surname of customer
	 * @param phoneNo phoneNo of customer
	 * @param email email of customer
	 */
	public Membership(String id, String password, String firstname, String surname, String phoneNo, String email) {
		this.id=id;
		this.firstname=firstname;
		this.surname=surname;
		this.email=email;
		this.phoneNo=phoneNo;
		this.password=password;

	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	

}
