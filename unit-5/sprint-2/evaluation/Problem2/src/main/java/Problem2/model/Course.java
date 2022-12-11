package Problem2.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CourseId;
    private String CourseName;

    public Course() {
    }

    private String duration;

    @Override
    public String toString() {
        return "Course{" +
                "CourseId=" + CourseId +
                ", CourseName='" + CourseName + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                ", students=" + students +
                '}';
    }

    private int fee;

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private Set<Student> students=new HashSet<Student>();

    public Course(String courseName, String duration, int fee, Set<Student> students) {
        CourseName = courseName;
        this.duration = duration;
        this.fee = fee;
        this.students = students;
    }
}
