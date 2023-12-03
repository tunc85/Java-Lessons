package d24maps_exceptions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        //1) Map’ler sozluk gibidir. Aciklamalidir. orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz
        //2) Sol taraf yani key’ler tekrarsizdir. Value tarafi tekrarli olabilir.
        //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
        //***(Collection yapısı kullanılır, bu da List veya duruma bağlı olarak Array olabilir.)
        //4) Map’in elemanlarina komple ‘entry set’ (giris elemani) denir.

        //maplarde key tarafi tekrarsiz (unique)'dir
        //maplerde value tarafu tekrarli olabilir  tekrarli olabilir.

        //Map nasil olusturulur?
        //Burada add calismaz cunku add eleman ekler . Ben ise "entry set" ekleyecegim
        //Onun icin "put" kullanilir.


        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.

        HashMap<String,Integer> myMap = new HashMap<>(); // 2 veri girme opsiyonu var
        myMap.put("Ali Can",13);
        myMap.put("Veli Han",18);
        myMap.put("Tuncer Ozgur",27);
        myMap.put("Selami Kaya",19);
        myMap.put("Selami Kaya",25); // key tekrarli kullanilirsa son value aktif olur (override) ustune yazar.
        System.out.println(myMap); // {Selami Kaya=25, Tuncer Ozgur=27, Ali Can=13, Veli Han=18}

        //Sadece ‘key’ degerlerini nasil alabiliriz?
        //key tarafini almak icin keySet() methodu kullanilir.

        Set<String> keyTarafi= myMap.keySet();
        System.out.println(keyTarafi); // [Selami Kaya, Tuncer Ozgur, Ali Can, Veli Han]

        //Sadece ‘value’ degerlerini nasil alabiliriz?
        //Bunun icin values() methodu kullanilir.
        Collection<Integer> valueTarafi= myMap.values();
        System.out.println(valueTarafi); // [25, 27, 13, 18]

        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir

        Integer yas = myMap.get("Ali Can");
        System.out.println(yas); // 13 //Ali can yazsam null dondurur . buyuk kucuk harfe duyarli

        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?

        int toplam = 0;

        Collection<Integer> yaslar = myMap.values();
        System.out.println(yaslar); // [25, 27, 13, 18]

        for (Integer w : yaslar){
            toplam=toplam + w;

        }
        System.out.println(toplam/yaslar.size()); // 20

        System.out.println("----------------------");

        //entrySet() metodu, HashMap'in tüm degerlerini içeren bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set'in icinde Map yapisi saklanir.

        System.out.println(myMap); // {Selami Kaya=25, Tuncer Ozgur=27, Ali Can=13, Veli Han=18}

        Set<Map.Entry<String,Integer>> myEntrySet=myMap.entrySet();
        System.out.println(myEntrySet); // [Selami Kaya=25, Tuncer Ozgur=27, Ali Can=13, Veli Han=18]

        for (Map.Entry<String,Integer> w : myEntrySet){
            System.out.println(w);

        }
        //Selami Kaya=25
        //Tuncer Ozgur=27
        //Ali Can=13
        //Veli Han=18

        System.out.println("---------------------");

        //Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
//Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
// hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        //Bir map'i doğrudan for döngüsüne gönderemeyiz, bunun için entrySet() methodunu kullanırız
//Set'e dönüştürür. Set'in data type'ı yerine birden fazla yazamayız
//Map.Entry<> yapısıyla birden fazla data type kullanabiliriz

        HashMap<String,Integer> kisiler = new HashMap<>();
        kisiler.put("Ali",3);
        kisiler.put("Can",5);
        kisiler.put("Ayse",2);

        int sum = 0;
        Set<Map.Entry<String,Integer>> mySet = kisiler.entrySet();
        System.out.println(mySet); //[Can=5, Ayse=2, Ali=3]

        for (Map.Entry<String,Integer> w : mySet){
            sum=sum+ w.getKey().length() + w .getValue();


        }
        System.out.println(sum); // 20






























    }

}
