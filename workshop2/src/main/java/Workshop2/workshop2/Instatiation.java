package Workshop2.workshop2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Instatiation {
	
	public static void main (String[]args){
		
		User user = new User(33, "Henk"," van" , "Stronsom");
		Address address = new Address(33,"Dorpstraat","9283AF","Grunn","Nederland", 12);
		user.setAddress(address);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}
}
