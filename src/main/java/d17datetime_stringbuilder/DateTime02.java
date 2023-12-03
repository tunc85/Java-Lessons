package d17datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        /*LocalTime Class ta kullanilan tarih saat formatlari

    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss ==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        //Anlik zamani nasil aliriz?

        //LocalTime kullanacagiz.

        //Ornek 1: now(), gecerli saat bilgisini alir.
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); // 22:13:38.430252

        //ornek 2:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve metni tarih ve saat nesnelerine çözmenize olanak tanır.

        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini biçimlendirmek için kullanılır.
        //format() method'u LocalTime'i String'e istedigimiz formatta cevirir

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        String formattedTime = dtf1.format(myCurrentTime);

        System.out.println(formattedTime); // 10:21 pm

        // ornek 3 : Date object'i formati

        LocalDate myCurrentDate = LocalDate.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        String formattedDate = dtf2.format(myCurrentDate);

        System.out.println(formattedDate); // 09-November-2023

        //ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); // 2023-11-10

        //Tokyo'da saat kac?
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo); // 04:46:43.373199900

        //Amsterdam'da ayin kaci
        LocalDate dateinAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateinAmsterdam); // 2023-11-09

        //---------------
        //ornek 5: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt); // 2023-11-09T22:51:22.264925900

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");

        String formattedLdt =dtf3.format(ldt);

        System.out.println(formattedLdt); // 09 * Nov * 2023 - 10 : 53 pm









    }
}
