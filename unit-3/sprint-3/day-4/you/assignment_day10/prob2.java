package assignment_day10;

public class prob2 {
    public static void main(String[] args) {
        parent p1=new parent();
        p1.method1();
        p1.method2();
        p1.method3();
        child c1=new child();
        c1.setNumb(5);
        c1.method1();
        c1.method4();
    }
    public static class parent{
        void method1(){
            System.out.println("method1 from parent");
        }
        void method2(){System.out.println("method1 from parent");}
        void method3(){
            System.out.println("method1 from parent");
        }
         int numb;
        final int number=numb;

    }
    static final public class child extends parent{
        public void setNumb(int numb) {
            this.numb = numb;
            super.numb=numb;
        }

        int numb;
        @Override
        void method1(){
            if(numb>=1&&numb<=10) {
                System.out.println(numb);
            } else{
                System.out.println("invalid number");
            }
            System.out.println("method1 from child");
        }
        void method4(){
            System.out.println("method4 from child");
        };
    }
    /*
    *
    *
    * Why is multiple inheritance not supported in Java at class level ?
    * Multiple inheritance is not supported in java because of the ambiguity part if we are inhereting form more than
    * one class and we have same methods in the classes so our compiler will be confused that where to inherit form.
    * for reducing these conflicts we don't use multiple inheritance.
    *
    *
    *
    * */

}
