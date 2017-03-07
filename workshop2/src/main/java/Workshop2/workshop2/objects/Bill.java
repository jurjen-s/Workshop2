package Workshop2.workshop2.objects;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	double totalPrice;
	@OneToOne
	Order order;
	@OneToOne
	User user;
	
	public Bill() {
		this(0.0,null,null);
	}
	
	public Bill(double totalPrice, Order order, User user) {
		this.totalPrice = totalPrice;
		this.order = order;
		this.user = user;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
