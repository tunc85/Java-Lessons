package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Ornek 1:
Kullanıcıdan;
i)Adini ve Soyadini
ii)Yaşını
iii)Boyunu
iv)kilosunu
v) medeni durumunu girmesini isteyin.

Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/
        Scanner input = new Scanner(System.in);


        System.out.println("Adinizi ve Soyadinizi Giriniz");
        String fullname =input.nextLine(); //nextLine(); methotodu ile birden fazla kelime girdisi alabilirsiniz.

        System.out.println("Yasinizi Giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu Giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu Giriniz");
        short weight = input.nextShort();

        System.out.println("Medeni Durumunuz");
        String marritalStatus =input.next(); //Kullanicidan tek kelimelik String aldik.(next) ile

        System.out.println("fullname = " + fullname);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("marritalStatus = " + marritalStatus);






    }
}
