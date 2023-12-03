package d26exceptions;

public class E05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 1;
        String s = "My Java";
        //getCharFromString(s, a, b);
        getCharFromString2(s,a,b);
    } //main disi

    //1.yol
    public static void getCharFromString(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Sifira bolme yapmayiniz " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanmayiniz " + e.getCause());
            //getCause() hatanin sebebini class'ta yukluyse verir, yoksa null verir
            //Olmayan index kullanmayiniz null
        }
    }
    //2.yol:
    public static void getCharFromString2(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Bir istisna olustu "+ e.getClass());
            //getClass() exception'in turunu verir


        }

    }


}