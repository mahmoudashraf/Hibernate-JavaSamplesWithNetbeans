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
import entities.Address;
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
             person.setName("Mahmoud Ashraf");
             Address add =new Address();
             Address AddHome =new Address();
             AddHome.setCity("Sharqia");
             AddHome.setState("Sharqiaminia");
             add.setCity("6october");
             add.setState("Cairo");
             person.setAdd(add);
             person.setAddhome(AddHome);
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
            session.close();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
         
         
         
         
         
         
    }
    
}
