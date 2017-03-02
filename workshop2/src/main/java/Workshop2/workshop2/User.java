package Workshop2.workshop2;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import main.Account;


@Entity
@Table (name = "user_details")
public class User {
	@Id @GeneratedValue
	private int id;
	@Embedded
	private Address address;
	@Transient
	private Account account;
	private String firstName;
	private String middleName;
	private String lastName;

	public User() {
		this(0, null, null, null, null, null);
	}
	
	public User(int id, String firstName, String middleName, String lastName) {
		this(id, firstName, middleName, lastName, null, null);
	}
	
	public User(int id, String firstName, String middleName, String lastName, Account account, Address address) {
		this.id = id;
		this.account = account;
		this.address = address;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String newMiddleName) {
		middleName = newMiddleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
