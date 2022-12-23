package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

//      (Za vezbanje)
//      Napisati program koji ucitava niz stringova duzine N,
//      tako da ucitavanje elemenata u niz a bude obrnuto.
//
//      Primer:
//
//      Unesite N: 4
//      Unesite string: xxx1
//      Unesite string: xxx4
//      Unesite string: xxx6
//      Unesite string: xxx9
//
//      Niz a: xxx9, xxx6, xxx4, xxx1
////    Komentar: Stanje niza a u memoriji je:
////    a[0]="xxx9",
////    a[1]="xxx6",
////    a[2]="xxx4",
////    a[3]="xxx1",

        Scanner s = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite string: ");
            String string = s.next();
            a.add(0, string);
        }

        System.out.print("\nNiz a: ");

        for (int i = 0; i < a.size(); i++) {
            if (i == a.size() - 1) {
                System.out.print(a.get(i));
            } else {
                System.out.print(a.get(i) + ", ");
            }
        }

    }
}
