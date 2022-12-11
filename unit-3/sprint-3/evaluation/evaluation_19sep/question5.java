package evaluation_19sep;


public class question5 {
    /*Q.5
a. What is object downcasting?
b. Explain with a code example.

    Object downcasting is sub class object base class refrence.
    when we try to link the parent class object to a child class reference it is known as
    downcasting.
    below we have created a parent class and a child class
    first we have upcasted b1 and printed all the information of parent then we downcasted
    and printed all the methods of child class.
    we can only access the things which are overridden.

*/
     static class parent{
        int age=25;
        void business(){
            System.out.println("Parent business");
        }
    }
    static class child extends parent{
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

        //downcasting =>
        child c=(child) b1;
        System.out.println(c.age);
        c.business();
     }
}
