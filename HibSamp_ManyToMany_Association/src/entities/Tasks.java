/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author mahmoud
 */
@Entity
@Table(name="Tasks")
public class Tasks {
    
    @Id
    @GeneratedValue
    private int Id;
    @Column(name="TaskName")
    private String name ;
    @ManyToMany(targetEntity =Person.class)
 
    @JoinTable(
            name="Per_Tsk",
            joinColumns       ={@JoinColumn(name="Tsk_id")},
            inverseJoinColumns ={@JoinColumn(name="Per_id")}
              )
    private List<Person> Persons= new ArrayList<>();
    public String getName() {
        return name;
    }

    public List<Person> getPersons() {
        return Persons;
    }

    public void setPersons(List<Person> Persons) {
        this.Persons = Persons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
}
