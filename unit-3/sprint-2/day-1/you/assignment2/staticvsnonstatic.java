package assignment2;

public class staticvsnonstatic {
    /*A static variable acts like a global variable and is loaded each time before the
    code executes we can access a static variable easily while non static variable are
    specific to instance object that we create.
    non static variable loads when it is necessary to execute the code and if we want to access
    non static variable so we have to create an object of the class in which that variable is
    present

    for ex:


    */
    static int x=10;
    int y=15;
    public static void main(String[] args) {
        System.out.println(x);
//        System.out.println(y); error bcoz we cant access non static variable from static part so

        staticvsnonstatic non=new staticvsnonstatic();
        System.out.println(non.y);

    }
}
