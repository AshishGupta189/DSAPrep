package Problem2.Dao;

import Problem2.Exceptions.StudentException;
import Problem2.model.Course;

public interface DAO {
    public void addCourse(Course course) throws StudentException;
    public void getStudent(int roll_no)throws StudentException;
    public void getCourse(int course_id) throws StudentException;
}
