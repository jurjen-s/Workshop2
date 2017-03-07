package Workshop2.workshop2.objects;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {

	@Id @GeneratedValue
	int id;
	int customerId;
	@OneToMany
	Collection<OrderLine> orderLines = new ArrayList<OrderLine>();
	double totalPrice;
	
	public Order(){
		this(0,null,0.0);
	}
	
	public Order(int customerId, ArrayList<OrderLine> orderLines, double totalPrice) {
		this.customerId = customerId;
		this.orderLines = orderLines;
		this.totalPrice = totalPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public void setOrderLines(ArrayList<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
}
