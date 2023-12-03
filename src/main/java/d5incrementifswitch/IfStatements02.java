package d5incrementifswitch;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        //1.yol:

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Cift sayi");

        }

        if (num % 2 != 0) { // num % 2 ==1 seklindede yazilabilir.
            System.out.println("Tek sayi");//kosul kontrolu calisti ama bodye giremedi o yuzden yazdirmadi.

        }

        //----------------------
        //if else Statemennts
        //else - aksi halde , degilse demektir.
        //condition dogruysa (true) if blogu, contion yanlissa (false) else blogu calisir.
        //if else 2 durumlu senaryolarda kullanilir.
        //2.yol: tavsiye edilir.

        if (num % 2 == 0) {
            System.out.println("Sayi cifttir");


        } else {
            System.out.println("Sayi tektir.");

        }


    }
}
