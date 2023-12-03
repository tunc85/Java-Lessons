package d19static_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public  String fuelType;

    //Instance block - Bu class'tan her object olusturuldugunda burasi calisir

    {
        color = "Siyah";
        fuelType="Benzin";
    }

    //Constructor
    public InstanceBlock3(){
        System.out.println("Araba rengi : " + color); // sadece yukaridan aldigini yazar default benzin siyah.
        System.out.println("Araba yakit turu : " + fuelType);
    }

    //Parametreli Constructor - default olarak siyah ve benzinle baslatmak istemezsek bunu kullanacagiz
//Constructer her calistiginda instance bloack calisacagi icin hep ayni deger atanacak.
//istisna durumlar icin parametreli constructer olusturduk  ve degeri obje olusturuken gonderdik.
//obje olusturmak istedigimizde once instance block calisip deger atamasi gerceklesek fakat sonrasinda
//constructer calisacak ve icinde deger guncellemesi olacak

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}
