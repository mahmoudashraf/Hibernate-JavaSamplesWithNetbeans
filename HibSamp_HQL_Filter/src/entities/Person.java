/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

/**
 *
 * @author mahmoud
 */

@Filter(name = "bynamed",condition =":bynameflter = id" )
@FilterDef(name="bynamed" ,
        parameters=@ParamDef(name ="bynameflter",type = "int" ))

@Entity
@Table(name="Notes")

public class Person {
    
    @Id
    @GeneratedValue
    private int Id;
    @Column(name="PersonName")
    private String name ;

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
