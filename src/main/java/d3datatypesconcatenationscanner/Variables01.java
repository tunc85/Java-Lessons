package d3datatypesconcatenationscanner;

public class Variables01 {
    public static void main(String[] args) {

        //psvm yazarak public static void main(String[] args) yazdırabilirsiniz.
        //main yazarak public static void main(String[] args) yazdırabilirsiniz.
            //bu boyle baslamak zorunludur ana motoru olusturup centikli
            //parantezin icine kodlarimizi giriyoruz.

//-----------------------------------------------------

        //Ornek iki tane Integer variable olusturun ve toplamlarını console'a yazdırın.
int a=12  , b=13;
        System.out.println(a+b); //25

        //4: long data type
        //Tam sayilar icindir, hafizada 8 byte yer kaplar
        //-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.(kentilyon)

        //long oluşturulurken eger deger , int'in maksimum degerinden buyuk ise
        //sonuna "L" koymak zorundasiniz. Yoksa hata alirsiniz.

        //Ornek 1: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapın.

        long hucreSayisi = 454545454521L;
        System.out.println(hucreSayisi);

        //Ornek:2 : 2 tane long variable olusturun ve toplamlarini 1 etiketle konsola yazdirin.

        long c=12 ,  d=13;
        System.out.println("Toplam " +(c+d)); //25 oldu sonuc. label kullandik("label")

        //--------------------

        //5- float data type:
        //Decimal numbers - Ondalikli sayilar icin kullanilir.
        // Ozellikle fiyat degerleri icin kullanilir.

        //Not: Java ondalikli sayida otomatik olarak "double" kabul eder.
        //float istiyorsaniz sonuna "F" veya "f" yazmalisiniz. kucuk veya buyuk olabilir.

        //Ornek1: 2 tane float data tipinde variable olusturunuz ve bunlarin toplamini bir etiketle konsola yazdiriniz.

        //1. yol :
        float corapFiyati = 12.99f;
        float gomlekFiyati= 25.99f;
        System.out.println("Toplam Fiyat  :" + (corapFiyati+gomlekFiyati));

        //2.yol

        float corapFiyati2 = 12.45f, gomlekFiyati2=23.99f;
        System.out.println("Fiyat: "+ (3*corapFiyati2+2*gomlekFiyati2)); //fiyat 85.33

        //6: double data type:
        //double memory'de 8 byte yer kaplar.

        //Ornek1 : Hucre agiriligi icin bir variable olusturup console'a yazdirin.

        double hucreAgirligi = 0.000000000000028;
        System.out.println(hucreAgirligi); //2.8E-14 ==> 2.8 carpi 10 uzeri -14 demektir

        //7:char data type:
        //2 byte'dir. Tek karakterler icin kullanilir. Sayi , sembol , harf farketmez.
        //veri tek tirnak icerisine yazilir.

        //Ornek : char data tipinde ismi isminIlkHarfi olan bir variable olusturunuz ve
        //icine tek bir karakter yukleyiniz

        char isminIlkHarfi = 'S';
        System.out.println("isminIlkHarfi = " + isminIlkHarfi); //S

        //----------

        //8- Boolean data type:
        //Sadece true(dogru) veya false(yanlis) olmak uzere 2 farkli deger alir.

        //ornek: boolean data tipinde emekli misin? sorusu icin bir degisken olusturun ve true atayin.

        boolean isRetired=true;
        System.out.println(isRetired); //true verdi ekrana.

        boolean b1=true;
        boolean b2=true;
        boolean b3=false;
        boolean b4=false;

        System.out.println(b1&&b2);
        System.out.println(b2||b3);
        System.out.println(b2&&b4);
        System.out.println(b3||b4);
        //----------------------
        //System.out.println(); ve System.out.print(); arasindaki fark nedir?
        //System.out.println(); ekrana bir sey yazdirdiktan sonra otomatik olarak yeni bir satira gecer

        //System.out.print(); Ekrana bir sey yazdirir ama yeni satira gecmez.

        System.out.print("Merhaba ");
        System.out.print("Dunya"); // Merhaba Dunya (bosluk koy)






    }


}
