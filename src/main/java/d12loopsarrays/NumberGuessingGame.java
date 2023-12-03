package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 20-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        //Scanner ve Random class'larindan Object uretelim

        Scanner scanner=new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasinda rastgele bir sayi uretelim.
        int rasgeleSayi = random.nextInt(101); // 0 -100 arasi //random class 20-100 arasinda sayi nasıl uretilir? ODEV


        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim.
        int denemeSayisi=0; // kullanici daha deneme yapmadigi icin sayiyi 0

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim.
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir degisken olusturduk.
        boolean tahminDogrumu = false;

        //Oyunun baslangicini yapalim.
        System.out.println("0 ile 100 arasi bir sayiyi tahmin etmeye calisin");

        //Dogru tahmin yapilincaya kadar donguyu devam ettirelim.

        do {
            //kullanicidan tahmin alalim
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen =scanner.nextInt();

            //sayaci bir artiralim
            denemeSayisi++;

            //tahmini kontrol edelim
            if (tahminEdilen<rasgeleSayi){ //sayi kullanicinin tahmininden buyukse ipucu verdik.
                System.out.println("Sayi daha buyuk ");

            } else if (tahminEdilen>rasgeleSayi) {
                System.out.println("Sayi daha kucuk");

            }else {
                tahminDogrumu=true; // dogru tahminde bulunulduysa degiskeni true olarak guncelledik
                System.out.println("Tebrikler , dogru tahmin!");
                System.out.println("Deneme sayisi : " + denemeSayisi);

            }


        }while (!tahminDogrumu);
        scanner.close(); // iyi bir kod standarti.















    }

}
