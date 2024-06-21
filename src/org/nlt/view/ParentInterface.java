
package org.nlt.view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nlt.services.UserServices;


public interface ParentInterface  
{
 public SessionFactory sesFact=getDatabaseSessionFactory();
 public Session ses=sesFact.openSession();
 
 public LoginFrame loginFrame=new LoginFrame();
 public PersonFrame personFrame=new PersonFrame();
 public CityFrame cityFrame=new CityFrame();
 
 public UserServices userService=new UserServices();
 
 public static SessionFactory getDatabaseSessionFactory() {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        return sf;
    }
 
}
