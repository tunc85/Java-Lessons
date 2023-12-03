package d17datetime_stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        /*
         1) "StringBuilder" classi da String ureten bir classtir.
         2) String class kullanarak String üretiriz, Java nicin StringBuilder classi da olusturdu?
         String class "immutable" (degistirilemez) String uretir,
         StringBuilder Class "mutable"(degistirilebilir) String üretir.
         3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
         "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
         4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
         StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
         5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
*/
        //immutable - degistirelemez  - String

        String s = "Java";
        String t= s + "x";
        String w = t + "?";

        String c1="Ali";
        String c2 =new String("Ali");

        String st1 = "abc";
        String str2 = "abc";

        String str3 = new String("abc");

        //String Builder - Mutable - degistirebilebilir

        //StringBuilder b = "Ali"; HATA

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);// Python

        sb1.append("!");
        System.out.println(sb1); // Python!


        //Odev : Bir String'i degistirdikten sonra  tekrar ayni String'e yuklersem orjinal deger degismez mi ?
        String a = "Money";
        a=a+" More";

        //Hayır, Java'da String sınıfı değiştirilemez (immutable) bir sınıftır. Yani bir kez oluşturulduktan sonra, içeriği değiştirilemez. Ancak, String üzerinde yaptığınız değişikliklerle yeni bir String nesnesi oluşturabilirsiniz.

        //Bu nedenle, a = a + " More"; ifadesi a değişkeninin değerini değiştirmez. Bunun yerine, "Money More" içeren yeni bir String nesnesi oluşturulur ve bu nesne a değişkenine atanır. Bu işlem sonucunda a değişkeninin orijinal değeri olan "Money" değişmez.

        //Eğer aynı String nesnesini değiştirmek istiyorsanız, StringBuilder veya StringBuffer gibi değiştirilebilir (mutable) sınıfları kullanabilirsiniz. Ancak, bu sınıfların kullanımı String sınıfına göre daha karmaşıktır ve performans avantajı sağlamak için genellikle büyük döngüler veya yoğun metin manipülasyonu durumlarında tercih edilir.

        //Java'da, "Money" değerini içeren bir String olan a değişkeni oluşturulduktan sonra, a = a + " More"; ifadesi çalıştığında yeni bir String nesnesi oluşur. Bu işlem, a değişkenini "Money More" değerine sahip yeni bir String nesnesine yönlendirir. Ancak, "Money" değerine sahip eski String nesnesi artık kullanılmaz hale gelir.

        //Bu örnekte, "Money" değerine sahip eski String nesnesi artık referans alınmadığından, garbage collector tarafından tespit edilip bellekten temizlenir. Programcılar genellikle bellek yönetimiyle doğrudan uğraşmak zorunda değiller, çünkü Java'nın garbage collector'ı otomatik olarak gereksiz nesneleri temizler.

        //Garbage collector, programın çalışma zamanında, artık referansı olmayan nesneleri tespit eder ve bunları bellekten kaldırır. Bu, geliştiricilere bellek yönetimi konusunda endişe etmeden daha odaklanabilecekleri bir programlama deneyimi sunar.


        //Orijinal değişmiyor. Yeni bir alan açılıyor. Orjinalin adresi yeniyi gösteriyor. Adressiz kalan orjinal siliniyor.












    }
}
