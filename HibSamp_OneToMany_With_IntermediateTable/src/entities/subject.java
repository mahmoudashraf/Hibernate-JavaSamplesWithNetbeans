/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author mahmoud
 */
@Entity
@Table(name="Subjects")

public class subject {
   

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Id
    @GeneratedValue
    private int id; 
    
     @Column(name="SubjectName")
    private String Name  ; 
    
     
     //@ManyToOne(cascade = CascadeType.ALL,mappedBy="msn")
     //@JoinColumn(name="Per_Id")
     /*private Person center ;

    public Person getCenter() {
        return center;
    }

    public void setCenter(Person center) {
        this.center = center;
    }*/
}
