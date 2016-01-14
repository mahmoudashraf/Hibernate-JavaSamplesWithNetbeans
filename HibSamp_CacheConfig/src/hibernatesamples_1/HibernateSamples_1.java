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
import java.util.List;
import javax.persistence.Query;
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
              Person person2 =new Person();
             person2.setName("Mahmoud Ashraf2");
              Person person3 =new Person();
             person3.setName("Mahmoud Ashraf3");
              Person person4 =new Person();
             person4.setName("Mahmoud Ashraf4");
             
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
          /*  Session session = sessionFactory.openSession();
          session.beginTransaction();
            session.save(person);
           /// session.save(person2);
            //session.save(person3);
            ///session.save(person4);
            session.getTransaction().commit();
            
            Person res1 = new Person();
           
            res1 = (Person)session.load(Person.class, 1);
            System.out.println(res1.getName());

            session.close();
            */
            
            
            
             Session session2 = sessionFactory.openSession();
             session2.beginTransaction();
             org.hibernate.Query query = session2.createQuery("from Person");
             query.setCacheable(true);
             List users = query.list();
             List users2 = query.list();
             List users3 = query.list();
          //session2.beginTransaction();
             session2.close();
          
          /*
            Session session3 = sessionFactory.openSession();
          Person res3 = new Person();

          session3.beginTransaction();
           res3 = (Person)session3.load(Person.class, 1);
            System.out.println(res3.getName());
            
          session3.close();
          
          
                  Session session5 = sessionFactory.openSession();
          Person res5 = new Person();

          session5.beginTransaction();
           res5 = (Person)session5.load(Person.class, 1);
            System.out.println(res5.getName());
            
          session5.close();
          
          
          
                  Session session4 = sessionFactory.openSession();
          Person res4 = new Person();

          session4.beginTransaction();
           res4 = (Person)session4.load(Person.class, 1);
            System.out.println(res4.getName());
            
          session4.close();
          */
          
              System.exit(2);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
              System.exit(2);
            throw new ExceptionInInitializerError(ex);
        }
         
         
         
         
         
         
    }
    
}











