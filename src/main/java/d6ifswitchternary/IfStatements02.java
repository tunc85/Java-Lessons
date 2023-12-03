package d6ifswitchternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        /*Ornek 1:Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici    Cumartesi ==> Hafta sonu*/

        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");

        String gunIsmi = input.next();

        //equals() iki String'in birbirinin aynisi olup olmadigini kontrol eder.
        //equels() methodu true veya false return eder. boolean
        //equels() methodu buyuk kucuk harfe duyarlıdır.
        //gunIsmi.equalsIgnoreCase() methodu' ile buyuk kucuk duyarsizdir.
        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");
        boolean haftaIcı = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");
        if (haftaSonu) {
            System.out.println("Hafta sonu");
        } else if (haftaIcı) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }




















    }
}










