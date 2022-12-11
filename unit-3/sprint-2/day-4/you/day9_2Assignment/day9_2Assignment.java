package day9_2Assignment;

public class day9_2Assignment {
    static class Person{
        String name ;
        String gender ;
        Address add =new Address();
        @Override
        public String toString(){
            return (name+" "+gender+" "+add);
        }
    }
    static class Address{
        String city="Chennai" ;
        String state ="TN";
        String pinCode ="60001";
        @Override
        public String toString(){
            return (city+" "+state+" "+pinCode);
        }
    }
    static class Instructor extends Person{
        String instructorId;
        int Salary;

        public Instructor(String instructorId, int salary) {
            this.instructorId = instructorId;
            Salary = salary;
        }

        @Override
        public String toString(){
            return (instructorId+" "+Salary);
        }
    }
    static class Student extends Person{
        int studentId ;
        String courseEnrolled ;

        public Student(int studentId, String courseEnrolled, int courseFee) {
            this.studentId = studentId;
            this.courseEnrolled = courseEnrolled;
            this.courseFee = courseFee;
        }

        int courseFee ;
        @Override
        public String toString(){
            return (studentId+" "+courseFee+" "+courseEnrolled);
        }
    }
    public static Person generatePerson(Person person){
        return person;
    }

    public static void main(String[] args) {

        Person newStudent = generatePerson(new Student(1,"JA111",300000));
        Person newTeacher = generatePerson(new Instructor("456",45615));
        System.out.println(newStudent);
        System.out.println(newTeacher);
    }

}
