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
import org.eclipse.persistence.internal.oxm.schema.model.Restriction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;
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
            
             
             Criteria q1 = session.createCriteria(Person.class);
             Criteria max  = q1.setProjection(Projections.max("id"));
             System.out.println("max"+max.list().toString());
             
             
             //getting named query from person entity  
             org.hibernate.Query que  =  session.getNamedQuery("getperson"); 
             que.setString(0,"1");
             List <Person> list =que.list(); 
             for(Person p :list ){
             System.out.println("from named query "+p.getName());
             }
                     
             
             /*
             q1.setFirstResult(0);
             q1.setMaxResults(4);
             q1.addOrder(Order.desc("id"));
             q1.add(Restrictions.between("id", 1, 2));
             
             Criterion cer = Restrictions.eq("id", 2);
             Criterion cer2 = Restrictions.eq("id", 3);
             LogicalExpression or  = Restrictions.or(cer, cer2);
             q1.add(or);
             
             System.out.println(q1.list().toString());
             
             List <Person> list =q1.list(); 
             for(Person p :list ){
             System.out.println(p.getName());
             }*/
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
