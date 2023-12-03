package d29lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda14 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
    }
    //ornek 14: Bir List'teki elemanlari tekrarsiz olarak, kucuk harflerle, uzunluklarina gore,
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    //Comparator.comparing(): Comparator sınıfında bulunan comparing metodu,
    // belirtilen bir fonksiyona göre karşılaştırma yapmak için bir karşılaştırıcı (comparator) oluşturur.

    //sorted(Comparator.comparing(t->t.length())) ifadesi, stream içindeki elemanları uzunluklarına
    // göre artan sırayla sıralar. Eğer ters sıralama istenirse, reversed() metodu eklenerek
    // sorted(Comparator.comparing(t->t.length()).reversed()) şeklinde kullanılabilir.


}
