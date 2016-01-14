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
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import entities.Mission;
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
             Mission msn = new Mission();
             msn.setName("helping others");
            person.setMsn(msn);
            
            Person person2 =new Person();
             person2.setName("Mahmoud Ashraf");
             Mission msn2 = new Mission();
             msn2.setName("helping others");
            person2.setMsn(msn2);
            
            
            Person person3 =new Person();
             person3.setName("Mahmoud Ashraf");
             Mission msn3 = new Mission();
             msn3.setName("helping others");
            person3.setMsn(msn3);
            
            
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(person);
             session.save(person2);
              session.save(person3);
          
            
            person=(Person)session.get(Person.class, 5);
            Mission msn4 = new Mission();
            
            msn4=(Mission)session.get(Mission.class, 3);
            
             System.out.println(person.getMsn().getName());
               System.out.println(msn4.getPerson().getName());
               
               
               person.setName("ali hel ");
               person.setMsn(msn4);
               session.update(person);
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
