import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Address;
import entities.Job;
import entities.Publisher;

public class AddPublisher {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Publisher p = new Publisher();
		p.setName("Apress");
		Address office = new Address();
		office.setLine1("Line1");
		office.setLine2("Line2");
		office.setCity("Vizag");
        p.setAddress(office);
        
        p.getPhones().add("3934933434");
        p.getPhones().add("9585845855");
        
		s.save(p);
		s.getTransaction().commit();
		s.close();
		
		sf.close();
	}
}
