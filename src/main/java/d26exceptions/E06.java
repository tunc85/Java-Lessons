package d26exceptions;

public class E06 {
    public static void main(String[] args) {
        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak
        // kullanildiginda olusur

        String s="Java";
karakterSayisi(s); // 4
String t = "";
karakterSayisi(t); //0

        String u = null;
        karakterSayisi(u); // HATA Zaten olmayan birseyin uzunlugunu alamaz.

    }//main disi

    public static void karakterSayisi(String s){
        try {
            int a= s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("null degeriyle lenght methodunu kullanmayiz");

        }

    }
}
