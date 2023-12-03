package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen Sifrenizi Giriniz");

        String pwd = input.nextLine();

        // En az 8 karakter olsun
        boolean lenghtConrol =pwd.length() >7;
        //System.out.println("lenghtConrol = " + lenghtConrol);

        //Space karakteri password'de olmasin (space haric her seyi sil)
        boolean spaceControl=pwd.replaceAll("[^ ]" , "").isEmpty();
        //boolean spaceControl=pwd.replaceAll("[^ ]" , "").length()==0; // istenmeyen durum ==0;
        //System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl= pwd.replaceAll("[^A-Z]","").length()>0; //olsun dediklerimizde >0
        //System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length()>0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean numberControl =pwd.replaceAll("[^0-9]", "").length()>0;
        //System.out.println("numberControl = " + numberControl);

        boolean symbolControl = pwd.replaceAll("[^\\p{Punct}]", "").length()>0;
        System.out.println("symbolControl = " + symbolControl);

        boolean isValid = lenghtConrol && spaceControl && upperCaseControl && lowerCaseControl && numberControl && symbolControl;


        if (isValid){
            System.out.println("Gecerli bir sifre girdiniz");

        }else {
            System.out.println("Gecersiz Sifre girdiniz");

        }


        //En az 1 tane sembol icermeli (ODEV)


    }
}
