package d19static_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1= new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yalit turu : Benzin
        InstanceBlock3 car2 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yalit turu : Benzin
        InstanceBlock3 car3 =new InstanceBlock3("Kirmizi","Diesel");
        System.out.println("Araba rengi : "+ car3.color);
        System.out.println("Araba yakit turu : "+ car3.fuelType);

    }
}
