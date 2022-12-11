package Prob1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws UserException {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("User");
        EntityManager em=emf.createEntityManager();
        User u1=new User();
        u1.setUserName("Prateek");
        u1.setEmailId("Prateek!123");
        u1.getP().add(new PhoneNumber(1,"123456799","Home"));
        u1.getP().add(new PhoneNumber(1,"23356999","Office"));
        u1.getP().add(new PhoneNumber(1,"55630603","Landline"));
        User u2=new User();
        u2.setUserName("Nrupul");
        u2.setEmailId("Nrupul!123");
        u2.getP().add(new PhoneNumber(2,"123456799","Home"));
        u2.getP().add(new PhoneNumber(2,"23356999","Office"));
        u2.getP().add(new PhoneNumber(2,"55630603","Landline"));

        em.getTransaction().begin();
        em.persist(u1);
        em.persist(u2);
        em.getTransaction().commit();

        Query q=em.createNamedQuery("abc");
        q.setParameter("name","Nrupul");
        List<User> u=q.getResultList();
        if(u==null){
            throw new UserException("User not Found");
        }else{
            for(User I:u){
                System.out.println(I.getP());
            }
        }
        Query qu=em.createNamedQuery("abc");
        qu.setParameter("name","Albert");
        List<User> ui=qu.getResultList();
        if(ui==null){
            System.out.println("User not Found");
            throw new UserException("User not Found");
        }else{
            for(User I:ui){
                System.out.println(I.getP());
            }
        }


    }

}
