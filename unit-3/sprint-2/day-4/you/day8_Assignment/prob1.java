package day8_Assignment;
import java.util.Scanner;
/*Q1 Write the logic to reverse the String given in the parameter without the help of
 predefined reverse method and return the reversed String:(HINT use Array)*/
public class prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
    public static String reversString(String input) {
        char[] s=new char[input.length()];
        int i=0;
        for (int j = input.length() - 1; j >= 0; j--) {
            s[i]=input.charAt(j);
            i++;
        }
        System.out.println(s);
        return s.toString();
    }
    }
