package d25maps_exceptions;

public class E03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.
        String s = "Java";
        karakterSec(s,2);
        //karakterSec(s,-1); // Hata


    }//main disi
            public static void karakterSec(String s , int idx){
            //charAt() verilen indexteki elemani getirir
                try {
                    char ch = s.charAt(idx);
                    System.out.println(ch);
                } catch (Exception e) {
                    System.err.println("olmayan index'leri kullanmayiniz"+ e.getMessage());
                   // e.printStackTrace() Java'da bir hata ayıklama (debugging) tekniğidir. Bu ifade, bir hata durumunda hatanın tam izleme (stack trace) bilgilerini konsola yazdırır. Yani, bir hata meydana geldiğinde, programın hangi satırda ve hangi metodlarda olduğunu görmek için kullanılır. Bu nedenle, geliştirme sırasında ve sorunları giderirken hata ayıklama sürecinde bu tür ifadeler kullanılabilir.
                }


            }

}
