package day9_2Assignment;

public class prob2 {
    /*
    * Q2) What is the use of ‘super’ keywords in java ? Explain with an example
    * Super keyword is used to immediate parent class
    * It can be used to access parent class methods or variables
    * it points to super class.
    * It is always the first statement in the constructor either you write it or not
    * ex: Object is the super class of all the classes.
    * ex:
    *
    * */
    static class Parent{
        String COLOR="dark";
        Parent(){
            System.out.println(this.COLOR);
        }
    }
    static class child extends Parent{
        String COLOR="white";
        void print(){
            System.out.println(this.COLOR);
        }

    }

    public static void main(String[] args) {
        child c1=new child();
        c1.print();
    }
}
