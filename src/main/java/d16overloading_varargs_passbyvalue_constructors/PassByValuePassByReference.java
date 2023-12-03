package d16overloading_varargs_passbyvalue_constructors;

public class PassByValuePassByReference {
    public static void main(String[] args) {
        /*Pass by Value (Değer ile Geçiş):

 Bir değişkenin değerini, yani veriyi, bir metoda parametre olarak ilettiğinizde,
 aslında o değişkenin bir kopyasını iletirsiniz. Metodun içinde bu kopya değiştirilse bile,
 orijinal değişkenin değeri değişmez. Degisken ve Object'lerin adreslerinin (reference) kopyasinda calisilir.
 guvenlik -verilerin kontrolsuz degistirilmesini Java engeller
 performans- adres degisikliginin onune gecilerek hiz saglanir*

 /*Pass by Reference (Referans ile Geçiş):
Java'da "pass by reference" kullanılmaz. Bunda degisken ve object'lerin adresleri direkt methoda gonderilir. Kopya yoktur.Method'a adres yollaninca method, adresi kullanarak orjinal degere ulasir ve degeri degistirebilir. Bu yaklasimda hem adres hem de orjinal veri degisebilir.*/

        //Kopya yoktur.Method'a adres yollaninca method, adresi kullanarak orjinal degere ulasir
        //ve degeri degistirebilir. Bu yaklasimda hem adres hem de orjinal veri degisebilir.

        /*Peki Java bunu neden Boyle yapar? (Pass by reference kullanımına gore)

        1- Güvenlik:
        "Pass by Value," verilerin kontrolsüz değiştirilmesini engeller.
        Bu, programın güvenliğini artırır çünkü bir metodun içinde değiştirilen veriler,
        çağrıldığı yerdeki orijinal veriyi etkilemez.

        2- Performans:
        Pass by value, Java'nın performans açısından daha verimli çalışmasını sağlar.
        Adres degisikliginin onune gecilerek hiz saglanir*/





        int x =3;
int y=5;
add(x,y);
//Burada Java 1.Method'u kullaniyor. Eger birinci methodu kapatacak olursak Java Overload methodlar
//arasindan AW(Auto Widining ) yaparak, kullanabilecegi baska bir method arar. Var olan overload methodlar
//arasindan em az hangisinde overload yapmasi gerekecekse onu kullanir. Ama en az AW yaparak kullanabilecegi
//method birden fazla ise hangisini kullanacagini secemez ve hata verir. Parametere sayisi farkli ise hic
//kontrol etme geregi bile duymaz
    }
    public static int add(int a , int b){
        return a+b;

    }
}
