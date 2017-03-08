package Workshop2.workshop2.objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Bill")
public class Bill {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	double totalPrice;
	int pinCode;
	String accountNumber;
	@OneToOne (cascade = {CascadeType.ALL})
	Order order;
	
	public Bill() {
		this(0.0,0,null,null);
	}
	
	
	public Bill(double totalPrice, int pinCode, String accountNumber, Order order) {
		super();
		this.totalPrice = totalPrice;
		this.pinCode = pinCode;
		this.accountNumber = accountNumber;
		this.order = order;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
}
