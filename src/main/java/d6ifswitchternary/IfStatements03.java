package d6ifswitchternary;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //nested = ic ice gecmis
        /*Ornek 1: Kullanicidan 0'dan kucuk deger giremiyecek sekilde verileri aldiktan sonra;

Eger calisan kadin ise;
60 yasindan buyukse "Emekli Olabilir "yazdirin



Eger calisan erkek ise;
65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz */

        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyetinizi Girin");
        String gender = input.next(); // next() tek kelime alir.

        System.out.println("Yasinizi Girin");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Lutfen 0'dan kucuk yas girmeyiniz");
        } else if (gender.equalsIgnoreCase("Kadin")) {
            if (age < 18) {
                System.out.println("Calisamaz");
            } else if (age < 60) {
                System.out.println("Calisabilir");

            } else {
                System.out.println("Emekli OLabilir");
            }
        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age < 16) {
                System.out.println("Calisamaz");
            } else if (age < 65) {
                System.out.println("Calisabilir");

            } else {
                System.out.println("Emekli Olabilir.");
            }
        } else {
            System.out.println("Sizin icin farkli bir tanimlama yapilmadi");
        }
        //icteki ifte calismamali, calismali, emekli olmali
        //erkekler içn 16 yaş altı çalışmayacak
        //kadınlar için 18 yaş altı çalışmamalı
        //çalışmamalı, çalışmalı, emekli olmalı 3 koşul bakacağız
        //iç içe if lerde if, else if, else kullanacağız

    }
}
