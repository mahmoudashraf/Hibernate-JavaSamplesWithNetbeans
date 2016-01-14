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
             
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(person);
            session.save(person2);
            session.getTransaction().commit();
            session.close();
            
               Session session2 = sessionFactory.openSession();
            session2.beginTransaction();
              
            
            
               org.hibernate.Query q2 =  session2.createQuery("update Person p set p.name=:n ,p.ver=:v "+" where p.id=:id and p.ver=:e");
            q2.setString("n", "dff2");
            q2.setString("v", "1");
            q2.setString("id","1");
            q2.setString("e","0");
            q2.executeUpdate();
            
            
             org.hibernate.Query q =  session2.createQuery("update Person p set p.name=:n ,p.ver=:v"+" where p.id=:id and p.ver=:e ");
            q.setString("n", "dff");
            q.setString("v", "1");
            q.setString("id","1");
            q.setString("e","0");
            q.executeUpdate();
             
           
            
            
         
            
            
            
            session2.getTransaction().commit();
             session2.close();
            
            
            
            
              System.exit(2);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
              System.exit(2);
            throw new ExceptionInInitializerError(ex);
        }
         
         
         
         
         
         
    }
    
}
