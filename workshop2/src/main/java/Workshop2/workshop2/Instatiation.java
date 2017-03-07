package Workshop2.workshop2;
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
		Account account = new Account("Nadkinerino","Password123",UserRole.SOME_WORKGUY);
		user.setAccount(account);
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.persist(user);
		
		session.getTransaction().commit();
		
	}
}
