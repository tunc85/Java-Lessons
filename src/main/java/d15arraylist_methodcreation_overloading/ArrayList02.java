package d15arraylist_methodcreation_overloading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.
//           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
//           [12, 23, 10, 19] ==> 12 ve 10
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //Iki turlu sort() yapabiliriz.
        // 1-List icindeki sort (Java 8 sonrasi cikti)
        // 2- Collections icindeki sort() - Collections - yardimci class
        //Colections bir class'tir ve koleksiyonlarda kullanabilecegimiz bazi methodlari barindirir

        // Collections.sort(nums);  //class ismiyle cagirilan methodlara statik method denir
        //2yol
        nums.sort(null); // List'lerde dogal siralama icin null yazilmasi gerekir
        System.out.println(nums); // [10, 12, 19, 23]

        int minFark= nums.get(1)-nums.get(0); // minFark bizim kabulumuz
        for (int i = 1; i <nums.size() ; i++) { //1'den baslattik ki 1.den 0. yi cikaralim
            Math.min(minFark,nums.get(i)-nums.get(i-1));

        }
        System.out.println(minFark); // 2

        //Em kucuk farki hangi sayidan elde ettigimizi bulalim
        for (int i = 1; i <nums.size() ; i++) {
            //minFark'i hangi cikarma isleminde buldugumuzu arastiracagiz
            // ve o cikarma islemindeki sayilari konsola yazdiracagiz
            if (nums.get(i)-nums.get(i-1)==minFark){
                System.out.println(nums.get(i)+ "ve" + nums.get(i-1));
            }
        }









    }
}
