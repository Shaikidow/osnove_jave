package d14_12_2022;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

//      (Za vezbanje) Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
//      tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//      Konkatenacija stringova u javi-> Koristan link: https://www.javatpoint.com/string-concatenation-in-java
//
//      Primer izvrsenja 1:
//      Unesite a: 10  -> # 10
//      Unesite b: -2   -> -2 # 10
//      Unesite c: -1   -> -1 -2 # 10
//      Unesite d: 9    -> -1 -2 # 10 9
//      String p ima vrednost = -1 -2 # 10 9
//
//      Primer izvrsenja 2:
//      Unesite a: 5
//      Unesite b: 4
//      Unesite c: 41
//      Unesite d: -1
//      String p ima vrednost = -1 # 5 4 41
//
//      Primer izvrsenja 3:
//      Unesite a: 11
//      Unesite b: 2
//      Unesite c: 7
//      Unesite d: 15
//      String p ima vrednost = # 11 2 7 15
//
//      Primer izvrsenja 4:
//      Unesite a: -11
//      Unesite b: -2
//      Unesite c: -7
//      Unesite d: 15
//      String p ima vrednost = -7 -2 -11 # 15

        Scanner s = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        String p = "#";

        System.out.print("Unesite a: ");
        a = s.nextInt();
        if (a < 0) {
            p = a + " " + p;
        } else {
            p = p + " " + a;
        }

        System.out.print("Unesite b: ");
        b = s.nextInt();
        if (b < 0) {
            p = b + " " + p;
        } else {
            p = p + " " + b;
        }

        System.out.print("Unesite c: ");
        c = s.nextInt();
        if (c < 0) {
            p = c + " " + p;
        } else {
            p = p + " " + c;
        }

        System.out.print("Unesite d: ");
        d = s.nextInt();
        if (d < 0) {
            p = d + " " + p;
        } else {
            p = p + " " + d;
        }

        System.out.print(p);

    }
}
