package assignment1;

public class cricket {
    public static void main(String[] args) {
        score s1=new score();
        s1.calculate(5,4,1,3,7);
    }
    static class score{
        static void calculate(int a,int b,int c,int d,int e){
            System.out.println(a*1+b*2+c*3+d*4+e*6);
        }
    }
}
