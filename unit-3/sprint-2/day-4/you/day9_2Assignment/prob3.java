package day9_2Assignment;

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        Demo.Hotel_providefood(x);
    }
    static class Demo{
        public static void Hotel_providefood(int amount){
            if(amount>1000){
                System.out.println("TajHotel");
            }
            else if(amount<1000&&amount>200){
                System.out.println("RoadSide");
            }else{
                System.out.println("enter valid amount");
            }
        }


    }
    static class Hotel{
        void print(){
            System.out.println("Hotel");
        }
    }
    static class TajHotel extends Hotel{
        void print(){
            System.out.println("Taj");
        }
    }
    static class Roadside extends Hotel {
        void print(){
            System.out.println("Raod");
        }
    }
}

