package d19static_oop;

public class HondaRunner {
    public static void main(String[] args) {
        Honda h= new Honda();
        //Honda, 2023, Bezin > Vehicle  obje icinden geldi
        //Sedan > Car class'tan geldi
        //Civic > Honda class'tan geldi
        //parametresiz constructor'lar

               /*
        Soru: Peki child bir class'ta Object olusturuldugunda Parent bunu nasil algiliyor da
        kendi constructor'unu calistiriyor?

        Cevap: super() cagrisi ile yapilir. Super çağrısı, bir child class'ın constructor'unda,
        parent class'in parametresiz constructor'unu çağırmak için kullanılan bir ifadedir.

        super() çağrısı, bir child class'ta bir object oluşturulduğunda, otomatik olarak çağrılır.
        Ancak, super() çağrısını manuel olarak da çağırabilirsiniz.
        Bunu yapmak için, super() ifadesini, child class'ın constructor'unun başında kullanabilirsiniz.
        Manuel olarak yazarsaniz parametreli constructor'lari da cagirabilirsiniz.

        Neden super cagrisi yapalim?

        1- super keyword'unu kullanirsaniz, hem parent class'in methodunu çağırabilir hem de bu
        methodun davranışını child class'in ihtiyacına göre değiştirebilirsiniz.

        2 - extends ise sadece miras almayı sağlar, ancak parent class'in methodlarını değiştirmez.
        */





    }
}
