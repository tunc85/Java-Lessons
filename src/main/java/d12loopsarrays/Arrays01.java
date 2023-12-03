package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*         /Array - dizi

    1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
    2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler, bir String dizisi sadece String değerler saklayabilir.
    3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer, Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
    //Array bir class değildir, Java'da obje sınıfından türemiş kabul edilir. --> özel bir yapı
    //Array lar objelerden turemistir. ozel bir yapidir.
*/

        //Array olusturmak

        String[] stdNames1 = new String[3]; //tavsiye edilen yazim stili
        //String stdNames2[] = new  String[4]; // C-style eski tip pek tavsiye edilmez ama calisir.

        //System.out.println(stdNames1); //[Ljava.lang.String;@43a25848 = adres

        //Arrays object'ine gidip toString methodunu kullanmaliyiz.

        String[] stdNames3= new String[3];
        System.out.println(Arrays.toString(stdNames3)); // [null, null, null] string oldugu icin null verdi

        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz
        int[] notlar = new int[5];
        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0, 0] int oldugu icin 0 verdi

        //ornek: 10 elemanli integers adinda, Integer bir arrray olusturunuz ve console’a yazdiriniz

        Integer[] integers= new Integer[10];
        System.out.println(Arrays.toString(integers)); // [null, null, null, null, null, null, null, null, null, null]

        //ornek: 3 elemanli isimler adinda, String bir arrray olusturunuz ve console’a yazdiriniz

        String[] isimler = new  String[3];
        System.out.println(Arrays.toString(isimler)); // [null, null, null]

        // Array'a eleman eklemek
        //index mantigiyla ekleniyor 0 ilk index

        isimler[0] ="Ali Can";
        isimler[1]="Ayse Kaya";
        isimler[2]= "Veli Can";
        // isimler[3]= "Hasan Yilmaz"; 4. elemani yerlestiremessiniz.
        System.out.println(Arrays.toString(isimler));  // [Ali Can, Ayse Kaya, Veli Can]

        // Bir veriyi gormek icin ise;
        System.out.println(isimler[1]); // Ayse Kaya

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.

        String[] cities = new String[5];

        cities[0]="Bursa";
        cities[1]="Ankara";
        cities[2]="Istanbul";
        cities[3]="Hakkari";
        cities[4]="Konya";

        System.out.println(Arrays.toString(cities));

        //1. yol : for loop

        int totalChar = 0;
        for (int i = 0; i < cities.length; i++) { // buradaki lenght method degil. Field'dir. cities.lenght icinde 5 var.
            totalChar = totalChar+cities[i].length(); // buradaki lenght methotdur. String'e uygulanir.

        }
        System.out.println(totalChar); //31

        //2.yol: for each loop(enhanced - gelistirlimis dongu)
        // for loop'taki baslangic, bitis , artirma/azaltma olaylarini dusunmeyiz.

        /*  for (DataType varianle : array yada collections ){
             calisacak kodlar

        }
        //variable olarak ismi olarak da w genel kabul gormustur.*/

        int sum = 0;
        for (String w: cities){ //[Bursa, Ankara, Istanbul, Hakkari, Konya]
            sum=sum + w.length();
        }
        System.out.println(sum);

        //cities in içindeki elemanları tek tek 'w' a at ve alttaki kodu çalıştır diye okuyabiliriz..



































    }


}
