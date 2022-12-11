package day11;

public class demo {
    public static void main(String[] args) {
        X.method3();
        Y.method5();
        Zimpl a=new Zimpl();
        a.method1();
        a.method7();
        a.method2();
        a.method3();
        a.method4();

    }
    interface X{
        abstract void method1();
        default void method2(){

        }
        static void method3(){

        }
    }
    interface Y{
        abstract void method4();
         default void method3(){

        }
        static void method5(){

        }
    }
    interface Z extends Y,X {
        abstract void method7();
    }


    static class Zimpl implements Z{


        @Override
        public void method1() {

        }

        @Override
        public void method2() {
            Z.super.method2();
        }

        @Override
        public void method4() {

        }

        @Override
        public void method7() {

        }
    }
}
