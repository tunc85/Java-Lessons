package d29lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda12 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        bestenAzKucuk(myList); // ali
                                // elif

    } //main disi

    //ornek 12: Bir List'teki karakter sayisi 5’den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.

    public static void bestenAzKucuk(List<String> myList){
        myList.stream(). // list uzerinden akisi baslattik
        distinct(). // tekrarli olanlari eledik.
                filter(t -> t.length() <5). // listeden gelen her degeri uzunlugu 5 ten kucuk olanlar gelsin
                map(t ->t.toLowerCase()). // bu gelen degerleri kucuk harfe donustur
                sorted(). // naturel order'a soktuk
                forEach(t -> System.out.println(t+ " ")); // aralarinda bir boslukla yazdirdik.

    }






}//class disi
