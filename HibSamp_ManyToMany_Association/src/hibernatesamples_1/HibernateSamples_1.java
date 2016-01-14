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
import entities.Tasks;
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
             person.setName("mahmoudashraf");
             Person person2 =new Person();
             person2.setName("mahmoudashraf2");

            Tasks tsk1 =new Tasks();
          Tasks tsk2 =new Tasks();
           
             tsk2.setName("roolout");
             tsk1.setName("BuildingSites");
   
             
             person.getTasks().add(tsk1);
             person.getTasks().add(tsk2);
             person2.getTasks().add(tsk1);
             person2.getTasks().add(tsk2);
             
             /*tsk1.getPersons().add(person);
             tsk1.getPersons().add(person2);
             tsk2.getPersons().add(person2);
             tsk2.getPersons().add(person);
             */
             
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            
            session.save(person);
            session.save(person2);
             
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

//Notes if ou have not is with generated valueit will  mzke akot of errors in many to many relationship
//duplicate object with the same identifier 
//taje care of targetEntity property -> could not get a field value by reflection getter of entities.Person.Id
//cascade all means i just need to save on of the terminals of th relation  