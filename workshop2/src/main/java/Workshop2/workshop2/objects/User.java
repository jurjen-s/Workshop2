package Workshop2.workshop2.objects;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name = "user_details")
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Embedded
	private Address address;
	@OneToOne(cascade = {CascadeType.ALL})
	private Account account;
	//private UserRole userRole;
	private String firstName;
	private String middleName;
	private String lastName;
	@Transient
	private Collection<Order> orderList = new ArrayList<>();
	
	public User() {
		this(null, null, null, null, null);
	}
	
	public User(String firstName, String middleName, String lastName) {
		this(firstName, middleName, lastName, null, null);
	}
	
	public User(String firstName, String middleName, String lastName, Account account, Address address) {
		
		this.account = account;
		this.address = address;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}

	public Collection<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(Collection<Order> orderList) {
		this.orderList = orderList;
	}

	public void setId(int id) {
		this.id = id;
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
