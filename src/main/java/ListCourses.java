import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Course;
import entities.Student;

public class ListCourses {
	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		List<Course> courses = 
				s.createQuery("from Course").list();
		
		for(Course course : courses)
		{
			System.out.printf("%s\n", course.getTitle());
			for(Student stud : course.getStudents())
				System.out.printf("%s ", stud.getName());
			
			System.out.println("\n");
		}
		
		s.close();
		
		sf.close();
	}
}
