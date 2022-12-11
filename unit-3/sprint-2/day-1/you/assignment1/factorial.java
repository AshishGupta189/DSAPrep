package assignment1;

public class factorial {
    public static void main(String[] args) {
        A a = new A();
        a.primefactorial(12);

    }
    static class A{
        static void primefactorial(int a){
            if(a<2||a>100){
                System.out.println("Invalid number");
            }else{
                for(int i=1;i<=a;i++){
                    if(a%i==0){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
