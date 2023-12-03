package d21oop;

public  abstract class Honda {

    public void music(){
        System.out.println("Pro"); // concrate isteyen kullansin
    }
    public abstract void engine(); // abstract zorunlu

}
      /*
      Abstraction(Soyut)
      Abstraction iki bolumden olusur.

      i) Abstract Class: // bodysiz method Abstract
      Kendisinden object olusturulmaz. Bazi class'lari obje olusturmak amaciyla degil,
      objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
      Baslangic degil, sonuctur.


/*
   1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.

   2)Body'si olan method'lara 'non-abstract' veya 'concrete' (somut)(bodysi olan) method denir

   3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.

   4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.

   5)Abstract class'lar hem 'abstract method' hem de 'concrete method' icerebilirler.

   6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler

   //7) Final methodlar, class’lar override edilemedigi icin, abstract olamazlar.(***“final” bir access modifier değildir. “final,” bir Java anahtar kelimesidir)

   //8 Abstract bir class’in abstract bir child’i olabilir ve abstract child parent’inin methodlarini override etmek zorunda degildir ama isterse de edebilir
       */
 //9) Abstract bir class private olamaz yoksa child’lari ona ulasip override edemez.

//soyutlama overriding yuzunden ortaya cikiyor









