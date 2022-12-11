package evaluation_19sep;

public class question6 {
    /*Q.6
a. What is object upcasting?
b. Explain with a code example
    Object upcasting is sub class refrence to base class object.
    when we try to link the  child class object to a parent class reference it is known as
    upcasting.
    below we have created a parent class and a child class
    and upcasted child class now we can access only the child variables or methods which are
    overrided
            */
    static class parent{
        int age=25;
        int a=15;
        void business(){
            System.out.println("Parent business");
        }
    }
    static class child extends parent {
        int age=20;
        @Override
        void business(){
            System.out.println("child study");
        }
    }

    public static void main(String[] args) {
        parent b1=new child();
        b1.business();
        System.out.println(b1.age);



    }
}
