package d25maps_exceptions;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {
                //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

                     /*HashMap ile HashTable arasindaki fark nedir?
             1)  a) HashMap non-synchronized'dir.Yani, birden fazla iş parçacığı aynı anda bir
             HashMap'e erişebilir. Aynı anda birden fazla müşteri hesap bilgilerine erişebilir.
             Bu, örneğin bir müşteri para çekerken, başka bir müşteri aynı anda hesaba para yatırırsa,
             hesabın bakiyesinin yanlış olmasına yol açabilir.(thread-safe de degildir)
             Ancak bu durumda senkronizasyon işlemleri manuel olarak yönetilmelidir.
             (programci Synchronized Bloklar, Lock ve Semapforlar gibi ozel yapilar kullanir.)

                 b) HashTable thread-safe ve synchronized'dir
             ( yani aynı anda sadece bir iş parçacığı aynı Hashtable'i kullanabilir.
              kuyruk olusur ve hizmet suresi uzar)

             2) a)HashMap bir tane null key'e (unique olmali, 2 null olamazdi, ustune yazar) ve
                     istediginiz kadar null value'a musaade eder
                b)Hashtable, anahtarlar ve değerler için null değerlerine izin vermez.
                Herhangi bir null değer eklemeye çalışırsanız, NullPointerException alırsınız.

             3) HashMap hizlidir, HashTable HashMap'e gore yavastir

             Not: HashMap'ler ve HashTable'lar entry'leri rastgele siralar*/

             /*--------------------
            Hangi veri yapısını kullanmalısınız?

            Senkronizasyona gerek yoksa, HashMap kullanın. Bu, daha yüksek performans sağlayacaktır.
            Senkronizasyon gerekliyse, Hashtable kullanın. Bu, veri tutarsızlığı riskini azaltacaktır.
             */

        Hashtable<String,Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Selma ",70);
        ogrenciNotlari.put("Tuba ",75);
        ogrenciNotlari.put("Ibrahim ",85);
        ogrenciNotlari.put("Sefa ",87);
        //ogrenciNotlari.put(null,87); key kismina null koyamassiniz
        // ogrenciNotlari.put("Ahmet",null); value kismina null koyamasssiniz


        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 41);
        stdAges.put(null, 41);
        stdAges.put(null,39);
        stdAges.put("a", null);
        stdAges.put("b", null);
        System.out.println(stdAges); //{null=39, Ahmet=41, a=null, b=null, Ali=18}

        /*
        1) Treemap'ler entry'leri natural order'a gore siraya koyar, bu yuzden cok yavastirlar
        2) Treemap'ler  thread-safe ve synchronized degildir.
        3) Treemap'lerin key'lerinde null kullanilamaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) Treemapler key'e bakarak siralama yapar
         */

        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //countryPopulation.put(null, 180000000); //HATA
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);
        System.out.println(countryPopulation);
        //{France=null, Germany=83000000, Italy=null, Netherland=18000000, Turkiye=83000000, USA=400000000}

        /*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.*/

        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();

        lhm.put("ALi",25);
        lhm.put("Can",18);
        lhm.put("Mehmet",30);

        for (Map.Entry<String,Integer>entry: lhm.entrySet()){
            //System.out.println(entry);

            System.out.println(entry.getKey()+ " -->"+ entry.getValue());
            //ALi -->25
            //Can -->18
            //Mehmet -->30

        }








    }
}
