package evaluation_19sep;

public class question4 {
    /*Q.4
a. What are the benefits of using an abstract method?
b. Explain with an appropriate code example.


    => The benefits of using an abstract method is:
    . to enhance the security.
    . Persons from outside can't see the implementation.
    . By using abstract methods we can increase the flexibility and scalibility.
    . Overriding of method.

    ex:
*/
    abstract class Shape{
        int pi=22/7;
        abstract void area(int pi);
    }
    static class calculate{
        static void area(){
            System.out.println("area");
        }
    }

    public static void main(String[] args) {
        calculate.area();
    }
}
