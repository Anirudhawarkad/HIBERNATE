package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.nlt.model.Users;
import org.nlt.view.ParentInterface;

public class UserServices implements ParentInterface{
    public boolean saveUser(Users user)
    {
        ses.beginTransaction();
        ses.save(user);
        ses.getTransaction().commit();
        return true;
    }
    public Users getUser(String username,String password)
    {
        try
        {
           ses.beginTransaction();
            Query query = ses.createQuery("from Users where email='"+username+"' and password='"+password+"' and status="+1);
            List<Users> list = query.list();
            return list.get(0);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        
    }
}
