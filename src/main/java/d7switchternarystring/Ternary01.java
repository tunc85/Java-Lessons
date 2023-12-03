package d7switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

         //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0

        //(c) ? (t) : (f)

        int c = 4;

        int result = c < 0 ? -1 * c : c; //4

        //------------------------------------------------
        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan,isaretleri farkli ise
        // “Farkli isaretli//object ile hem int hemte string kulandik herzaman kullanilmasi
        //        // // tavsiye edilmez. degerleri outoboxingi yapmasını sağladık.
        //        // butun classlarin atasi Object'tir. kötü gün dostudur. sayilari carpamiyorum” mesaji veren kodu yaziniz.


        int a =4;
        int b =-7;

       Object sonuc = (a>0 && b>0) || (a<0 && b<0) ? (a*b) : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(sonuc);














    }
}
