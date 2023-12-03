package d16overloading_varargs_passbyvalue_constructors;

public class MethodOverloading01 {
    public static void main(String[] args) {
        //Polymorphism - Cok Bicimlilik
        //OOP'nin prensiplerinden biridir
        //Method Overloading (static polymorphism) + Method Overriding (dynamic Polymorphism)
        //Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekillerde calistirabilmek icin kullanilir.

        //i. Method Overloading (Asiri Yukleme)

        //String s="Java";
        // substring  non-static bir methoddur
        //s.substring(int beginIndex);  // tek parametreli
        //s.substring(int beginIndex, int endIndex); // iki parametreli
        //------
        /* Method Overloading'de sadece parametreler degistirilir. Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

	    Method Overloading icin;
	    a) Parametre sayisini degistirebilirsiniz.
	    b) Parametre data tiplerini degistirebilirsiniz.
	    c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
        d)Method overloading olustururken return type'in, access modifier'in, static veya non-static olmanin hicbir etkisi yoktur.
        */


        add(2,3);



    }//Main disi


    //ornek : Toplama islemi yapan bir method olusturalim ve sonrada onu overload edelim
    public static void add(int a, int b){
        //System.out.println(a+b); //5
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b);
    }

    //Soru 1: private method'lar overload edilebilir mi?
    //Cevap 1: private method'lar overload edilebilirler cunku;
    //overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
    // ulasilabilir oldugundan overload'a engel degildir.

    //Soru 2: static method'lar overload edilebilir mi?
    //Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.



}
