package d21oop;

public class HondaRunner {
    public static void main(String[] args) {
        //Honda h = new Honda()  //Abstract bir class'tan object uretilemez

        Civic c = new Civic();
        c.engine(); // Gas 1.6 Eco

        Accord d = new Accord();
        d.engine(); //Turbo 2.0
        d.music(); // Pro hondadan inheritance ile geliyor dogrudan direk kullandi

        //Inheritance(extend keyword) ile parent-child iliskisi olusturdugumuzda; child classs, parent class'daki private haric butun variable ve methodlari isterse kullanabilir.
        //Boyle bir durumda eger parent class'daki bir methodun, child class tarafindan kullanilmasini sart kosmak istiyorsak; Parent Class'a abstraction keyword'u ekleriz ve bu class'da abstracion ifadesi olan ve body'siz method olustururuz. artik bu method'u child class'da kullanmak saert olur.
        //not:parent-child class iliskisini (extends) unutma.
        //parent class'da abstraction unutma
        //parent'dan obje olusturulamaz
        //abs. method body'siz olur

        }

    }

