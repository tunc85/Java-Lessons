package d13arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
//      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order'aa gore siralar

        //1. yol:

        int[] ages = new int[6];

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages)); //[20, 23, 19, 44, 15, 32]
        // Arrays.sort(ages);
        //System.out.println(Arrays.toString(ages)); // [15, 19, 20, 23, 32, 44]
        //System.out.println(ages[0]+ ages[ages.length-1]); // en bastaki ile en sonundakini topladik //59

        //------------------------
        //2.yol : Math.max() ve Math.min() ile yapacagiz
        int minimum = ages[0];
        int maxiumum=ages[0];


        for (int w : ages){ //[20, 23, 19, 44, 15, 32]
            minimum= Math.min(minimum,w);
            maxiumum=Math.max(maxiumum,w);

        }
        System.out.println(minimum); //15
        System.out.println(maxiumum);//44
        System.out.println("Toplam : " + (minimum+maxiumum)); // 59



















    }
}
