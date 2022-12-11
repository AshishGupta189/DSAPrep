package day9_assignment;

public class prob1 {
    public static void main(String[] args) {
        Bird b1=new Parrot();
        b1.fly();
        Parrot c=(Parrot)b1;
        c.sing();
    }
}
class Bird{
   public void fly(){
        System.out. println("Bird is flying");
    }

}
class Parrot extends Bird{
    @Override
    public void fly(){
        System.out. println("I am flying");
    }
    public void sing(){
        System.out.println("I am Singing");
    }
}
