package d16overloading_varargs_passbyvalue_constructors;

public class Car {
    /* 1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
    2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken, main methodu oluşturmanız gerekebilir.
    3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method'lu class olur. Adina da "runner" eklenir.*/

    /* 6 -----Constructor nedir?
    Classtan object olusturmamizi saglayan bolumdur.
    Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
    Bu constructor'lara "default constructor" denir.
    default constructor ===> Car ()
    Ama car class'i bize hep ayni degerleri gonderir. Bu class'i kullanip farkli degerler olusturabiliriz
    Kendini constructor'inizi olusturdugunuz zaman Java default constructor'i siler

    constructor nasiş olusturulur?
    Access Modifier + Class ismi + () + {}
    */
    /*Method ile Constructor arasindaki fark nedir? ********** Interview Sorusu
1)Methodlarda return type olur, constructorlarda olmaz
2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip objectler olusturabiliriz*/

    //1-variable'lar olusturalim (pasif ozellikler)

    String brand= "Honda";
    String model="Accord";
    int year =2023;
    boolean hybrid=true;

    //2- methodlar olusturalim (aktif ozellikler)

    public void haraket(){
        System.out.println(brand+" hizli haraket eder");
    }
    public void  dur(){
        System.out.println(brand+ " guvenli bir sekilde durur");
    }
    //3-DIKKAT : Bunlari olusturunca CarRunner (main'li) calistirici class'i olusturalim




    //7 - Parametreli constructor'lar olsturarak ayni class'tan farkli ozelliklere sahip objeler uretebiliriz

    //Access Modifier + Class ismi + () + {}

    public Car(String brand,String model,int year,boolean hybrid){
        this.brand =brand; // buradaki brand'i kullanma ben sana runnerdan gonderecegim.
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    //11- iki tane daha custom constructor olusturalim

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //10- toString methodu olusturalim


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
        //toString uretince olusturdugumuz objenin icerigini runner cşasstan artik okuyabiliriz.
    }
}

