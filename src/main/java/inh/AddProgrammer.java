package inh;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Address;
import entities.Job;
import entities.Publisher;

public class AddProgrammer {
	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		JavaProgrammer j = new JavaProgrammer();
		j.setName("Jason");
		j.setFramework("Spring");
		
		PythonProgrammer p = new PythonProgrammer();
		p.setName("Bader");
		p.setIde("PyCharm");
		
		s.save(p);
		s.save(j);
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
}
