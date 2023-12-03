package d3datatypesconcatenationscanner;

public class WrapperClass {
    public static void main(String[] args) {

        //Java primitive data tiplerine yeni ozellikler(method)ekleyerek yeni bir yapi olusturdu.
        //Bu yapıya Wrapper class (sarmalayici sinif)denir.
        //En onemlisi girdigimiz primitive veriler uzerinde method kullaniminin yolunu acar.
        //Wrapper class'lar non-primitive'dir.

        //primitive :          char - boolean - byte - short - int - long - float - double.
        //wrapper class : Character - Boolean - Byte - Short - Integar - Long - Float - Double.

        int i =12;
        //i. yazinca method acilmaz.

        Integer k=12;
        //k. yazinca methodlar acilir. Burasi class ozelligindedir.

        //---------------------------------------------------

        //Unboxing: java'da otomatik olarak gerceklesir. Wrapper class'lardan primitive turlere donusumu ifade eder.

        //ornegin aritmetik islemler ve performans ihtiyaci icin primitive'ler daha iyidir.

        //Autoboxing: primitive veri turlerinin esdeger Wrapper class'lara donusturulmesidir.
        //Java bu islemi otomatik yapar.

        //ornek: primitive int'i wrapper Integar'a ceviriniz.(Autoboxing)

        int num=13;

        Integer wrapperNum=num;

        //ornek: Wrapper Byte'i primitive byte'a ceviriniz.(Unboxing)

        Byte s=19;
                byte primitiveS=s;






    }
}
