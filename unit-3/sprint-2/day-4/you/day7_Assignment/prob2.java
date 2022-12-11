package day7_Assignment;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        /*Q2) Write a Java program to get the character at the given index within the String.Take
       the input with the help of Scanner class

     Sample Output:
       Enter the String:
     “Java Exercises”
    Enter the character position you want to access:
      2
    Character at
*/
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=s1.nextLine();
        System.out.println("Enter the character position you want to access:");
        int i=s1.nextInt();
        System.out.println("Character at position"+" "+i+"  is :");
        System.out.println(s.charAt(i));
    }
}
