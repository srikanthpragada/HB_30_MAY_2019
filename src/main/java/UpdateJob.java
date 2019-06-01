import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class UpdateJob {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Job job = (Job) s.get(Job.class,  "HB_PROG");
		if (job == null)
			System.out.println("Sorry! Job not found!");
		else
		{
			job.setTitle("Hibernate 4 Programmer");
		}
		
		s.getTransaction().commit();
		s.close();
		
		// Object is detached
		job.setTitle("Hibernate 5.4 Programmer");
		
		
		sf.close();
	}
}
