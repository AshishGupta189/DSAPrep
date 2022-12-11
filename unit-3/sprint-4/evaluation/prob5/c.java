package evaluation26sep.prob5;

import java.util.*;

public class c {
    /*
    * What is the difference between final and finally. Write the code for the same.
    * =>final keyword is used with methods variable and classes while finally is used to close our resources doing this so
    * we can prevent the data to be leaked. and finally keyword will always execute whether there will any Exception or anything
    * it will always execute, it's like a last wish. This is basically used
    * to close our resorces which are running and will be running until we don't close them.
    * final method can't be overrided.
    * final variable can't be changed.
    * final class can't be extended or inherited.
    *
    * ex:
    * final int i=0;
    * i=10//CT error as final keyword can't be changed.
    * final void m1(){}//if you want to override this method it will also give you CT error as final method can't be overrided.
    * final class m{}//if you try to extend this class it will also give you CT error as final class can't be inherited.
    *
    * ex of finally:
    * */
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter any number");
        int i=s1.nextInt();
        System.out.println(i);
        abc(s1);

    }
    static void abc(Scanner s1){
        Object o=null;
        try{
            o.toString();
        }catch (Exception e){
            throw new NullPointerException(" This is a Null Object");
        }finally {
            s1.close();
            System.out.println("The end");//even after the exception this code is printed.
        }
    }
}
