package d11loops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {
        //nested for - icice
        /*
ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
            Week: 1
              Day: 1
              Day: 2
              Day: 3
              .....
            Week: 2
              Day: 1
              Day: 2
              Day: 3
              ....    */

        /*for (int i = 1; i <5 ; i++) { //bir ayda 4 hafta
            System.out.println("Week:"+i);

            System.out.println("  Day: 1");
            System.out.println("  Day: 2");
            System.out.println("  Day: 3");
            System.out.println("  Day: 4");
            System.out.println("  Day: 5");
            System.out.println("  Day: 6");
            System.out.println("  Day: 7");

        }*/

        for (int i = 1; i < 3; i++) {
            System.out.println("Week:"+i);


            for (int j = 1; j <3 ; j++) {
                System.out.println("   Day:" + j);

            }

        }

        System.out.println("----------------------");

        /* Ornek 2:
         Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

          X X
          X X    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir satir sayisini giriniz");
        int satir =input.nextInt();

        System.out.println("Lutfen bir sutun sayisini giriniz");
        int sutun = input.nextInt();



        for (int i = 1; i <= satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("X ");

            }
            System.out.println();
            //satir yan yana prit ile yazdirildigindan pointer'i bir sonraki satira almak icin sout yazdik.

        }

        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */

        //satir sayisi 4 sutun degisten her satirda 1 artiyor.






















    }
}
