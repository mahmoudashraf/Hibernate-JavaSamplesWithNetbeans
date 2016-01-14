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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import static org.hibernate.internal.util.collections.CollectionHelper.arrayList;

/**
 *
 * @author mahmoud
 */
@Entity
@Table(name="teacher")
public class Person {
    
    @Id
    @GeneratedValue
    private int Id;
    @Column(name="PersonName")
    private String name ;
    
       @OneToMany(cascade = CascadeType.ALL,targetEntity =subject.class,fetch=FetchType.EAGER)
 
    @JoinTable(
            name="Per_Sub",
            joinColumns       ={@JoinColumn(name="Per_id")},
            inverseJoinColumns={@JoinColumn(name="Sub_id")}
              )
    private List<subject> sub = new ArrayList<>(); 

    public List<subject> getSub() {
        return sub;
    }

    public void setSub(List<subject> sub) {
        this.sub = sub;
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
