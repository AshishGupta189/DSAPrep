package evaluation;

import java.util.List;

import Dao.DaoImpl;

public class showalldetails {
public static void main(String[] args) {
	DaoImpl dao = new DaoImpl();
	
	System.out.println(dao.deptdetails()); ;
}
}
