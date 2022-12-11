package day9_assignment;

public class prob2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        Tiger t=new Tiger();

        Animal[] array={d,c,t};
        for(int i=0;i<3;i++){
            array[i].makeNoise();
        }
    }
}
class Animal{
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }

}
class Dog extends Animal{
    @Override
     public void makeNoise(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meaw...");
    }
}class Tiger extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Roaring...");
    }
}

