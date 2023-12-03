package d3datatypesconcatenationscanner;

public class Concatenation {
    public static void main(String[] args) {
        //ornek : Bir String ve iki variable olusturun.
        //String degeri ile int'lerin toplamini consola yazdirin.
        //Java da “+” sembolu iki sayi arasinda kullanilirsa “toplama islemi” olur
        //Java da “+” sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa “concatenation” islemi olur
        //“concatenation” islemi birlestirme yapar
        //Note: Concatanetion islemlerinde java matematikteki islem onceligini kullanir

        String t = "elma ";
                String m = "curuk ";
                        String l ="cikti ";
                        int sayi =23;
                                int sayi2=17;
        System.out.println(t+l+m+(sayi+sayi2));
        System.out.println(m+t+l+(sayi+sayi2));
        System.out.println(t+m+l+(sayi+sayi2));
        System.out.println(m+t+l+(sayi+sayi2));





    }
}
