package day8_Assignment;
import java.util.Scanner;
public class prob5 {
    /*Q5) Create a Student Bean class with the following fieldsroll: Integer
name: String
address: String
marks: Integer
Create a Demo class and perform the following operation in the main method:
Take the number as input from the user, How many Student objects need to be
created.
Create an array of Students with those numbers.
Initialize all the student objects by taking details from the user.
print all the Student details.
print the average of all the Student marks.*/
    public static class StudentBean{
        private int rollno;
        private String name;
        private String address;
        private int marks;
        public StudentBean (){}
        public StudentBean(int rollno, String name, String address, int marks) {
            this.rollno = rollno;
            this.name = name;
            this.address = address;
            this.marks = marks;
        }

        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        class Demo{

        }

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter no. of Students");
        int s=s1.nextInt();
        StudentBean[] a=new StudentBean[s];
        int avg=0;
        for(int i=0;i<s;i++){
            System.out.println("roll no.");
             int rollno=s1.nextInt();
            System.out.println("name");
            String name=s1.next();
            System.out.println("address");
             String address=s1.next();
            System.out.println("marks");
            int marks=s1.nextInt();
            StudentBean st=new StudentBean(rollno,name,address,marks);
            a[i]=st;
            System.out.println(rollno);
            System.out.println(name);
            System.out.println(address);
            System.out.println(marks);
        }
        for(int i=0;i<s;i++){
            avg+=a[i].marks;
        }
        System.out.println("AVg marks is: "+avg/s);
    }
}
