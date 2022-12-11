package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Test t=new Test();
        System.out.println("Enter number");
        int[] arr= t.display(s.nextInt());//Take this argument from user using the Scanner class
         //Write the logic to print the elements
        for(int items:arr){
            if(items!=0){
                System.out.println(items);
            }
        }
    }
    interface Intr{

        int[] display(int p);

    }
    static class Test implements Intr{
        @Override
        public int[] display(int p) {

            int[] a=new int[p-2];
            int l=0;
            for(int i=2;i<=p;i++){
                int j=0;
                for(int k=2;k<=p;k++){
                    if(i%k==0){
                        j++;
                    }
                }if(j==1){
                    a[l]=i;
                    l++;
                }
            }
            return a;
        }
    }
}
