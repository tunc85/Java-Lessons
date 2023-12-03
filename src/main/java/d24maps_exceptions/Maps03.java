package d24maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        //Meshur bir interview sorusu
        //ornek 1: Size verilen bir String’deki her kelimenin, o String’de kac defa kullanildigini
        //      gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)
        //     Ali nasilsin Ali.
        // ali=2, nasilsin=1

        String s= "Ali nasilsin Ali.";
        s= s.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println(s); // ali nasilsin ali , tek bir data i karsilastirma yapmam icin kelimelere ayiralim
        //bosluktan keselim

        String[] kelimeler =s.split(" "); //3 parcaya ayrildi. Array'e yerlestirdik
        System.out.println(Arrays.toString(kelimeler)); // [ali, nasilsin, ali]

        HashMap<String,Integer> myHashMap= new HashMap<>();
        System.out.println(myHashMap); // {} bos map
           // [ali, nasilsin, ali]
        for (String w : kelimeler){
             Integer gorunum = myHashMap.get(w);
             //ilk dongude map'te ali olmadigindan null dondurecek
            if (gorunum==null){
                myHashMap.put(w,1);

            }else {
                myHashMap.put(w,gorunum+1); // keyler ayniysa override etsin diye aliyi 2 yapan yer

            }
        }
        System.out.println(myHashMap); // {nasilsin=1, ali=2}

        //ODEV: ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini
        // gosteren kodu yaziniz.
        //           "Hello" ==> H=1, e=1, l=2, o=1






















    }
}
