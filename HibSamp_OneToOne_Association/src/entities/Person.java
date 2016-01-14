/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mahmoud
 */
@Entity
@Table(name="doctor")
public class Person {
    
    @Id
    @GeneratedValue
    private int Id;
    @Column(name="PersonName")
    private String name ;
    @OneToOne(cascade = CascadeType.ALL,targetEntity =Mission.class,fetch=FetchType.EAGER)
    private Mission msn ;

    public Mission getMsn() {
        return msn;
    }

    public void setMsn(Mission msn) {
        this.msn = msn;
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
