import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Student;

public class ListStudents {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		List<Student> students = 
				s.createQuery("from Student").list();
		
		for(Student stud : students)
			System.out.printf("%s  - %s\n", stud.getName(),
					 stud.getCourse().getTitle()); 
		
		s.close();
		
		sf.close();
	}
}
