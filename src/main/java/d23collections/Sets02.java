package d23collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //interview sorusu
        //ornek 1 : Ogrenci mail adreslerini natural order'da siralanmis olarak depolayiniz

        //mailler unique. set kullanalim. Hangi set yapisini kullanacagiz? Natural dedigi icin treeSet

        //System.nanoTime() yontemi genellikle performans olcumu icin kullanilir
        long t1=System.nanoTime();

        //1.yol : her elemanda siralama yapar - yavas

        TreeSet<String> studentMails= new TreeSet<>();
        studentMails.add("mahmut@gmail.com");
        studentMails.add("faruk@gmail.com");
        studentMails.add("coskun@gmail.com");
        studentMails.add("ldlld@gmail.com");
        studentMails.add("asd@gmail.com");
        studentMails.add("fdsf@gmail.com");
        studentMails.add("sadfsf@gmail.com");
        studentMails.add("safdf@gmail.com");
        studentMails.add("sdff@gmail.com");
        studentMails.add("sadfasdf@gmail.com");
        System.out.println(studentMails);
        //[asd@gmail.com, coskun@gmail.com, faruk@gmail.com, fdsf@gmail.com, ldlld@gmail.com,
        // mahmut@gmail.com, sadfasdf@gmail.com, sadfsf@gmail.com, safdf@gmail.com, sdff@gmail.com]

        long t2=System.nanoTime();

        //TreeSet'ler cok yavas. Biraz hizlandirabilir miyiz?
        //elemanlari eklerken en hizli olandan (HashSet)'ten yardim alalim

        //2.yol - Tavsiye edilir - Daha hizli
        HashSet<String> emails = new HashSet<>();
        emails.add("mahmut@gmail.com");
        emails.add("faruk@gmail.com");
        emails.add("coskun@gmail.com");
        emails.add("ldlld@gmail.com");
        emails.add("asd@gmail.com");
        emails.add("fdsf@gmail.com");
        emails.add("sadfsf@gmail.com");
        emails.add("safdf@gmail.com");
        emails.add("sdff@gmail.com");
        emails.add("sadfasdf@gmail.com");
        System.out.println(emails);
        //[sadfsf@gmail.com, faruk@gmail.com, fdsf@gmail.com, safdf@gmail.com,
        // mahmut@gmail.com, coskun@gmail.com, ldlld@gmail.com, sadfasdf@gmail.com, asd@gmail.com, sdff@gmail.com]

        //Bos bir TreeSet olsturalim ve consturctor'ina HashSet'i yazalim

        TreeSet<String> emailHsTs= new TreeSet<>(emails);
        System.out.println(emailHsTs);
        //[asd@gmail.com, coskun@gmail.com, faruk@gmail.com, fdsf@gmail.com, ldlld@gmail.com,
        // mahmut@gmail.com, sadfasdf@gmail.com, sadfsf@gmail.com, safdf@gmail.com, sdff@gmail.com]
        long t3=System.nanoTime();

        System.out.println(t2-t1);// treeSet 5066300
        System.out.println(t3-t2); // hashSet 372700









    }
}
