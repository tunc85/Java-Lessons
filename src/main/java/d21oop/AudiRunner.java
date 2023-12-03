package d21oop;

public class AudiRunner {
    public static void main(String[] args) {

          //Motor m = new Motor(); HATA - Interfacelerden object uretemezsiniz

        AudiA4 a4= new AudiA4();
        a4.turbo(); // Audi A4 turbo motor kullanir
        a4.analog(); // Audi A4 analog kilima kullanir
        a4.esp(); //  Audi A4 Esp fren sistemi kullanir
        a4.run(); // Audi A4 havayastigi calistirir


        // ODEV: A4 u olusturduk Ayni sekilde

        // Audi A4 havayastigi calistirir
        //ambiguity-belirsizlik ortaya cikmasin diye Java'ya hangi interface'deki run() methodunu
        //calistirmasini soyluyoruz
        ((Motor)a4).run();
        // Motor interfacesinden gelen run calisti



        //Motor. yapip fiyat'a ulastik buda static olmasinin ispati (5) nolu madde.
        //Motor.fiyat = 5000; // final ispati (5) nolu madde.

        System.out.println(Motor.fiyat2); // 300 motor interfacesinden gelen (6)
        System.out.println(Klima.fiyat2); // 200 klima interfacesinden gelen (6)
        System.out.println(Fren.fiyat2); // 100 fren interfacesinden (6)

        Motor.hiz(); // 7

        a4.guc(); // 7
















    }
}
