package d15arraylist_methodcreation_overloading;

import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Bir List olusturmak icin kisa yol

        List<Integer> myList = Arrays.asList(1,3,5,1,2);
        //asList kullanmanin bazi handikaplari vardir. Arka planda Array gibi calismaya baslar.
        //Bu yüzden List'in eleman sayisini degistiren methodlari kullanamazsiniz
        //ornegin remove() yapamazsiniz add() gibi methodlari kullanamazsiniz
        // ama set()  veya size() kullanabilirsiniz

        //myList.remove(0); //HATA calismaz.
        //myList.add(5); // HATA calismaz.
        myList.set(0,5);
        System.out.println(myList); // [5, 3, 5, 1, 2]
        System.out.println(myList.size()); // 5
         //List’lerin sagladigi bazi methodlari kullanmak istiyorsaniz ve eleman sayisini degistirmeyecekseniz asList kullanabilirsiniz
        //degistirmeyecekseniz asList




    }
}
