package d20oop;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("Cats meow");
    }

    @Override
    public void feedWithMilk(){
        System.out.println("Cats feed their babys with milk");
    }
}
