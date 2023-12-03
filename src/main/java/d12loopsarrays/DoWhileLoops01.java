package d12loopsarrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //------------- while

        //baslangic degeri
        /*while (loop calisma kurali){
            //body icinde calisacak kodlar
            //artirma/azaltma
        }*/

        //---------------------do while
        //baslangic degeri
       /* do {
            //body icinde calisacak kodlar
            //artirma/azaltma

        }while ();*/

        //do while dongusu, dongu blogundaki kodun en az bir kere
        // calisacagindan emin olmak istedigimiz durumlarda kullanilir.

        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console’a yazdiriniz

        int i = 5;
        do {
            System.out.println(i);
            i--;

        }while (i>2);

        //----------------
        //while loop ile do while loop'un farki nedir?
        //while loop'ta loopun en basta kirilmasi mumkundur cunku kural kontrol edilir sonra islem yapilir.

        int k = 1;
        while (k<=1){
            System.out.println("Ben while loop'um");
            k++;

        }

        //-----------------------
        //do while loop'ta loop'un en basta kirilmasi mumkun degildir. once 1 kere calistirilir.
        int m = 1;
        do {
            System.out.println("Ben do while loop'um");
            m++;

        }while (m<1); // loop calisma durma yari yanlis olmasina ragmen calisti cunku dongu en son kiriliyor.





















    }

}
