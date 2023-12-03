package d9stringloops;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

       1-Parola Boş olmamalıdır, en az bir karakter icermelidir.
       2-Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
       3-Başında ve sonunda boşluk olmamalıdır.*/

        //Not: empty sadece hicligi kontrol eder (true verir).
        // blank ise hem hicligi hemde space'i kontrol eder(true verir)




        //----------------------------------------------------------
        //1-Parola Boş olmamalıdır, en az bir karakter icermelidir.

        String pwd= "";

        boolean first = pwd.isEmpty();
        //System.out.println(first); // false

        //2-Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı,
        // space harici karakterlerde bulunmalidir.

        boolean second =pwd.isBlank();
        //System.out.println(second); // false

        //3-Başında ve sonunda boşluk olmamalıdır.

        boolean third= pwd.trim().equals(pwd);
        //System.out.println(third); // true

        if (first){
            System.out.println("Parola bos bırakılamaz");

        }
        if (second){
            System.out.println("Parola bos birakilmamali ve bosluk harici karakterler de bulunmamalidir");

        }
        if (!third){
            System.out.println("Parolanin basinda yada sonunda bosluk birakilmamalidir");

        }
























    }
}
