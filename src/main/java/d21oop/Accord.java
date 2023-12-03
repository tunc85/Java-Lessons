package d21oop;

public class Accord extends Honda {
    //Honda'nin child'i yapılacak exdens ile
    //2- @override yapilacak
    //3- Abstract silinecek
    //4- Suslu Parantez ile body verilecek
    //"Gas 2.0 Turbo"
    @Override
    public void engine() {
        System.out.println("Turbo 2.0");

    }
}
