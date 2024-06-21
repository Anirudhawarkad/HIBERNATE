
package org.nlt.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import sun.security.util.Password;
@Entity
public class Users 
{ 
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Password;
    private String email;
    private String name;
    private int age;
    private long phone;
    private int status;
    @Temporal(TemporalType.DATE)
    private Date created;
     @Temporal(TemporalType.DATE)
     private Date modified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public String getPassword(){
       return Password;
    }
   public void setPassword(String password){
       this.Password = password;
   }
   public String getEmail(){
       return email;
   }
   public String setEmail(String email) {//
     this.email = email;
        return email;
   }
   
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}

     
    


    

