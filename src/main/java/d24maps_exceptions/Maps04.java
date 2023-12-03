package d24maps_exceptions;

public class Maps04 {
    public static void main(String[] args) {
        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

                /*HashMap ile HashTable arasindaki fark nedir?
        1)  a) HashMap non-synchronized'dir.Yani, birden fazla iş parçacığı aynı anda bir
        HashMap'e erişebilir. Aynı anda birden fazla müşteri hesap bilgilerine erişebilir.
        Bu, örneğin bir müşteri para çekerken, başka bir müşteri aynı anda hesaba para yatırırsa,
        hesabın bakiyesinin yanlış olmasına yol açabilir.(thread-safe de degildir)
        Ancak bu durumda senkronizasyon işlemleri manuel olarak yönetilmelidir.
        (programci Synchronized Bloklar, Lock ve Semapforlar gibi ozel yapilar kullanir.)

            b) HashTable thread-safe ve synchronized'dir
        ( yani aynı anda sadece bir iş parçacığı aynı Hashtable'i kullanabilir.
         kuyruk olusur ve hizmet suresi uzar)

        2) a)HashMap bir tane null key'e (unique olmali, 2 null olamazdi, ustune yazar) ve
                istediginiz kadar null value'a musaade eder
           b)Hashtable, anahtarlar ve değerler için null değerlerine izin vermez.
           Herhangi bir null değer eklemeye çalışırsanız, NullPointerException alırsınız.

        3) HashMap hizlidir, HashTable HashMap'e gore yavastir

        Not: HashMap'ler ve HashTable'lar entry'leri rastgele siralar*/


    }
}
