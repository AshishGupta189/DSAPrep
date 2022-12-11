package Problem2.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class emutil {

    private  static EntityManagerFactory emf;

    static {
        emf= Persistence.createEntityManagerFactory("User");
    }

    public static EntityManagerFactory providec(){
        return emf;
    }

}
