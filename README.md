# Hibernate-JavaSamplesWithNetbeans
These samples are representing the core features of hibernate framework 
it was built with java and netbeans  
Installation Steps : 
1-Modify "hibernate.cfg.xml" file in src folder in each sample to be able to run it  -

a-if you use mysql database donot change this property 
<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>

b-change host and port and database name to your owen   
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/sakila?zeroDateTimeBehavior=convertToNull</property>

c-change username  
<property name="hibernate.connection.username">root</property>

d-change password 
<property name="hibernate.connection.password">123</property>

