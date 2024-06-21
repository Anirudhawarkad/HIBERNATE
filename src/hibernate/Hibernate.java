
package hibernate;



import org.nlt.view.ParentInterface;


public class Hibernate implements ParentInterface
{

    
    public static void main(String[] args) 
    {
        ses.beginTransaction();
        ses.getTransaction().commit();
        
        loginFrame.setVisible(true);
    }
}