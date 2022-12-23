package d20_12_2022;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

//      Napisati program koji ucitava RIMSKE brojeva od korisnika
//      i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ.
//
//      Primer izvrsenja:
//
//      Unesite rimski broj: X
//      Arapski: 10
//      Unesite rimski broj: C
//      Arapski: 50
//      Unesite rimski broj: D
//      Arapski: 500
//      Unesite rimski broj: M
//      Arapski: 1000
//      Unesite rimski broj: I
//      Arapski: 1
//      Unesite rimski broj: KRAJ
//      Kraj programa.

        Scanner s = new Scanner(System.in);

        String roman = "rimski broj";

        while (!roman.equals("KRAJ")) {

            System.out.print("Unesite rimski broj: ");
            roman = s.next();

            if (roman.equals("I")) {
                System.out.println("Arapski: 1");
            } else if (roman.equals("V")) {
                System.out.println("Arapski: 5");
            } else if (roman.equals("X")) {
                System.out.println("Arapski: 10");
            } else if (roman.equals("L")) {
                System.out.println("Arapski: 50");
            } else if (roman.equals("C")) {
                System.out.println("Arapski: 100");
            } else if (roman.equals("D")) {
                System.out.println("Arapski: 500");
            } else if (roman.equals("M")) {
                System.out.println("Arapski: 1000");
            }

        }

        System.out.print("Kraj programa.");

    }
}
