package eval_12sep.demo;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
       //4. Write a function that asks the user to input his/her name and age
        //(use Scanner class) and prints the same on the console.
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your name");
       String name = scanner.next();
        System.out.println("enter your age");
        int age=scanner.nextInt();
        System.out.println(name+" "+age);

    }
}
