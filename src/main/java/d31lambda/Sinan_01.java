package d31lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sinan_01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(10));
maksimum1(nums);



    }



    public static void maksimum1(List<Integer> nums) {
        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)
        //Akistaki herhangi bir sayi, bu degerden buyuktur
        //2, 2, 4, 5, 11, 10

        int max = nums.
                stream(). // akis
                        distinct(). // tekrarlilar giti
                        reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(max); //11

    }
}

