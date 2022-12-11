package Problem2.Usecase;

import Problem2.Dao.DAO;
import Problem2.Dao.DaoImpl;
import Problem2.Exceptions.StudentException;

import java.util.Scanner;

public class getCourse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter courseId to search");
        int r=s.nextInt();

        DAO e=new DaoImpl();
        try {
            e.getCourse(r);
        } catch (StudentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
