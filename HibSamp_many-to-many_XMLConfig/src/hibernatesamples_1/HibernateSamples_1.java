/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesamples_1;

/**
 *
 * @author mahmoud
 */
import entities.Courses;
import entities.Person;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
public class HibernateSamples_1 {
//private SessionFactory sessionFactory;
private static  SessionFactory sessionFactory ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
             Person person =new Person();
             person.setName("Mahmoud Ashraf2");
             
             Person person3 =new Person();
             person3.setName("Mahmoud Ashraf3");
             
             
             Courses cou1 = new Courses();
             cou1.setName("course1");
             cou1.getPersons().add(person);
             cou1.getPersons().add(person3);
           
              Courses cou2 = new Courses();
             cou2.setName("course2");
             cou2.getPersons().add(person);
             cou2.getPersons().add(person3);
             
             person.getCourses().add(cou2);
             person.getCourses().add(cou1);
             
             person3.getCourses().add(cou2);
             person3.getCourses().add(cou1);
             
             
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(cou1);session.save(cou2);
            session.getTransaction().commit();
            session.close();
              System.exit(2);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
              System.exit(2);
            throw new ExceptionInInitializerError(ex);
        }
         
         
         
         
         
         
    }
    
}
