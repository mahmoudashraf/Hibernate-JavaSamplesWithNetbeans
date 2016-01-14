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
import entities.Employee;
import entities.Engineer;
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
             Employee emp = new Employee();
             emp.setJob("managerial");
             emp.setName("mahmoud monier ");
             Engineer eng  = new Engineer();
             eng.setName("ali ");
             eng.setJob("science ");
             eng.setFunction("rollout");
             
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(person);
            session.save(emp);
            session.save(eng);
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
//@DiscriminatorColumn( name ="inherteType" ,discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("Parent")
it is importatnt in case of same table stratigy only other stratigies doesnot need there elements 


*/