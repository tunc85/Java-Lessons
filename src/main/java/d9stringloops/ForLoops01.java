package d9stringloops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Loop döngü demektir.
        //loop'lar tekrar eden kodlama islerini kolaylastirmak icin kullanilir.
        // Tum kod parcalarini belirli bir kural dongusu icinde tekrarlamak icin kullanilir.

        //1- for loop
        //2- while loop
        //3- do while loop
        //4-for each loop

        //1- for loop
        //for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak için kullanılan bir dongudur
        //Döngü başlangıcında kullanılan degiskene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.
        // for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır

        //ornek 1: console'a 4 kere "Hİ!" yazdirin

        //1. yol tavsiye edilmez
        System.out.println("Hİ!");
        System.out.println("Hİ!");
        System.out.println("Hİ!");
        System.out.println("Hİ!");

        System.out.println("----------------");

        //2. yol
         /* for (Baslangic Degeri ; Loop Calisma Kurali ; Artirma/Eksiltme){
            //Calisacak kodlar
        }
        */
        for (     int i =1      ;              i< 5  ;                i++  ){
            System.out.println("Hİ!");

        }


        //------------------
        //Ornek 2: 20(dahil) den 3(dahil) e kadar tum sayilari console'a yazdirin

        for (int i =20; i>2   ;  i--){
            System.out.println(i);

        }
        System.out.println("-------------------");

        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console’a yazdiriniz(3 ve 20 dahil)


        for (int i = 3; i <21 ; i++  ){
            if (i%2==0){
                System.out.println(i);

            }

        }

        //27'den 3'e kadar tum tek sayilari console'a yazdiriniz. (27 ve 3 dahil)

        for (int i=27; i>1 ;  i-- ){
            if (i%2!=0){
                System.out.println(i);//
            }
        }
        // 27 dahil olmak uzere dongumuzu yani kontrol etmek yazdirmak istedigimiz alani kural halinde for kismina yazdik.
        // 27 dahil basladik ve 1 bitis olmak uzere 3 u dahil edebilmek icin 1 yazdik 2 de yazabilirdik.
        //eger bir sayi %2 ye bolumu = 0 yani cift sayi cikiyorsa sayi cift sayidir.
        //cift sayi degil tek sayi istendigi icin i%2!=0 (çift sayiya esit degilse) if kurali uyguladik.
        //boylelikle sadece tek sayilari alarak 27 den 1 e kadar herseyi tek sayi halinde loopladik.









    }
}
