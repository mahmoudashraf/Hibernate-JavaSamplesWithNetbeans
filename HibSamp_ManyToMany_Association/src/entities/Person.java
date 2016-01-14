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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.*;

/**
 *
 * @author mahmoud
 */
@Entity
@Table(name="Engineer")
public class Person {
    
    @Id
    @GeneratedValue
    private int Id;
    @Column(name="PersonName")
    private String name ;
    @ManyToMany(cascade = CascadeType.ALL,targetEntity =Tasks.class)
 
    @JoinTable(
            name="Per_Tsk",
            joinColumns       ={@JoinColumn(name="Per_id")},
            inverseJoinColumns={@JoinColumn(name="Tsk_id")}
              )
    
    private List<Tasks> Tasks= new ArrayList<>();

    public List<Tasks> getTasks() {
        return Tasks;
    }

    public void setTasks(List<Tasks> Tasks) {
        this.Tasks = Tasks;
    }
    public String getName() {
        return name;
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
