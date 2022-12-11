package day11;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter amount");
        int abc=in.nextInt();
        Hotel h1= provideFood(abc);
        if(h1==null){
            System.out.println("Enter Valid amount");
            return;
        }
        h1.chickenBiryani();
        h1.masalaDosa();
    }
    public static Hotel provideFood(int amount){
        if(amount>1000){
            Hotel TajHotel = new TajHotel();
            return  TajHotel;
        }else if(amount>200&&amount<=1000){
            Hotel Roadside = new Roadside();
            return Roadside;
        }
        return null;
    }
    interface Hotel{
        void chickenBiryani();
        void masalaDosa();
    }
    static class TajHotel implements Hotel{
        public void welcomeDrink(){
            System.out.println("Welcome Drink from the TajHotel");
        }
        @Override
        public void chickenBiryani() {
            welcomeDrink();
            System.out.println("chickenBiryani from Taj");
        }

        @Override
        public void masalaDosa() {
            welcomeDrink();
            System.out.println("masalaDosa from Taj");
        }
    }
    static class Roadside implements Hotel{

        @Override
        public void chickenBiryani() {
            System.out.println("chickenBiryani from road");
        }

        @Override
        public void masalaDosa() {
            System.out.println("masalaDosa from Road");
        }
    }
}
