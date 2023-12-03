package d29lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda13 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        tekrarsizBuyuk(myList);
    }

    //ornek 13: Bir List'teki elemanlari tekrarsiz olarak, buyuk harflerle, alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void tekrarsizBuyuk(List<String> myList) {
        myList.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
        //ALİ ELİF MUSTAFA YUSUF ZEYNEP
    }

}
