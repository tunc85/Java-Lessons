package d28iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda05 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 13));
   tekrarsizCiftKaresininCarpini(nums);
    } //main disi
    //1) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void tekrarsizCiftKaresininCarpini(List<Integer> nums ){
       int carp =  nums.stream(). // akis basladi
                distinct().// tekrarli olan sayilar elendi
        filter(t-> t % 2 == 0). // sadece cift sayilar gecti
                map(t-> t*t).// karesini aldik
        reduce(1,(t,u) -> t*u); // carpmini aldik
        System.out.println(carp); // 64


    }



}
