package Problem2.model;

import javax.persistence.*;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roll;
    private String name;
    private String email;
    private String mobile;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Course getCourseId() {
        return course;
    }

    public void setCourseId(Course courseId) {
        this.course = courseId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", CourseId=" + course +
                '}';
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CourseId")
    private Course course;

    public Student() {
    }

    public Student(String name, String email, String mobile, Course courseId) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        course = courseId;
    }
}
