package d22collections;

import java.util.*;

public class LinkedList01 {
    public static void main(String[] args) {
        /*Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
bir class'lar ve interface'ler kümesidir.

—Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
        Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
        Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
        Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
        Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

—Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
        Verileri verimli bir şekilde depolamak
        Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
        Verileri güvenli bir şekilde depolamak*/

        ArrayList<String> list1= new ArrayList<>();
        List<String> list2= new ArrayList<>();
        Collection<String> list3 = new ArrayList<>();


        //List<String> list4 = new List(); //HATA- Constructor tarafina interface (List) yazamazsiniz, object uretmezler



       /*LinkedList: Bağlı bir listedir.

       LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
       LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
        ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/




        LinkedList<String> myList= new LinkedList<>();

        //1- add() Listeye bir eleman ekler

        myList.add("Selam");
        myList.add("Hello");
        myList.add("Ola");
        myList.add("Heola");
        System.out.println(myList); // [Selam, Hello, Ola, Heola]

        myList.add(2,"Burasi ortasidir");

        System.out.println(myList); // [Selam, Hello, Burasi ortasidir, Ola, Heola]

        //--------------------------------------------

        //2- add(int index, E element); belirtilen konuma bir oge ekler

        myList.add(2,"Bueno"); // Burasi ortasidir 'yi oteledi
        System.out.println(myList); //[Selam, Hello, Bueno, Burasi ortasidir, Ola, Heola]

        //-------------------------------------------------

        //3- addFirst(E e): Listenin basina oge ekler
        myList.addFirst("BonApetit" );
        System.out.println(myList); // [BonApetit, Selam, Hello, Bueno, Burasi ortasidir, Ola, Heola] basa ekledik

        //-----------------------------------------------

        //4- addLast(E e): Listenin sonuna bir öğe ekler.
        myList.addLast("Last hi");
        System.out.println(myList); // [BonApetit, Selam, Hello, Bueno, Burasi ortasidir, Ola, Heola, Last hi]

        //----------------------------------------------

        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur
        myList.remove(4);
        System.out.println(myList); // Burasi ortasidir ' i sildi.
        //yada
        boolean m1=myList.remove("BonApetit"); // true buyuk kucuk harfe duyarli
        System.out.println(myList); // BonApetit silindi [Selam, Hello, Bueno, Ola, Heola, Last hi]

        //------------------------------------------------------

        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.add("Merhaba");
        myList.add(3,"Merhaba");
        System.out.println(myList); // [Selam, Hello, Bueno, Merhaba, Ola, Heola, Last hi, Merhaba]

        myList.removeFirstOccurrence("Merhaba");
        System.out.println(myList); // [Selam, Hello, Bueno, Ola, Heola, Last hi, Merhaba]

        //----------------------------------------------------------------

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.removeLastOccurrence("Merhaba");
        System.out.println(myList); // [Selam, Hello, Bueno, Ola, Heola, Last hi]

        //-----------------------------------------------------

        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.

        String s =myList.peek();
        System.out.println(s); // Selam
        System.out.println(myList); // [Selam, Hello, Bueno, Ola, Heola, Last hi]listeden kaldirmaz sadece gormek icin

        //-----------------------------------------------------

        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.

        System.out.println(myList.poll());
        System.out.println(myList); // [Hello, Bueno, Ola, Heola, Last hi]

        //------------------------------------

        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(myList.element()); // Hello
        System.out.println(myList); // [Hello, Bueno, Ola, Heola, Last hi]


        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)

        System.out.println(myList.pop()); // Hello
        System.out.println(myList); // [Bueno, Ola, Heola, Last hi]


    }
}
