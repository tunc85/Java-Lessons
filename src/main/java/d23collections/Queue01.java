package d23collections;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {

        /* Java'da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
    Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
    Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

    İşte gerçek dünyadan birkaç örnek:
 Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
     bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
     İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.
 Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
     Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.
 Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
     İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.
 Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
     Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

Queue interface'i, LinkedList(hem de List interface'ini kullanabilir) ve PriorityQueue gibi farklı sınıflar tarafından uygulanabilir. */

        //-------------------------------

        //Queue nasil olusturulur?

        Queue<String> depo = new LinkedList<>();

        //Queue'ya eleman ekleme
        //1) add(); Belirtilen ögeyi kuyruga ekler.

        depo.add("sut");
        depo.add("yumurta");
        depo.add("peynir");
        depo.add("et");
        System.out.println(depo); // [sut, yumurta, peynir, et] insertion order Linked list ozelligiyle yazdirdi

        //2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür.
        // Kuyruk boşsa bir istisna fırlatır. (market senaryo)

        String s = depo.remove();
        System.out.println(s); // sut
        System.out.println(depo); //  [yumurta, peynir, et]

        //3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
        String p = depo.peek();
        System.out.println(p); // yumurta
        System.out.println(depo); // [yumurta, peynir, et]

        //4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.



        depo.clear(); // ilk sil sonra gor , direk depo.clear().soutv yapamayiz
        System.out.println(depo); // []

        //5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner (banka, hastane senaryo)
        System.out.println(depo.poll()); // null

        //6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.

        //depo.element();
        //System.out.println(depo); // NoSuchElementException  HATA cunku queue bos.

        //-------------------------

        // PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
        // öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
        // Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.

        //Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
        // sayılar kendi doğal sıralamalarına göre önceliklendirilir.

        //Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
        // priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
        // Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.

        //siralama garantisi icin Comparator(Lambda) objesi kullanilir

        //PriorityQueue nasil olusturulur?

        PriorityQueue<String> acilSirasi= new PriorityQueue<>();
        //add() : Belirtilen ogeyi kuyruga ekler
        acilSirasi.add("Mehmet");
        acilSirasi.add("Mahmut");
        acilSirasi.add("Ekrem");
        acilSirasi.add("Serkan");
        acilSirasi.add("Oya");
        System.out.println(acilSirasi); // [Ekrem, Mehmet, Mahmut, Serkan, Oya] - karisik sira

        //-------------------------
        //Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
        // ve çıkartmaya izin veren bir veri yapısıdır.
        // Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

        //Deque nasil olusturulur?

        Deque<String> myDeque = new LinkedList<>();
        myDeque.add("Selam");
        myDeque.add("Merhaba");
        myDeque.add("Olaaaaa");
        myDeque.add("Olsa");
        myDeque.add("Oladsdsd");
        System.out.println(myDeque); // [Selam, Merhaba, Olaaaaa, Olsa, Oladsdsd] insertation order.

        myDeque.addFirst("Ali");
        System.out.println(myDeque); // [Ali, Selam, Merhaba, Olaaaaa, Olsa, Oladsdsd]

        for (String w :myDeque){
            System.out.println(w);

        }
        //Ali
        // Selam
        //Merhaba
        // Olaaaaa
        //Olsa
        // Oladsdsd
        System.out.println("--------------------");

        myDeque.addLast("Sonuncu ek ");
        for (String w : myDeque){
            System.out.println(w);
        }

        //Ali
        //  Selam
        //Merhaba
        //Olaaaaa
        //Olsa
        //Oladsdsd
        //Sonuncu ek

        System.out.println("--------------------");

         myDeque.removeFirst();
        System.out.println(myDeque); // [Selam, Merhaba, Olaaaaa, Olsa, Oladsdsd, Sonuncu ek ]

        System.out.println("--------------------");


        //ArrayDeque Java’da çift yönlü kuyruk (double-ended queue) yapısını temsil eder
        // (verilerini bir dizi (array) içinde saklar) ve Deque arayüzünü uygular.
        // Bu yapı, hem baştan hem sondan ekleme ve çıkarma işlemlerine izin verir.
        // ArrayDeque, LinkedList’e kıyasla daha yüksek performans sunar çünkü içerikleri için dizi tabanlı
        // bir yapı kullanır.ArrayDeque, başta ve sonda hızlı ekleme/çıkarma işlemleri için idealdir.
        //ArrayDeque dinamik bir yapiya sahiptir


        ArrayDeque<String> ad= new ArrayDeque<>();
        ad.addFirst("ilk");
        System.out.println(ad); // [ilk]

        ad.addLast("Son");
        System.out.println(ad); // [ilk, Son]
        ad.removeFirst();
        System.out.println(ad); // [Son]

        String son = ad.removeLast();
        System.out.println(ad); // []





























    }
}
