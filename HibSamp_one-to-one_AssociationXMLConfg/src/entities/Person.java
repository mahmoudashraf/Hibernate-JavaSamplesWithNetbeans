/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;


/**
 *
 * @author mahmoud
 */

public class Person{
    
   
    private int Id;
  
    private String name ;
    
    private Address add ;

   
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
