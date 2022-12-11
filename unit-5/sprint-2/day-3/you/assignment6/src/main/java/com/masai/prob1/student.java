package com.masai.prob1;

import javax.persistence.*;

@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentRoll;
    private String studentName;
    private String studentEmail;
    private String studentMobile;

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "StudentRoll=" + StudentRoll +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                ", clgid=" + courseId +
                '}';
    }

    public int getStudentRoll() {
        return StudentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        StudentRoll = studentRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseId")
    private college courseId;

    public college getcourseId() {
        return courseId;
    }

    public void setcourseId(college courseId) {
        this.courseId = courseId;
    }

    public student(String studentName, String studentEmail, String studentMobile, college clgid) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentMobile = studentMobile;
        this.courseId = clgid;
    }
}
