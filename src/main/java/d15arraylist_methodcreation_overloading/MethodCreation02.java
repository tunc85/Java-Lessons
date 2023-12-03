package d15arraylist_methodcreation_overloading;

public class MethodCreation02 {
    public static void main(String[] args) {
         //Ornek 1 : calistirma
        int sonuc1=carpma(4,4);
        System.out.println("sonuc1 = " + sonuc1); //  sonuc1 = 16

        //Ornek 2 calistirma
        int sonuc2=carpTopla(4,4,2);
        System.out.println("sonuc2 = " + sonuc2);

        //Ornek 3 calistirma
        write("Selam");

    }

    //ornek 1 : iki sayiyi carpan bir method olusturunuz
    protected static int carpma(int a , int b ){
        //protected bu class'tan erisilebilir
        //bir de sadece miras alinan class'lardan erisilebilir
        // birde packace icinden erisilebilir
        return a*b;

    }
    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz
    private  static int carpTopla(int a , int b , int c ){
        //private sadece bu classtan erisilebilir
        return a*b+c;

    }
    public static void write (String w){
        System.out.println(w);
    }
    //eger bir method yeni bir data uretmiyor ise return type'i void olur
    //yani body icine return yazilmaz
    //Not: Method parantezi icine yazilanlara parametre,
    //method call'da (main icinde) kullanilan degerlere arguman (carpma(3, 5)) denir







}


