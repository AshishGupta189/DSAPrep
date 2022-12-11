package Problem2.Usecase;

import Problem2.Dao.DAO;
import Problem2.Dao.DaoImpl;
import Problem2.Exceptions.StudentException;
import Problem2.model.Course;
import Problem2.model.Student;

import java.util.HashSet;
import java.util.Set;

public class addCourse {


    public static void main(String[] args) {
        Course c=new Course();
        Set<Student> ss=new HashSet<>();
        Student st=new Student("Akhil","akhil@123","566665552",c);
        Student sti=new Student("rahul","rahul@123","566665552",c);
        Student s=new Student("rohit","rohit@123","566665552",c);
        ss.add(st);
        ss.add(sti);
        ss.add(s);
        c.setCourseName("Java");
        c.setDuration("8mos");
        c.setFee(15896);
        c.setStudents(ss);

        DAO d=new DaoImpl();
        try {
            d.addCourse(c);
        } catch (StudentException e) {
            System.out.println(e.getMessage());
        }
    }

}
