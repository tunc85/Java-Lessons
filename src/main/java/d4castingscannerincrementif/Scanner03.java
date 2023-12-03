package d4castingscannerincrementif;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input= new Scanner(System.in); //.useLocale(Locale.US); //Bu sayede double'da nokta kullanabilirim.
        System.out.println("Lutfen Iki Sayi Giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Toplam : " +(firstNumber+secondNumber));
        System.out.println("Bolme : " +(firstNumber/secondNumber));
        System.out.println("Carpma : " +(firstNumber*secondNumber));
        System.out.println("Fark : " +(firstNumber-secondNumber));


        }





         }

