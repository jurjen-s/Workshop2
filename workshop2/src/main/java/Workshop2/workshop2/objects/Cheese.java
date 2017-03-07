package Workshop2.workshop2.objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cheese")
public class Cheese {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	double price;
	String cheeseName;
	int stock;
	
	public Cheese(){
		this(0.0,null,0);
	}
	
	public Cheese(double price, String cheeseName, int stock) {
		this.price = price;
		this.cheeseName = cheeseName;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCheeseName() {
		return cheeseName;
	}
	public void setCheeseName(String cheeseName) {
		this.cheeseName = cheeseName;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
