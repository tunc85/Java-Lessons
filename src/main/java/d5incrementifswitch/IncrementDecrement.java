package d5incrementifswitch;

public class IncrementDecrement {
    public static void main(String[] args) {
        //------------------Increment
        int a = 5;
        a = a + 2;
        System.out.println(a); //7

        a += 2; //ctrl + alt + 'L' ile formatlama(duzenleme) yapabilirsiniz. ( 7 ile aynı islem.)
        System.out.println(a);

        //----------------------Decrement(azaltma)
        int c = 10;
        c = c - 3; // c yi 7 yaptık.
        System.out.println(c);

        c -=4;
        System.out.println(c);

        //-------------------Carpma
        int d =6;
        d =d*2;
        System.out.println(d); //12

        d*=2;
        System.out.println(d);//24

        //------------Bolme
        int f=20;
        f=f/2;
        System.out.println(f);

        f/=2;
        System.out.println(f);

        //------------------1 ile Increment

        int e = 13;
        e=e+1;
        e += 1;
        e++;
        System.out.println(e);

        //----------------------1 Decrement(azaltma)

        int h = 15;
        h = h -1 ;
        h -= 1;
        h--;
        System.out.println(h);

        //---------------------- post increment (i++), pre increment (++i)

        int i =10;
        int k = i++;
        System.out.println(k); //10
        System.out.println(i); //11
        //Burada post increment kullandık ilk degeri gorur, atamasını yapar.

        int m = 15;
        int n =++m;
        System.out.println(n); //16
        System.out.println(m); //16
        //burada pre increment yaparak degeri  ilk olarak almasını daha  sagladik.

        //---------

        int p =17;
        int r=p--;
        System.out.println(p); //16
        System.out.println(r); //17

        int s =20;
        int t =--s;

        System.out.println(s); //19
        System.out.println(t); //19







































    }

}
