package Problem2.Dao;

import Problem2.Exceptions.StudentException;
import Problem2.model.Course;
import Problem2.model.Student;
import Problem2.utility.emutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoImpl implements DAO{
    @Override
    public void addCourse(Course course) throws StudentException {
        EntityManagerFactory emf= emutil.providec();
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
        System.out.println("Done....");

    }

    @Override
    public void getStudent(int roll_no) throws StudentException{
        EntityManagerFactory emf= emutil.providec();
        EntityManager em=emf.createEntityManager();
        Student st=em.find(Student.class,roll_no);
        if(st==null){
            em.close();
            throw new StudentException("Student Not Found");
        }else{
            System.out.println("NAme: "+st.getName());
            System.out.println("Email:"+st.getEmail());
            System.out.println("ROLL:"+st.getRoll());
            System.out.println("MOBILE:"+st.getMobile());
            System.out.println("Course In which student is enrolled");
            System.out.println("CourseName:"+st.getCourseId().getCourseName());
            System.out.println("Duration :"+st.getCourseId().getDuration());
            System.out.println("FEE:"+ st.getCourseId().getFee());
            em.close();
        }

    }

    @Override
    public void getCourse(int course_id) throws StudentException{
        EntityManagerFactory emf= emutil.providec();
        EntityManager em=emf.createEntityManager();
        Course stu=em.find(Course.class,course_id);
        if(stu==null){
            em.close();
            throw new StudentException("Student Not Found");
        }else{
            System.out.println("Course Name:" +stu.getCourseName());
            System.out.println("Duration :"+stu.getDuration());
            System.out.println("FEE:"+ stu.getFee());
            Set<Student> s=stu.getStudents();
            System.out.println("Students enrolled");
            for(Student st:s){
                System.out.println("NAme: "+st.getName());
                System.out.println("Email:"+st.getEmail());
                System.out.println("ROLL:"+st.getRoll());
                System.out.println("MOBILE:"+st.getMobile());
            }
            em.close();
        }
    }
}
