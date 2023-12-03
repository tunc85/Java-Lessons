package d4castingscannerincrementif;

public class Operators {
    public static void main(String[] args) {

        /*
        +,-,*,/ islemleri Java’da matematikte kullanildigi gibi kullanilir

Not 1: Java’da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
Not 2: Eger sonuc tamsayi degilse java sonucun ondalik kismini silerek onu int’e donusturur.
Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
*/

    int paraMiktari = 25;
    int kisiSayisi = 10;

        System.out.println(paraMiktari /kisiSayisi); //2

        double ucretMiktari=25; //8byte
        int insanSayisi=10; //4byte
        System.out.println(ucretMiktari/insanSayisi);//2.5
        //sonuc buyuk veri tipinde cikar.Buyukten kasit , memory'de daha fazla bilgi saklayabilmektir.

        //------------------------------------------
        //Java'da Logical operators

        //AND - VE (&&) isleminden true alabilmek için her sayi true olmalidir.Carpma olarak dusunebilirsiniz.
        //OR- VEYA (||) isleminde bir tane true islemmi sonucu true yapmaya yeterlidir.
        //NOT - DEGİL (!) true olani false , false olani true yapar.

        //!true ==> false
        //!false ==> true
        //!!true ==>true

        //------------------------------------------

        //Comparison operators (Karsilastirma)
        //< , > , <= , >= , == , !=
        //bunlar kullanildiginda sonuc kesinlikle buleean (true,false) olur.

        boolean a = 3 < 5; //true
        boolean b = 2 + 3 != 5; //false
        boolean c = 2 + 3 * 5 >= 19; //false

        System.out.println(a && b); //false
        System.out.println(a || b || c); //true










    }
}
