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
             Person person = new Person(),person2=new Person(),person3=new Person(),person4 =new Person();
             person.setName("Mahmoud Ashraf");
             person2.setName("Mahmoud Ashraf2");
             person3.setName("Mahmoud Ashraf3");
             person4.setName("Mahmoud Ashraf4");
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(person);
            session.save(person2);
            session.save(person3);
            session.save(person4);
            session.getTransaction().commit();
            
             org.hibernate.Query q1 = session.createQuery("from Person   where name =? order by name desc"); 
             q1.setFirstResult(0);
             q1.setMaxResults(4);
             q1.setParameter(0,person.getName());
             System.out.println(q1.list().toString());
             
             List <Person> list =q1.list(); 
             for(Person p :list ){
             System.out.println(p.getName());
             }
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
