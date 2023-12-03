package d27exceptions_enum_iterators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) {

        //Not: Bir onceki uygulamamizda method signature icine exception eklemesi yaptik.
        // Bu seferde try-catch kullanalim

        try {
            FileInputStream fis = new FileInputStream("src/main/java/d26exceptions/file.txt"); //yazinca dosya yolu parantez icine yazilir.
            int k = 0;
            while ((k = fis.read()) != -1){ //compile time exception, java, ya okuyamazsam diyor

                System.out.print((char) k); //Java kolaydir
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        /*
        1) FileNotFoundException ve IOException Compile Time Exception'lardir. Yani kodu yazarken hata aliriz.
        2) IOException Class, FileNotFoundException class'in parent'idir yani
            istenirse FileNotFoundException yerine IOException'da kullanilabilir
        3) IOException ve FileNotFoundException beraber kullanilacak ise FileNotFoundException üstte olmalidir
         */

    }
}
