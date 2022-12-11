package day7_Assignment;

import java.util.Scanner;

public class prob3 {
    static class Course{
        public static void main(String[] args) {
            authenticate("Admin","1234");
            authenticate("Ashu","1234");
        }
        int courseId;
        String courseName;
        int courseFee;

        void displayCourseDetails(){
            System.out.println(courseFee+" "+courseName+" "+courseId);
        }
        static void authenticate(String username,String password){
            if(username=="Admin"&&password=="1234"){
                Scanner s1=new Scanner(System.in);
                Course c1=new Course();
                System.out.println("enter courseId");
                c1.courseId=s1.nextInt();
                System.out.println("enter course name");
                c1.courseName=s1.next();
                System.out.println("enter course fees");
                c1.courseFee=s1.nextInt();
                c1.displayCourseDetails();
            }
            else{
                System.out.println("Invalid Username or password");
            }
        }
    }
}
