package d20oop;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("Dogs bark");
    }


    @Override // Anotation - not - yazmak zorunda degilsiniz
     public void eat(){
        System.out.println("Dogs Eat");
    }



@Override
public Animal create() { // Burada data type Animal'dir
    return new Dog();// yeni bir Animal objesi urettik
    // memory'e yerlestirmeden return ettik
}

    @Override
    public int add(int a, int b) {
        return a+b;
    }
    //primitive veri turlerinde parent-child iliskisi yoktur
    //return type degistirelemez orj int - long olamaz

    @Override
    public Integer carpma (Integer a , Integer b){
        return a*b;
    }
}
