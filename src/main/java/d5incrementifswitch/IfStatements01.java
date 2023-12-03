package d5incrementifswitch;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
    /*
    IF Turkce'de EGER demektir. Statements ise hukum bildiren ifade anlamina gelir.
    Bazi kodlari bazi sartlara gore aktive edebilmek icin kullanilir.
    if you work hard(condition), you will succeed(result).

     */
        if (3 < 5) {
            System.out.println("condition dogru if calsiti"); // condition dogru if calisti
        }

        //-----------------

        if (7 == 4 + 3) {
            System.out.println("condition dogru if calisti");
        }
        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana “Rakam” yazdirin

        int num = 7;
        if (num > -1 && num < 10) {
            System.out.println("Rakam");
        }

        //----------------------------------

        //Ornek 2:Sayi uc basamakli ise ekrana " sayi uc basamaklidir!" yazdirin.

        int n = 123;
        if (n > 99 && n < 1000) {
            System.out.println("Sayi uc basamaklidir");


        }


    }
}
