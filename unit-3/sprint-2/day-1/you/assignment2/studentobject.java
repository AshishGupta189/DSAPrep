package assignment2;

public class studentobject {
   static class Student{
        int roll;
        String name;
        int marks;
        void displayStudentDetails(){
            System.out.println("Roll is:"+roll);
            System.out.println("Name is: "+name);
            System.out.println("Marks is : "+marks);
        }
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Abhay";
        s1.marks=90;
        s1.roll=7;
        Student s2=new Student();
        s2.name="Mayank";
        s2.marks=75;
        s2.roll=18;

        s1.displayStudentDetails();
        s2.displayStudentDetails();

    }
}
