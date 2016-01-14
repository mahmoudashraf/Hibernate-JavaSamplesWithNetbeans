/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mahmoud
 */
@Entity
@Table(name="Creation")
public class Person {
    
    @Id
    private int Id;
    @Column(name="PersonName")
    private String name ;
    @Embedded
    private Address add; 
@Embedded
@AttributeOverrides({
             
             @AttributeOverride(name="State",column=@Column(name="StateHome")),
             @AttributeOverride(name="City",column=@Column(name="CityHome"))
})
 
    private Address addhome; 

    public Address getAddhome() {
        return addhome;
    }

    public void setAddhome(Address addhome) {
        this.addhome = addhome;
    }
     
    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
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
