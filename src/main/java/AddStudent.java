import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Course;
import entities.Student;

public class AddStudent {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Course c1 = new Course();
		c1.setTitle("Java EE");
		
		Student s1 = new Student();
		s1.setName("Gavin");
		s1.setCourse(c1);
		
		Student s2 = new Student();
		s2.setName("Johnson");
		s2.setCourse(c1);
		
		
		s.save(c1);
		s.save(s1);
		s.save(s2);
		
		s.getTransaction().commit();
		s.close();
		
		sf.close();
	}
}
