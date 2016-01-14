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
import entities.Person;
import entities.subject;
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
             
             subject sub1 =new subject();
             subject sub2 =new subject();
             sub1.setName("arabic");
             sub1.setPerson(person);
             sub2.setName("arabic2");
             sub2.setPerson(person);
             
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(sub1);
            session.save(sub2);
            session.getTransaction().commit();
            session.close();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
         
         
         
         
         
         
    }
    
}


/*
it there is any other propertty in calss which type is object  
it will generate error unless you map it to specifuc relation  

you are saving what you have changed 


*/