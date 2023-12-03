package d24maps_exceptions;

import java.util.HashMap;

public class Maps02 {

    public static void main(String[] args) {


    HashMap<String,Integer> stddages= new HashMap<>();
    stddages.put("Ali",18);
    stddages.put("Can",19);
    stddages.put("Tom",33);
    stddages.put("Veli",63);
    stddages.put("Ahmet",41);

    //key'i tekrarli kullandiginizda hata vermiyordu ama bu sekilde yapmak best practice degildir
        stddages.put("Tom",35);
        System.out.println(stddages); // {Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        //1) replace() methodu value’lari key’leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stddages.replace("Tom",39);
        System.out.println(stddages); // {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        //2) replace() methodu eski deger kontrolu yaparak ta calisir
        stddages.replace("Tom",21,45);
        System.out.println(stddages);  // {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18} degismedi cunku eski deger ayni degil

        stddages.replace("Tom",39,45);
        System.out.println(stddages); // {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18} degisti cunku eski deger 39

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stddages.putIfAbsent("Tom",77);
        System.out.println(stddages); // 77 eklemez {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}

        stddages.putIfAbsent("Erica",90);
        System.out.println(stddages); // {Can=19, Ahmet=41, Tom=45, Veli=63, Erica=90, Ali=18} ekler cunku yoktu

        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar

        System.out.println(stddages.get("Tom")); // 45 key verdik value verdi

        System.out.println(stddages.getOrDefault("Tom",-1)); //45

        System.out.println(stddages.get("Jerry")); // null
        System.out.println(stddages.getOrDefault("Jerry",-1)); // -1

        //varsa orjinal degeri yoksa bizim atadigimiz degeri ekle

        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        Boolean b =stddages.containsKey("Tom");
        System.out.println(b); // true tom diye bir key var

        System.out.println(stddages.containsKey("TOM")); // false case sensetive

        Boolean v = stddages.containsValue(90);
        System.out.println(v); // true

        System.out.println(stddages.containsValue(99)); // false cunku yok

        System.out.println("---------------------------");

        //6)remove(“Tom”); methodu key kullanarak entry silmeye yarar

        stddages.remove("Tom");
        System.out.println(stddages); // {Can=19, Ahmet=41, Veli=63, Erica=90, Ali=18}

        //remove(“Can”,19); methodu hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez

        stddages.remove("Can",19);
        System.out.println(stddages); // {Ahmet=41, Veli=63, Erica=90, Ali=18}











    }
}