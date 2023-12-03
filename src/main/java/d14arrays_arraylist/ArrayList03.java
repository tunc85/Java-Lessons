package d14arrays_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //      [J, a, v, a, v] ==> [J, a, v]

        //           a list      ==>    b list

        List<Character> a = new ArrayList<>(); // taninan bir degisken cunku  parenttir. avantajlidir.
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);

        // a list'indeki eleman b' de yoksa ekle diyecegiz
        List<Character> b = new ArrayList<>();

        for (Character w : a){      // [J, a, v, a, v] a nin ici.
            if (!b.contains(w)) {
                b.add(w);

            }

        }
        System.out.println(b); // [J, a, v]











    }
}
