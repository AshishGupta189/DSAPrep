package day17;

import assignment_day10.prob1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class prob2 {
    public static void main(String[] args) {
        Map<StudentBean,String> studentobj=new LinkedHashMap<>();
        StudentBean s1=new StudentBean(1,420,"Abhay");
        StudentBean s2=new StudentBean(11,350,"Akhil");
        StudentBean s3=new StudentBean(12,400,"Abhinav");
        StudentBean s4=new StudentBean(13,430,"Arjun");
        StudentBean s5=new StudentBean(14,490,"Ashish");
        StudentBean s6=new StudentBean(15,200,"Aman");
        StudentBean s7=new StudentBean(16,480,"Alok");
        studentobj.put(s1,"UP");
        studentobj.put(s2,"UP");
        studentobj.put(s3,"UP");
        studentobj.put(s4,"UP");
        studentobj.put(s5,"UP");
        studentobj.put(s6,"UP");
        studentobj.put(s7,"UP");

        studentobj.forEach((k,v)-> System.out.println(k+" "+v));



    }
    public static class StudentBean {
        private int roll;
        private int marks;
        private String name;

        public int getMarks() {
            return marks;
        }

        public StudentBean() {
        }

        public StudentBean(int roll, int marks, String name) {
            this.roll = roll;
            this.marks = marks;
            this.name = name;
        }

        @Override
        public String toString() {
            return "roll=" + roll +
                    ", marks=" + marks +
                    ", name= " + name + '\'';
        }
    }
}
