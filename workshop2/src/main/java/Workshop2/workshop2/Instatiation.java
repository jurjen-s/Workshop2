package Workshop2.workshop2;
import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Workshop2.workshop2.objects.Account;
import Workshop2.workshop2.objects.Address;
import Workshop2.workshop2.objects.User;
import Workshop2.workshop2.objects.Bill;
import Workshop2.workshop2.objects.Cheese;
import Workshop2.workshop2.objects.Order;
import Workshop2.workshop2.objects.OrderLine;
import Workshop2.workshop2.objects.UserRole;


public class Instatiation {
	
	public static void main (String[]args){
		
		User user = new User("Henk"," van" , "Stronsom");
		Address address = new Address("Dorpstraat","9283AF","Grunn","Nederland", 12);
		user.setAddress(address);
		Account account = new Account("Nadkinerino","Password123");
		user.setAccount(account);
		
		Cheese cheese = new Cheese(8.88, "cheese", 8);
		OrderLine orderline = new OrderLine(cheese, 10.00, 5);
		
		Collection <OrderLine> orderlineList = new ArrayList<OrderLine>();
		orderlineList.add(orderline);
		Order order = new Order();
		order.setUser(user);
		order.setTotalPrice(20.00);
		order.setOrderLines(orderlineList);
		Bill bill = new Bill(30.00, 1738, "034034275245", order);
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.save(bill);
		
		session.getTransaction().commit();
		System.out.println("Klaar");
		
	}
}
