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
             Address add = new Address(); 
             add.setCity("cairo");
             add.setState("fisal");
             
             Address addHome = new Address(); 
             addHome.setCity("cairo");
             addHome.setState("fisal");
             
             person.setName("Mahmoud Ashraf");
             person.setAdd(add);
             person.setHomeAdd(addHome);
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(person);
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

/*

mapping of any object which is property in othr chass  in xml 
will be component  

errors 
Could not determine type for: entities.Address, at table: Person, for columns
 not mapped property in person class 

*/