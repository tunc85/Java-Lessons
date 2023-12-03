package d8stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        //valueOf()methodu belirtilen String'i Double'ya cevirir.

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$",""); //"456.99" dolari manipule ettik ama string kaldi.
        laptop =laptop.replace("$", ""); // "875.99" dolari manipule ettik ama string kaldi.
        //turler arasi donusum yapmak icin valueOf()methodu kullanilir.

         Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice); //1332.98

        //----------------------------------------------

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC

        //trim() methodu bir String'deki bastaki ve sondaki bosluklari siler.
        //aradakileri silmez.

        //split() String'i istediginiz karakterden parcalamaya yarar.

        String name ="  ali cAN  ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); // A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        //char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0); // birden fazla bosluk olursa sasirma diye slash slash \\s+
        System.out.println(last); // C

        System.out.println(""+first+last); //AC  "" koyarak string yaptık.

        ///Ornek 3: Bir String’in belirli bir karakterinden baslayarak belirli
        // bir karaktere kadar tum karakterleri dynamic olarak aliniz //abc@gmail.com ===> gmail

        //1.yol : Hard Code tavsiye edilmez
        String a = "abc@gmail.com";
        System.out.println(a.substring(4,9));

        //2.yol: Dinamik
        //split() method'u icinde '.' kullandiginizda onune \\ koyunuz

        String company1= a.split("@")[1].split("\\.")[0];
        System.out.println(company1);

        //pattern yapilari arastirabilirsin

        //3.yol: Dinamik

        //indexOf() methodu spesifik bir karakterin ilk gorunumunun index'ini verir.
        //indexOf() olmayan karakterler icin -1 verir.

        int stratingIndex =a.indexOf("@")+1;
        //System.out.println(stratingIndex); //3
        int endingIndex = a.indexOf(".");
        //System.out.println(endingIndex);// 9

        String companyName = a.substring(stratingIndex,endingIndex);
        //burayada +1 yapabilirdik substring ozelliginden dolayi @'i almasın diye.
        System.out.println(companyName); // @gmail





























    }
}
