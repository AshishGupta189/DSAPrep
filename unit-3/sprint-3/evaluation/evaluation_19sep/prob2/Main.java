package evaluation_19sep.prob2;

import evaluation_19sep.prob2.StudentBean;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int s=s1.nextInt();
        StudentBean[] arr=new StudentBean[s];
        for(int i=0;i<s;i++){
            System.out.println("Enter student no."+(i+1)+"marks");
            int marks=s1.nextInt();
            System.out.println("Enter student no."+(i+1)+"name");
            String name=s1.next();
            StudentBean st=new StudentBean(marks,name);
            arr[i]=st;
        }
        int avg=0;
        for(int i=0;i<s;i++){
            avg+=arr[i].getMarks();

            System.out.println("Student no. :"+(i+1)+": " +arr[i]);
        }
        System.out.println("Avg marks is: "+(avg/s));
    }
}
