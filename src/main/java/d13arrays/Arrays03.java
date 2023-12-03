package d13arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr={0, 2, 3, 0, 12, 0};
        int[] yeniArr= new int[arr.length];
        System.out.println(Arrays.toString(arr)); // [0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0, 0, 0, 0]

        int ilkIndex= 0;

        for (int w : arr){ // [0, 2, 3, 0, 12, 0]
            if(w!=0){ // w'ya yuklenen sayi sifira esit degilse.
                yeniArr[ilkIndex]= w; // sifira esit degilse yeniArr'nin ilk index'ine gelen sayiyi yukle.
                ilkIndex++;


            }

        }
        System.out.println(Arrays.toString(yeniArr)); // [2, 3, 12, 0, 0, 0]

        //-------------------------
        //Arraylerin esit olup olmadigi nasil anlasilir?

        int[] a = new int[3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;
        int[] b = new int[3];
        b[0] = 2;
        b[1] = 3;
        b[2] = 1;

        boolean result = Arrays.equals(a,b);
        System.out.println(result); // false cunku ikisi ayni degil







        //Not: BinerySearch isleminde oncelikle sort(siralama) yapmaliyiz. BinarySearch() methodu kullandigimizda
//Java, ortadaki elemana gider ve aradigi elemanin ASCII  degerine gore ilk yarida mi ikinci yarida mi
// oldugunu bulur, diger tarafi gormezden gelir.Gectigi tarafta da orta elemana gider ve ayni islemi yapar.
// Boylelikle cok hizli Search  eder.



















    }
}
