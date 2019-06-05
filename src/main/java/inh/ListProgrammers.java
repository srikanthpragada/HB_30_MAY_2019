package inh;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ListProgrammers {
	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		List<Programmer> list = s.createQuery("select name, framework from JavaProgrammer").list();
		
		for(Programmer p : list)
			System.out.println(p);
	
		s.close();
		sf.close();
	}
}
