package d26exceptions;

public class E07 {
    public static void main(String[] args) {
        //6) IllegalArgumentException,bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
        printAge(25); //25
        printAge(-3); //negatifi de yazdiriyor. Java burada hata olusturmaz. Biz ogretecegiz

    }//main disi

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Yasi negatif girmeyiniz");
            //exception'i ilan ettik ve geri cekildik. Burada programin kesinlikle durmasi isteniyordur
        } else {
            System.out.println(age);
        }

    }

}