/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mahmoud
 */
@Entity
//@DiscriminatorValue("SubOfBooks")
public class Employee extends Person{
    
   
   
    private String job ;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

  
}
