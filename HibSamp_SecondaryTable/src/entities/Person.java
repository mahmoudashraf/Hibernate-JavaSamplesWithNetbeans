/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/**
 *
 * @author mahmoud
 */
@Entity
@Table(name="Employee")
@SecondaryTable(name="Jobs")
public class Person {
    
    @Id
    private int Id;
    @Column(name="PersonName")
    private String name ;
    @Column(table="Jobs")
    private String Position ;
    @Column(table="Jobs")
    private String Title;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
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
