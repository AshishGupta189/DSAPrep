package assignment1;

public class sum {
    public static void main(String[] args) {
        sumofnatural h1=new sumofnatural();
        h1.num(5);
    }
    static class sumofnatural{
        static void num(int a){
            System.out.println((a*(a+1))/2);
        }
    }
}
