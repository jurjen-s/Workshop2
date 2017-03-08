package Workshop2.workshop2.objects;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ordertable_that_works")
public class Order {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne (cascade = {CascadeType.ALL})
	private User user;
	@OneToMany (cascade = {CascadeType.ALL})
	Collection<OrderLine> orderLines = new ArrayList<OrderLine>();
	private double totalPrice;
	
	public Order(){
		this(null,null,0.0);
	}
	
	public Order(User user, ArrayList<OrderLine> orderLines, double totalPrice) {
		this.user = user;
		this.orderLines = orderLines;
		this.totalPrice = totalPrice;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setOrderLines(Collection<OrderLine> orderLines) {
		this.orderLines = orderLines;
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
	public Collection<OrderLine> getOrderLines() {
		return orderLines;
	}

}
