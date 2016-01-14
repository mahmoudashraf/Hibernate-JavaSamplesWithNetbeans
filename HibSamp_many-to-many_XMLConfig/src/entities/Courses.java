/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.HashSet;
import java.util.Set;
import entities.Person ;

/**
 *
 * @author mahmoud
 */
public class Courses {

   
    
    private int id  ; 
    private String name  ; 

 
   
    
    
    private Set<Person> Persons = new HashSet<Person>();
   
    public Set<Person> getPersons() {
        return Persons;
    }

    public void setPersons(Set<Person> Person) {
        this.Persons = Person;
    }
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
