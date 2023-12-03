package d16overloading_varargs_passbyvalue_constructors;

public class Varargs {
    public static void main(String[] args) {
        //Variable arguments - degisken sayida argumanlar
        int sonuc = toplama(3,7,10,10);
        System.out.println(sonuc); //30

        /* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
        Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

        Varargs, aşağıdaki kurallara tabidir:

        1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
        ==>veri tabani surekli veri kabul eder ve diger parametreye gecemez.
        Main ici toplama(int... a, int... b) olmaz. toplama(int b, int... a) olur
        2- Varargs arka planda Array yapisini kullanir
        3- Varargs parametre, bir primitive veri tipi veya
        non-primitive(referans) tipi olabilir.
        4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
        5- Varargs parametre, sıfır argüman alabilir. Main ici toplama(); olabilir*/


    }// main disi

    //ornegin manager toplama yapan bir method istedi
/*    public static int toplama(int a, int b){
        return a + b;
    }
    public static int toplama(int a, int b, int c){
        return a + b + c;
    }*/

    public static int toplama( int... a){ //3 nokta koydugumuz da Java varargs kabul eder varags sonda olmalidir!
        int sum = 0;

        for (int w : a){ //coklu veri geleceginden for each ile karsiladik
            sum = sum + w;
        }
        return sum;


    }
}//clas sonu
