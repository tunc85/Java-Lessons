package d18stringbuilder_accessmodifier_static;

public class Student2 {

    //static , bir degiskenin veya bir method'un Class'a ait oldugunu ve Class'in bir ornegini(Object'i)
    //olusturulmadan kullanabilecegini belirtmek icin kullanilan bir anahtar kelimedir (keyword)

    //matematiksel işlemler için kullanabiliriz. pi değeri gibi değişmeyen sabit bir sayı gibi
    //sayaçlar ve sayımlar için de kullanılabilir --> static sayaç
    //arkadaki verinin silinmemesi lazım, üstüne eklenebilir
    //çevrimiçi forum --> toplam kullanıcı
    //oyunun ilerleme durumu --> görev %75 e geldikten sonra arttıkça ilerlenecek, %75 korunmalı
    //static değişkenler herkes için aynıdır

    /*
    1) static variable veya static methodlar (class member) tum object'ler icin ortak elemandir
    2) static class member'lar uzerinde yapilan degisiklikler tum objectleri etkiler.
    3) static class member'lar class'a, non-static class memberlar objectler'e aittir
    4) static class memberlar'a ulasmak icin object olusturmaya gerek duyulmaz,
    ama non-static class memberlar'a ulasmak icin object olusturmak sarttir
    5) static variable'larin diger adi class variable'dir,
    non-static variable'larin diger adi instance variable veya object variable'dir
 */


    public  static String stdName = "Ali Can"; // static variables

    public  int age = 18; // non-static variable

    public static void  staticMethod(){
        System.out.println("Ben static bir methodum");
    }

    public void nonStaticMethod(){
        System.out.println("Ben non-static bir methodum");
    }











}
